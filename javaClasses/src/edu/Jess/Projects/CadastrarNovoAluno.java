package edu.Jess.Projects;

public class CadastrarNovoAluno {
  public static void main(String[] args){
    AlunoCadastro aluno = new AlunoCadastro();

  System.out.println("\nSistema de gerenciamento de Alunos do Elite up School\n\tCadastro de Alunos\n");
    System.out.println("---------------------------------------------------------------- ");
    aluno.nomeDoAluno();
    System.out.println("\nNome gravado do aluno: " + aluno.nome + "\n");

    aluno.idadeDoAluno();
    System.out.println("\nIdade gravada do aluno: " + aluno.idade + "\n");

    aluno.generoDoAluno();
    System.out.println("\nGenero gravado do aluno: " + aluno.genero + "\n");

    aluno.anoEscolarDoAluno();
    System.out.println("\nAno escolar gravado do aluno: " + aluno.anoEscolar + "\n");

    aluno.professoraDoAluno();
    System.out.println("\nProfessora: " + aluno.nomeProfessora + "\n");

    aluno.atividadeDoAluno();
    System.out.println("\nAtividade: " + aluno.estaAtivo + "\n");

    System.out.println("\nDados gravadas\nNome: " + aluno.nome + "\n" + "Idade: " + aluno.idade + " anos\n" + "Genero: " + aluno.genero + "\n" + "Ano Escolar:" + aluno.anoEscolar + " Ano\n" + "Professora: "  + aluno.nomeProfessora + "\n" + "Esta ativo? " + aluno.estaAtivo + "\n");
    
  
  
  }
}
