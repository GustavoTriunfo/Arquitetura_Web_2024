package com.example.demo;

public class Aluno {

    private Long id;
    private String nome;
    private String curso;
    private String email;
    private int idade;
    private String endereco;
    // Adicione outros atributos conforme necessário

    // Construtor vazio (necessário para frameworks como Spring)
    public Aluno() {
    }

    // Construtor com todos os atributos
    public Aluno(Long id, String nome, String curso, String email, int idade, String endereco) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.email = email;
        this.idade = idade;
        this.endereco = endereco;
        // Inicialize outros atributos conforme necessário
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Adicione outros getters e setters conforme necessário

    // Método toString para facilitar a visualização dos objetos
    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                // Adicione outros atributos ao toString conforme necessário
                '}';
    }
}
