package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.modelo.Aluno;
import com.example.demo.service.AlunoService;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController 
{
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping("/adicionarAluno")
    public Aluno adicionarAluno(@RequestBody Aluno aluno) {
        return alunoService.createAluno(aluno);
    }

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunoService.getAllAlunos();
    }

    @GetMapping("buscarAluno/{id}")
    public Aluno buscarAlunoPorId(@PathVariable Long id) {
        return alunoService.getAlunoById(id);
    }

    @PutMapping("atualizarCadastro/{id}")
    public ResponseEntity<Aluno> atualizarAluno(@PathVariable Long id, @RequestBody Aluno alunoAtualizado) {
        Aluno aluno = alunoService.getAlunoById(id);
        if (aluno != null) {
            aluno.setNome(alunoAtualizado.getNome());
            aluno.setCurso(alunoAtualizado.getCurso());
            
            alunoService.updateAluno(aluno);
            return new ResponseEntity<>(aluno, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("deletarCadastro/{id}")
    public ResponseEntity<Void> excluirAluno(@PathVariable Long id) {
        if (alunoService.deleteAluno(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
