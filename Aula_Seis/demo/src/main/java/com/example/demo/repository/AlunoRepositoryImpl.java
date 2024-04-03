package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import com.example.demo.modelo.Aluno;
import java.util.List;

@Repository
@Transactional
public class AlunoRepositoryImpl implements AlunoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Aluno> findAll() {
        return entityManager.createQuery("SELECT a FROM Aluno a", Aluno.class)
                .getResultList();
    }

    @Override
    public Aluno findById(Long id) {
        return entityManager.find(Aluno.class, id);
    }

    @Override
    public Aluno save(Aluno aluno) {
        if (aluno.getId() == null) {
            entityManager.persist(aluno);
        } else {
            entityManager.merge(aluno);
        }
        return aluno;
    }

    @Override
    public Boolean delete(Long id) {
        Aluno aluno = findById(id);
        if (aluno != null) {
            entityManager.remove(aluno);
            return true;
        }
        return false;
    }

    @Override
    public Aluno update(Aluno aluno) {
        return entityManager.merge(aluno);
    }
}
