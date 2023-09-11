package edu.Jess.classes;

public class class005 {
  public static void main (String[ ] args){
    //.equals = It's used to compare the contents of objects;
    // == It's used to check whether two references point to the same object in memory;
    /*
    Pool de strings: 
    O "pool de strings" no Java é uma área de memória onde literais de strings são armazenados e reutilizados para economizar memória. Se você cria uma string literal, o Java verifica se ela já existe no pool de strings. Se existir, ele reutiliza a referência existente em vez de criar uma nova instância. Isso economiza memória e melhora o desempenho. No entanto, se você criar uma string usando o operador *new*, isso forçará a criação de uma nova instância, independentemente do que está no pool de string.
    */
      String word1 = "Astronaut";
      String word2 = "Astronaut";
      String word5 = "ASTRONAUT";
     
      
      System.out.print("\n\t"+ word1 == word2 ? 1 : 0 + "\n\n");//0

      String word3 = new String("Astronaut");
      System.out.print("\n\t"+ word1 == word3 ? 1 : 0 + "\n\n");//0

      String word4 = word3;
      System.out.print("\n\t"+ (word1==word2) + "\n\n");//true
      System.out.print("\n\t"+ (word2.equals(word3)) + "\n\n");//true
      System.out.print("\n\t"+ (word3.equals(word4)) + "\n\n");//true
      System.out.print("\n\t"+ !(word4.equals(word5)) + "\n\n");//true (original: false)
  }

}
