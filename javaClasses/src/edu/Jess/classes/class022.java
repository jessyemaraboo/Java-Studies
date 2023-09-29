package edu.Jess.classes;
import java.util.Scanner;
import java.util.InputMismatchException;

public class class022 {
  public static void main(String[] args){
    try{
        System.out.print("\n Qual seu nome? ");
    Scanner getNome = new Scanner(System.in);
    String nome = getNome.next();

    System.out.print("\n Qual seu sobrenome? ");
    Scanner getSobrenome = new Scanner(System.in);
    String sobrenome = getSobrenome.next();

    System.out.print("\n Qual sua idade? ");
    Scanner getIdade = new Scanner(System.in);
    int idade = getIdade.nextInt();

    System.out.print("\n Qual sua altura? ");
    Scanner getAltura = new Scanner(System.in);
    Double altura = getAltura.nextDouble();


    System.out.print("\nSeu nome e " + nome.toUpperCase() + " " + sobrenome + ", voce tem " + idade + " anos, e sua altura e de " + altura + "\n\n");

    getNome.close();
    getAltura.close();
    getIdade.close();
    getSobrenome.close();
    }
    catch (InputMismatchException e){
      System.err.println("\n\tValores de idade e altura devem ser numericos;\n\n");

    }

  }
}
