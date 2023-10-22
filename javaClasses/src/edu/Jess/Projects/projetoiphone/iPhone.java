package edu.Jess.Projects.projetoiphone;


public class iPhone implements AparelhoTelefonico {

@Override
  public boolean estaLigado(boolean estaLigado) {
    if(estaLigado) System.out.println("\nLigado!");
   return estaLigado;
  }

  @Override
  public boolean AcessoInternet(boolean AcessoInternet) {
    return AcessoInternet;
  }

  @Override
  public boolean SinalOperadora(boolean sinal) {
    if (sinal) {System.out.println("Com Sinal");}
    else System.out.println("ERRO! Sem Sinal!");
   return sinal;
  }
  public static void main(String[] args) {
    
    iPhone meuIphone = new iPhone();
    ReprodutorMusical meuReprodutorMusical = new ReprodutorMusical();
    NavegarNaInternet meuNavegador = new NavegarNaInternet();
    //------------------------------------------------------------------
    System.out.println("\n");
    meuIphone.estaLigado(false);
    meuIphone.SinalOperadora(true);
    meuNavegador.AcessoInternet(true);

    meuNavegador.exibirPagina();
    meuNavegador.adicionarPagina();
    meuNavegador.atualizarPagina();

    meuReprodutorMusical.Tocar(true);
    meuReprodutorMusical.selecionandoMusica("Call out My Name");
    meuReprodutorMusical.pausar();
    
  System.out.println("\n");

  }

  
}
