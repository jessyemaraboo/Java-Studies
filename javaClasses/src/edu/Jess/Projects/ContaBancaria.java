package edu.Jess.Projects;

import java.util.Scanner;

public class ContaBancaria {
  String  nomeCliente;
  int numeroConta;
  String agencia;
  double saldo;

  public void getCliente() {
    System.out.println("Por favor digite seu nome: ");
    Scanner getNomeCliente = new Scanner(System.in);
    nomeCliente = getNomeCliente.nextLine();
  }

  public void getAgencia() {
    System.out.println("Por favor digite 4 digitos de sua agencia (modelo: 000-0): ");
    Scanner getAgencia = new Scanner(System.in);
    agencia = getAgencia.next();
  }

  public void getConta(){
      System.out.println("Por favor digite 4 numeros para sua conta : ");
    Scanner getConta = new Scanner(System.in);
    numeroConta = getConta.nextInt();
    }


  public void getSaldo() {
   System.out.println("Valor inicial: ");
    Scanner getSaldo = new Scanner(System.in);
    saldo = getSaldo.nextDouble();
  }

    
  


}
