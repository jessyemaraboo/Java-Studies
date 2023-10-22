package edu.Collections.Set.Pesquisa;
import java.util.Objects;

import edu.Collections.Set.OperacoesBasicas.Guest;

public class Contato {
  private String nome;
  private int numero;

  public Contato(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }
  public int getNumero(){
    return numero;
  }
  public void setNumero(int numero) {this.numero = numero;}


@Override
public String toString() {
  return "Contato [Nome = " + nome + " | numero= " + numero + "]\n";
}

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Contato)) return false; // Adicione o retorno falso aqui para verificar o tipo.

    Contato contato = (Contato) o;
    return getNome() == contato.getNome(); // Mova o retorno aqui para comparar os códigos de convite.
}

  @Override
  public int hashCode() {
    return Objects.hash(getNome());
  }


}
