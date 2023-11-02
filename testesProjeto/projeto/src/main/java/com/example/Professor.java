package com.example;

public class Professor {

    private String nome;
    private int quantTurmas;
    private String materia;
    private int salario;
    
    public Professor(String nome, int quantTurmas, String materia, int salario) {
        this.nome = nome;
        this.quantTurmas = quantTurmas;
        this.materia = materia;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantTurmas() {
        return quantTurmas;
    }
    public void setQuantTurmas(int quantTurmas) {
        this.quantTurmas = quantTurmas;
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
