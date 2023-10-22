package edu.Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoqueDeProdutos;

  public EstoqueProdutos(){
    this.estoqueDeProdutos = new HashMap<Long, Produto>();
  }

  public void adicionarProduto(Long codigo, String nome, int quantidade, double valor){
    estoqueDeProdutos.put(codigo, new Produto (nome, quantidade, valor));
  }
  public void exibirProdutos(){
    System.out.println(estoqueDeProdutos);
  }
  public double valorTotalEstoque(){
    double valorTotalEstoque = 0d;
  if(!estoqueDeProdutos.isEmpty()){
    for(Produto p : estoqueDeProdutos.values()){
      valorTotalEstoque += p.getQuantidade() * p.getValor();
    }
  }
  System.out.println("\n" + valorTotalEstoque + "\n");
  return valorTotalEstoque;
  }

public Produto obterProdutoMaisCaro(){
Produto produtoMaisCaro = null;
double maiorPreco = Double.MIN_VALUE;

if(!estoqueDeProdutos.isEmpty()){
for(Produto p : estoqueDeProdutos.values()) {
  if(p.getValor() > maiorPreco){
    produtoMaisCaro = p;
    maiorPreco = p.getValor();
  }
}
}
System.out.println("\n" + produtoMaisCaro+ "\n");
return produtoMaisCaro;
}

public Produto obterProdutoMaisBarato() {
  Produto produtoMaisBarato = null;
  double menorPreco = Double.MAX_VALUE;
  for (Produto p : estoqueDeProdutos.values()) {
    if (p.getValor() < menorPreco) {
      produtoMaisBarato = p;
      menorPreco = p.getValor();
    }
  }
  System.out.println("\n" + produtoMaisBarato+ "\n");
  return produtoMaisBarato;
}

public static void main(String[] args) {
  EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

  estoqueProdutos.adicionarProduto(11L, "Gloss", 1000, 75.80);
  estoqueProdutos.adicionarProduto(12L, "Batom", 200, 85);
  estoqueProdutos.adicionarProduto(13L, "Base", 600, 254);
  estoqueProdutos.adicionarProduto(14L, "Rimel", 2000, 99);
  estoqueProdutos.obterProdutoMaisBarato();
  estoqueProdutos.obterProdutoMaisCaro();
  estoqueProdutos.valorTotalEstoque();





}

}
