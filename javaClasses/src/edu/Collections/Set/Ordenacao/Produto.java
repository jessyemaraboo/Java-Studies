package edu.Collections.Set.Ordenacao;
import java.util.Comparator;
import java.util.Objects;

import edu.Collections.Set.Pesquisa.Contato;

public class Produto implements Comparable<Produto> {
  private long codigo;
  private String nome;
  private double valor;
  private int quantidade;

  public Produto(String nome, long codigo, int quantidade, double valor) {
    this.codigo = codigo;
    this.nome = nome;
    this.valor = valor;
    this.quantidade = quantidade;
  }

  public String getNome(){
    return nome;
  }
  public long getCodigo(){
    return codigo;
  }
  public double getValor(){
    return valor;
  }
  public int getQuantidade(){
    return quantidade;
  }
  @Override
  public int compareTo(Produto p){return nome.compareToIgnoreCase(p.getNome());}

  @Override
  public String toString() {
    return "\nProduto [nome = " + nome + " |codigo = " + codigo + " |quantidade = " + quantidade + " |Valor = " + valor + "]";
  }

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Produto)) return false; // Adicione o retorno falso aqui para verificar o tipo.

    Produto produto = (Produto) o;
    return getCodigo() == produto.getCodigo(); // Mova o retorno aqui para comparar os códigos de convite.
}

  @Override
  public int hashCode() {
    return Objects.hash(getCodigo());
  }

}
