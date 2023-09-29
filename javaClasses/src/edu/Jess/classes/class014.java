package edu.Jess.classes;
import java.util.Scanner;


//Operador Ternario
public class class014 {
  public static void main(String[] args){
    int idade;

    System.out.print("\nQual a sua idade? ");
    Scanner getIdade =  new Scanner(System.in);
    idade = getIdade.nextInt();
    
    /*argumento ? true : false*/
    String resultado = idade > 17 ? "adulto" : "menor de Idade";

    System.out.print("\nVoce tem "+ idade +" anos, portanto e um "+ resultado + "!\n\n");

  }
}
