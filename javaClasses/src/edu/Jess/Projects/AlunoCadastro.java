package edu.Jess.Projects;

//import java.util.ArrayList;

import java.util.Scanner;

public class AlunoCadastro {
  String nome;
  int idade;
  int anoEscolar;
  String nomeProfessora;
  char genero;
  String estaAtivo;

  public void nomeDoAluno(){
    System.out.print("\nDigite o nome do aluno: ");
    Scanner nomeAluno = new Scanner(System.in);
    nome = nomeAluno.nextLine();
  }

  public void idadeDoAluno(){
    System.out.print("\nDigite a idade do aluno: ");
    Scanner idadeAluno = new Scanner(System.in);
    idade = idadeAluno.nextInt();
  }

   public void anoEscolarDoAluno(){
    System.out.print("\nQual o ano escolar do Aluno? ");
    Scanner anoEscolarAluno = new Scanner(System.in);
    anoEscolar = anoEscolarAluno.nextInt();
  }

   public void professoraDoAluno(){
    System.out.print("\nDigite o nome da professora: ");
    Scanner professoraAluno = new Scanner(System.in);
    nomeProfessora = professoraAluno.next();
  }

  public void generoDoAluno(){
    System.out.print("\nDigite o genero do aluno | F para feminino e M para masculino|: ");
    Scanner generoAluno = new Scanner(System.in);
    genero = generoAluno.next().charAt(0);
    
  }

  public void atividadeDoAluno(){
    System.out.print("\nO aluno esta ativo? |Digitar SIM ou NAO|: ");
    Scanner atividadeAluno = new Scanner(System.in);
    estaAtivo = atividadeAluno.next();
    
  }




}