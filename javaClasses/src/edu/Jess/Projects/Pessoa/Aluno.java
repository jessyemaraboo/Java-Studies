package edu.Jess.Projects.Pessoa;

public class Aluno extends Pessoa {
  private boolean estudando;
  private int matricula;

  public void pagarMensalidade(){
    System.out.println("\nMensalidade Paga!\n");
  }

  //getSet Matricula
  public int getMatricula(int matricula){
    return matricula;
  }
  public void setMatricula(int matricula){
    this.matricula = matricula;
  }
//getSet Estudando?
  public boolean getEstudando(){
    return estudando;
  }
  public void setEstudando(){}
  
}
