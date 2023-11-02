package com.example;

public class Escola {
    
    private String nome;
    private int numero;
    private int CEP;
    private int quantAlunos;
    
    public Escola()
    {
        this.nome = "Pimba";
        this.numero = 1;
        this.CEP = 1;
        this.quantAlunos = 0;
    }

  public Escola(String nome, int numero, int CEP, int quantAlunos) {
        this.nome = nome;
        this.numero = numero;
        this.CEP = CEP;
        this.quantAlunos = quantAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCEP() {
        return CEP;
    }

    public void setCEP(int cEP) {
        CEP = cEP;
    }
    
  public int getQuantAlunos() {
    return quantAlunos;
}


public void setQuantAlunos(int quantAlunos) {
    this.quantAlunos = quantAlunos;
}

public void verificarSeExistemEstudantes()
{
    if(this.getQuantAlunos() > 1)
    {
        System.out.println("Sim existem estudantes nessa escola. ");
    }
    else
    {
        System.out.println("Não existem estudantes nessa escola. ");
    }
}

}
