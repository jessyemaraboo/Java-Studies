package edu.Jess.Projects.projetoiphone;

public class NavegarNaInternet implements AparelhoTelefonico {

  @Override
  public boolean estaLigado(boolean estaLigado) {
    return estaLigado;
  }

  @Override
  public boolean AcessoInternet(boolean AcessoInternet) {
    return AcessoInternet;
    
  }
  @Override
  public boolean SinalOperadora(boolean sinal) {
  return sinal;
  }

  public void exibirPagina(){
    if (estaLigado(true)){
      System.out.println("Exibindo Pagina");
    } else System.out.println("Telefone sem Internet!");
  }
 
  public void adicionarPagina(){
    if (estaLigado(true) && AcessoInternet(true)){
      System.out.println("Adicionar Nova Pagina...");
    } else System.out.println("Telefone sem Internet!");
  }
  public void atualizarPagina(){
    if (estaLigado(true) && AcessoInternet(true)){
      System.out.println("Atualizando......");
    } else System.out.println("Telefone sem Internet!");
  }
  }



