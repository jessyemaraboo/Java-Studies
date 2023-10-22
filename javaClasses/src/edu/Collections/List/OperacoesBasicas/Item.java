package edu.Collections.List.OperacoesBasicas;

public class Item {
  private double preco;
  private String nome;
  private int quantidade;
  double valorTotal;

  public Item(String nome,int quantidade, double preco){
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  }
  
  public String getNome(){
    return nome;
  }
  public Double getPreco(){
    return preco;
  }
  public int getQuantidade(){
    return quantidade;
  }

  @Override
  public String toString() {
    return "\nProduto: " + nome + " /Qnt: " + quantidade + " /Valor: R$" + preco + "\n";
  }



}
