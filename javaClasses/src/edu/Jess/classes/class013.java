package edu.Jess.classes;

import java.util.Scanner;

//If-Else Encadeados
public class class013 {
  public static void main(String[] args){
    double nota;

    System.out.print("\nDigite sua nota: ");
    Scanner getNota = new Scanner(System.in);
    nota = getNota.nextDouble();

    if(nota >=7)
      System.out.print("\nAPROVADO(A)!\n\n");
    else if(nota >=5 && nota < 7)
      System.out.print("\nRECUPERACAO!\n\n");
    else
      System.out.print("\nREPROVADO(A)!\n\n");



  }
}
