package edu.Jess.classes;
import java.util.HashSet;
import java.util.Set;

public class Class026 {
  //SET
  public static void main(String[] args) {
    Set<String> insetos = new HashSet<String>();
    insetos.add("Borboleta");
    insetos.add("Cigarra");
    insetos.add("Fomiga");
    insetos.add("Besouro");
    

    System.out.println("\nOs insetos dessa lista sao: " + insetos.size());
    

    for(String inseto : insetos) {
      System.out.println(inseto);
    }
    System.out.println("\nQual o seu favorito?\n\n");












  }





}
