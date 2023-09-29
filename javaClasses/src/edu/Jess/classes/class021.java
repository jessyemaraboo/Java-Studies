package edu.Jess.classes;

import java.util.Random;

public class class021 {
  public static void main(String[] args){
    System.out.println("\nDiscando...");
		
		do {
			
			System.out.println("\nTelefone tocando...");
		
		}while(tocando());
		
		System.out.println("\nAlo !!!\n\n");
  }

  private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("\nAtendeu? " + atendeu);
		return ! atendeu;
	}
}
