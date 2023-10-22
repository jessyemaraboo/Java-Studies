package edu.Jess.classes.SpecialClasses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filmes {
  
  private List<String> filmes = new ArrayList<>();

  public void addFilmes(String nomeDoFilme){
    Scanner getNomeDoFilme = new Scanner(System.in);
    nomeDoFilme = getNomeDoFilme.next();
    filmes.add(nomeDoFilme);
    getNomeDoFilme.close();
  }
  public List<String> getFilmes(){
    return filmes;
  }

}
