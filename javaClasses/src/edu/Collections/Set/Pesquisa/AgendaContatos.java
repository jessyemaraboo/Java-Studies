package edu.Collections.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatoSet;

  public AgendaContatos(){
    this.contatoSet = new HashSet<Contato>();
  }

  public void AdicionarContato(String nome, int numero){
    contatoSet.add(new Contato(nome, numero));
  }
  
  public void exibirContatos(){
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> contatosPorNome = new HashSet<>();
    for(Contato c : contatoSet){
      if(c.getNome().startsWith(nome)){
        contatosPorNome.add(c);
      }
    }
    return contatosPorNome;
  }

  public Contato atualizarNumeroDeContatos(String nome, int novoNumero){
    Contato contatoAtualizado = null;
    for(Contato c : contatoSet){
      if(c.getNome().equalsIgnoreCase(nome)){
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
    }
  }
  return contatoAtualizado;

  }

  public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();

    agenda.AdicionarContato("Laura", 89456314);
    agenda.AdicionarContato("Lucas", 97415236);
    agenda.AdicionarContato("Amanda", 14257896);
    agenda.AdicionarContato("Andrew", 33784519);

    
   agenda.atualizarNumeroDeContatos("Amanda", 81549600);
    agenda.exibirContatos();
  }

}
