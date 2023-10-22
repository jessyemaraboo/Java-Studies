package edu.Jess.Projects.Pessoa;

public class Professor extends Pessoa {
  private int salario;
  private String segmento;
  private boolean emSala;

  protected void aumentoDeSalario(int NovoSalario){
    salario = salario + NovoSalario;
  }
}
