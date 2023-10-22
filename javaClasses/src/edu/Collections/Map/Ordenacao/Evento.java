package edu.Collections.Map.Ordenacao;

public class Evento {
  private String nomeEvento;
  private String nomeAtracao;

  public Evento(String nomeEvento, String nomeAtracao){
    this.nomeEvento = nomeEvento;
    this.nomeAtracao = nomeAtracao;
  }

  public String getNomeEvento(){return nomeEvento;}
  public String getNomeAtracao(){return nomeAtracao;}

  @Override
  public String toString()
  {return "\nNome do Evento: " + nomeEvento + " |Atracao: " + nomeAtracao + "]\n"; }



}
