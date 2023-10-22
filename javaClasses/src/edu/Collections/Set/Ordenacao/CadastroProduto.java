package edu.Collections.Set.Ordenacao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
  private Set<Produto> produtos;

  public CadastroProduto() {this.produtos = new HashSet<Produto>();}

  public void adicionarProduto(String nome, long codigo, int quantidade, double valor){
    produtos.add(new Produto(nome, codigo, quantidade, valor));
  }

  public Set<Produto> exibirProdutosPorNome(){
    Set<Produto> exibirProdutosNome = new TreeSet<>(produtos);
    return exibirProdutosNome;
  }

  public Set<Produto> exibirPorValor(){
    Set<Produto> exibirPorValor = new TreeSet<>(new ComparatorValor());
    exibirPorValor.addAll(produtos);
    return exibirPorValor;
  }

public static void main(String[] args) {
  CadastroProduto cadProduto = new CadastroProduto();

  cadProduto.adicionarProduto("Base", 147258, 100, 185);
  cadProduto.adicionarProduto("Po Translucido", 369258, 85, 85);
  cadProduto.adicionarProduto("Batom", 147369, 500, 110);
  cadProduto.adicionarProduto("Perfume", 147259, 55, 545);

  System.out.println(cadProduto.exibirPorValor());

}

}
