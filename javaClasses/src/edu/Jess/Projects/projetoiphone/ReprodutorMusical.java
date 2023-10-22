package edu.Jess.Projects.projetoiphone;

public class ReprodutorMusical implements AparelhoTelefonico{
  private boolean tocar;
  private boolean pausar = false;
  private String selecionarMusica;

  public void Tocar(Boolean play){
    this.tocar = play;
    if(estaLigado(true) && !pausar){
      System.out.println("Tocando");
    } else{System.out.println("ERRO Tocar");}
  }

  public void pausar(){
    if(tocar==true && estaLigado(true)){
      System.out.println("Pausei");
    } else{System.out.println("ERROR Pausar");}
  }

  public String selecionandoMusica(String musica){
    if(estaLigado(true)){
      System.out.println(">>Tocando:::: " + musica + "");
    } else if(estaLigado(false)){System.out.println("Erro! Telefone OFF");}
    else {System.err.println("ERROR");}
    return selecionarMusica;
    
  }
  //Gets and Setters
  public boolean getTocar(){return tocar;}
  public boolean getPausar(){return pausar;}
  public String getSelecionarMusica(){return selecionarMusica;}

  @Override
  public boolean estaLigado(boolean estaLigado) {
    return estaLigado;
  }
  @Override
  public boolean AcessoInternet(boolean AcessoInternet) {
    return AcessoInternet;
  }
  @Override
  public boolean SinalOperadora(boolean SinalOperadora) {
    return SinalOperadora;
  }

}
