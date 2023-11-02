package com.example;

public class Aluno {


    private String nome;
    private int idade;
    private double nota;
    private int matricula;
    private String turma;

    public Aluno()
    {
        this.nome = "Aluno";
        this.idade = 0;
        this.nota = 7.0;
        this.matricula = 1;
    }

     Aluno(String nome, int idade, double nota, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

     public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String passarAno(double nota) {
        this.setNota(nota);
        if(this.getNota() >= 7.0)
        {
            return "Passou por média de ano com " + this.getNota();
        }
        else if(this.getNota() >= 5)
        {
            return "Passou de ano com " + this.getNota();
        }
        else 
        {
            return "Não passou de ano.";
        }
    }
    public double calcularMediaPonderada(double nota1, double peso1, double nota2, double peso2, double nota3, double peso3) {
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        return mediaPonderada;
    }
    public void verificarMatricula(int matricula)
    {
        if(matricula == this.getMatricula())
        {
            System.out.println("Matrícula está correta.");
        }
        else
        {
            System.out.println("Matrícula está incorreta. ");
        }
    }
    


}
