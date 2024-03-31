package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Aluno;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository{

    private final List<Aluno> alunos = new ArrayList<>();
    private Long nextId = 1L;
    /*
Esta anotação é usada para indicar que a classe é um componente de acesso a dados (repositório).
Ela informa ao Spring que a classe anotada como @Repository é responsável por interagir com a fonte de dados, como um
banco de dados, fornecendo operações CRUD (create, read, update, delete) para uma entidade específica.
 */

    

    public AlunoRepositoryImpl() {
      
        alunos.add(new Aluno(1L, "alucard", "Biologia", "Alucard@Email", 118, "castlevania"));
        alunos.add(new Aluno(2L, "Dracula", "Biologia", "dracula@email",1000, "castlevania"));
        alunos.add(new Aluno(3L, "vitor", "matematica", "vitor@email", 17, "sorocaba"));

        nextId = 4L; 
    }

    @Override
    public List<Aluno> findAll() {
        return alunos;
    }

    @Override
    public Aluno findById(Long id) {
        return alunos.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Aluno save(Aluno aluno) {
        if (aluno.getId() == null) {
            aluno.setId(nextId++);
            alunos.add(aluno);
        } else {
            alunos.removeIf(t -> t.getId().equals(aluno.getId()));
            alunos.add(aluno);
        }
        return aluno;
    }

    @Override
    public Aluno update(Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(aluno.getId())) {
                alunos.set(i, aluno);
                return aluno;
            }
        }
        return null; 
    }

    @Override
    public Boolean delete(Long id) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId().equals(id)) {
                alunos.remove(i);
                return true; 
            }
        }
        return false; 
    }

}
