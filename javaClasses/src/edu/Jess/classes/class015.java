package edu.Jess.classes;
import java.util.Scanner;

//Switch Case
public class class015 {
  public static void main(String[] args){
    String sigla;

    System.out.println("\nEscolha B, M ou T para conhecer nossos planos:\nB = BASICO\nM = MIDIA\nT = TURBO\n");
    Scanner getSigla = new Scanner(System.in);
    sigla = getSigla.next();

    switch (sigla){
      case "B":
        System.out.println("--Plano BASICO--\n*100 minutos de ligacao\n\n");
      break;
      case "M":
        System.out.println("--Plano MIDIA--\n*100 minutos de ligacao\n*WhatsApp e Instagram gratis\n\n");
      break;
      case "T":
        System.out.println("--Plano TURBO--\n*100 minutos de ligacao\n*WhatsApp e Instagram gratis\n*5Gb Youtube\n\n");
      break;
      default:
        System.out.println("\nERROR!\nInvalid option.\n\n");
    }
     
  }
}
