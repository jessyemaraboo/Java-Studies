package edu.Jess.Projects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class ProcessoSeletivo {
  public static void main(String[] args) {
   String [] candidatos = {"Amanda","Andrew","Barbara","Benjamin","Catarina","Charles","Isabela","Isaias","Laura","Leandro"};

   for(String candidato:candidatos){
    entrandoEmContato(candidato);
   }

  }
  static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    //loop de tentativas
    do{
      atendeu = atender();
      continuarTentando = !atendeu;
      if(continuarTentando)
        tentativasRealizadas++;
        else
        System.out.println("\nCONTATO REALIZADO COM SUCESSO!");
    }while(continuarTentando && tentativasRealizadas<3);

    //condição atendeu sim ou não?
    if(atendeu)
      System.out.println("\nConseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa!");
    else
      System.out.println("\nNao conseguimos contato com " + candidato + ". Numero de tentativas feitas: " + tentativasRealizadas + "!");
  }
  //atender
  static boolean atender(){
    return new Random().nextInt(3)==1;
  }
    //Imprimindo
    static void imprimirSelecionados(){
      String [] candidatos = {"Amanda","Andrew","Barbara","Benjamin","Catarina","Charles","Isabela","Isaias","Laura","Leandro"};

      for(int i = 0; i < candidatos.length; i++){
        System.out.println("\tO candidato numero " + (i+1) + " e " + candidatos[i]);
      }
    }
  static void selecaoDeCandidatos(){
    String[] candidatos = {"Amanda","Andrew","Barbara","Benjamin","Catarina","Charles","Isabela","Isaias","Laura","Leandro"};

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    //loop selecionando as pessoas
    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();
      String valSalario = String.format("%.2f", salarioPretendido);
      System.out.println("\nO candidato "+ candidato + " solicitou esse valor de salario " + valSalario);
      if(salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga;");
        candidatosSelecionados = candidatosSelecionados + 1;
      } else{
        System.out.println("O candidato foi para analise!\n");
      }
      candidatoAtual++;
    }
  }
  //Sorteando os valores
  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1900, 2200);
  }

  static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
      if(salarioBase > salarioPretendido){
          System.out.println("\nLIGAR PARA CANDIDATO!");
      } else if(salarioBase == salarioPretendido){
        System.out.println("LIGAR PARA CANDIDATO COM UMA PROPOSTA!");
      } else{
         System.out.println("\nAGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS!");
      }
  }






}
