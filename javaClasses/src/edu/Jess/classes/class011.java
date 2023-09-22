package edu.Jess.classes;

import java.util.Scanner;
import java.util.Locale;

public class class011 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    System.out.println("\nQual seu nome?");
    String nome = scanner.nextLine();

    System.out.println("\nQual sua idade?");
    int idade = scanner.nextInt();

    System.out.println("\nQual sua altura?");
    Double altura = scanner.nextDouble();

    System.out.println("\nSalvo!\nSeu nome: " + nome + "\nSua idade: " + idade + "\nSua altura: " + altura + "\n");







  }
}
