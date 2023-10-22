package edu.Jess.ContadorProject;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    System.out.println("\nDigite dois numero...");
    Scanner getNumeros = new Scanner(System.in);

    int numero1 = getNumeros.nextInt();
    int numero2 = getNumeros.nextInt();
    try {
      contar(numero1, numero2);
      
    } catch (ParametrosInvalidosException e) {
      System.out.println("\nO primeiro numero deve ser sempre maior que o segndo...");
    }
    getNumeros.close();
  }
  static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
    if(numero1 >= numero2)
      throw new ParametrosInvalidosException();

      int contagem = numero2 - numero1;

      for(int i = 1; i <= contagem; i++){
        System.out.println("\nImprimindo numero " + i);
      }
      System.out.println("\n");
  }
}