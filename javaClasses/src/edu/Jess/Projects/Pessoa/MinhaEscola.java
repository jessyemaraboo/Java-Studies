package edu.Jess.Projects.Pessoa;

import org.omg.CORBA.PolicyOperations;

public class MinhaEscola {
  public static void main(String[] args) {
    Professor prof1 = new Professor();
    Visitante vis1 = new Visitante();
    Aluno aluno1 = new Aluno();

    aluno1.setNome("Poliana");
    aluno1.setIdade(12);
    aluno1.setGenero('F');

    vis1.visitando();
    prof1.seComunica("Professor");

    System.out.println(aluno1.getNome() + " " + aluno1.getGenero());
  }
}
