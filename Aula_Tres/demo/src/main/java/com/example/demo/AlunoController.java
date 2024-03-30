package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
@SpringBootApplication
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();

    @PostMapping("/adicionarAluno")
    public Aluno adicionarAluno(@RequestBody Aluno aluno) {
        alunos.add(aluno);
        return aluno;
    }

    @PostMapping("/adicionarAlunos")
    public List<Aluno> adicionarAlunos(@RequestBody List<Aluno> novosAlunos) {
    alunos.addAll(novosAlunos);
    return novosAlunos;
}

    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunos;
    }

    @GetMapping("buscarAluno/{id}")
    public ResponseEntity<Aluno> buscarAlunoPorId(@PathVariable Long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return new ResponseEntity<>(aluno, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("atualizarCadastro/{id}")
    public ResponseEntity<Aluno> atualizarAluno(@PathVariable Long id, @RequestBody Aluno alunoAtualizado) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            if (aluno.getId().equals(id)) {
                aluno.setNome(alunoAtualizado.getNome());
                aluno.setCurso(alunoAtualizado.getCurso());
                // Atualize outros atributos conforme necessário
                alunos.set(i, aluno);
                return new ResponseEntity<>(aluno, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("deletarCadastro/{id}")
    public ResponseEntity<Void> excluirAluno(@PathVariable Long id) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            if (aluno.getId().equals(id)) {
                alunos.remove(i);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

     public static void main(String[] args) {
        SpringApplication.run(AlunoController.class, args);
    }
}
