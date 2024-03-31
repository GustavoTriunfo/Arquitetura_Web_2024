package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Aluno;
import com.example.demo.repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements AlunoService{
     private final AlunoRepository alunoRepository;

    /*
    A injeção de dependência está evidenciada no construtor da classe TaskService. Aqui, TaskService depende de
    TaskRepository, que é passado como um parâmetro no construtor. O Spring será responsável por injetar uma instância
    de TaskRepository quando criar uma instância de TaskService.
     */
    
    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno getAlunoById(Long id) {
        return alunoRepository.findById(id);
    }

    @Override
    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno updateAluno(Aluno aluno) {
        return alunoRepository.update(aluno);
    }

    @Override
    public Boolean deleteAluno(Long id) {
        return alunoRepository.delete(id);
    }
    
}
