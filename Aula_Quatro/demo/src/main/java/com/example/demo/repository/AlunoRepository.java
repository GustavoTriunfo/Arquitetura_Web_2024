package com.example.demo.repository;

import java.util.List;
import com.example.demo.modelo.Aluno;

public interface AlunoRepository {
    List<Aluno> findAll();
    Aluno findById(Long id);
    Aluno save(Aluno aluno);
    Aluno update(Aluno aluno);
    Boolean delete(Long id);
}