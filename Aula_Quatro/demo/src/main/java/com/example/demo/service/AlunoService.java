package com.example.demo.service;

import com.example.demo.modelo.Aluno;

import java.util.List;

public interface AlunoService {
    
    List<Aluno> getAllAlunos();
    Aluno getAlunoById(Long id);
    Aluno createAluno(Aluno task);
    Aluno updateAluno(Aluno aluno);
    Boolean deleteAluno(Long id);
}
