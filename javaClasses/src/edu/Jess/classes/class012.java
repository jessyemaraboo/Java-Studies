package edu.Jess.classes;
import java.util.Scanner;

public class class012 {
  
  public static void main(String[] args){
      double saldo = 50.0;
     
    System.out.print("\nValor do saque: ");
    Scanner pegarValor = new Scanner(System.in);
    double valorSolicitado = pegarValor.nextDouble();


    if (valorSolicitado < saldo){
      saldo = saldo - valorSolicitado;
      System.out.print("\n"+ "Valor sacado: R$ " + valorSolicitado + "\nSaldo: R$ " + saldo + "\n\n");
    } else
      System.out.print("\nValor indisponivel para saque!" +"\n\n");

  }
}
