package edu.Jess.Projects;

public class ContaTerminal {
  
  public static void main(String[] args){
   

    ContaBancaria novaConta = new ContaBancaria();

    System.out.println("Bem vindo ao Banco JC!\n");
    System.out.println("Prosseguimos com a criacao de sua nova conta\n");
    
    novaConta.getCliente();
    novaConta.getAgencia();
    novaConta.getConta();
    novaConta.getSaldo();

     System.out.println("\nOla " + novaConta.nomeCliente + ", estamos felizes em ter voce conosco.\nSua agencia e " + novaConta.agencia + "\nU numero da sua conta: " + novaConta.numeroConta + ",\nSeu saldo inicial e de R$ " + novaConta.saldo + "\n\nTe desejamos uma otima experiencia em nosso banco!\n");













  }
  



}
