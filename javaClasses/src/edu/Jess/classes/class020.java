package edu.Jess.classes;
import java.util.Scanner;
//import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class class020 {
  public static void main(String[] args){
    //While
    double mesada = 0;

    System.out.println("\n Digite o valor da sua mesada: ");
      Scanner getMesada = new Scanner(System.in);
    mesada = getMesada.nextDouble();

    while(mesada > 0){
      Double valorDoce = valorAleatorio();
        if(valorDoce > mesada)
          valorDoce = mesada;

        String valorDoceFormatado = String.format("R$ %.2f", valorDoce);

        System.out.println("\nDoce adicionado ao seu carrinho no valor de: " + valorDoceFormatado);
        mesada = mesada - valorDoce;
    }
    String valorMesadaFormatado = String.format("R$ %.2f", mesada);

    System.out.println("\nMesada restante: " + valorMesadaFormatado);
    System.out.println("\nPaty gastou toda a sua mesada em doces\n\n");
    

  }
    private static double valorAleatorio(){
      return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
