package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Aluno;
import java.util.List;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {

    private final JdbcTemplate jdbcTemplate;

    public AlunoRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Aluno> findAll() {
        return jdbcTemplate.query("SELECT * FROM aluno", (resultSet, rowNum) ->
            new Aluno(
                resultSet.getLong("id"),
                resultSet.getString("nome"),
                resultSet.getString("curso"),
                resultSet.getString("email"),
                resultSet.getInt("idade"),
                resultSet.getString("endereco")
            )
        );
    }

    @SuppressWarnings("deprecation")
    @Override
    public Aluno findById(Long id) {
        String query = "SELECT * FROM aluno WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{id}, (resultSet, rowNum) ->
            new Aluno(
                resultSet.getLong("id"),
                resultSet.getString("nome"),
                resultSet.getString("curso"),
                resultSet.getString("email"),
                resultSet.getInt("idade"),
                resultSet.getString("endereco")
            )
        );
    }

    @Override
    public Aluno save(Aluno aluno) {
        if (aluno.getId() != null) {
            String insertQuery = "INSERT INTO aluno (id, nome, email, idade, curso) VALUES (?, ?, ?, ?, ?)";
            jdbcTemplate.update(insertQuery, aluno.getId(), aluno.getNome(), aluno.getEmail(), aluno.getIdade(), aluno.getCurso());
        } else {
            String updateQuery = "UPDATE aluno SET nome = ?, email = ?, idade = ?, curso = ? WHERE id = ?";
            jdbcTemplate.update(updateQuery, aluno.getNome(), aluno.getEmail(), aluno.getIdade(), aluno.getCurso(), aluno.getId());
        }
        return aluno;
    }

    @Override
    public Boolean delete(Long id) {
        String deleteQuery = "DELETE FROM aluno WHERE id = ?";
        return jdbcTemplate.update(deleteQuery, id) > 0;
    }

    @Override
    public Aluno update(Aluno aluno) {
        String updateQuery = "UPDATE aluno SET nome = ?, email = ?, idade = ?, curso = ? WHERE id = ?";
        jdbcTemplate.update(updateQuery, aluno.getNome(), aluno.getEmail(), aluno.getIdade(), aluno.getCurso(), aluno.getId());
        return aluno;
    }
}
