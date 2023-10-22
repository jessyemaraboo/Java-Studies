package edu.Collections.Map.OperacoesBasicas;

public class Aluno {
  private String nome;
  private long matricula;

  public Aluno(String nome, long matricula) {
    this.matricula = matricula;
    this.nome = nome;
  }

  public String getNome(){return nome;}
  public Long getMatricula(){return matricula;}

  @Override
  public String toString(){
    return "\nAluno [nome =" + nome + " |Matricula = " + matricula + "]\n";
  }


}
