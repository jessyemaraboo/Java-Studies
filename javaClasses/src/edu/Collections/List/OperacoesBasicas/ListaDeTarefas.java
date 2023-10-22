package edu.Collections.List.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefas{
  private List<Tarefa>listaDeTarefas;

  public ListaDeTarefas(){
    this.listaDeTarefas = new ArrayList<>();
  }
  public void adicionarTarefa(String descricao) {   
    listaDeTarefas.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
   List<Tarefa>TarefasParaRemover = new ArrayList<>();
   for(Tarefa t : listaDeTarefas){
    if(t.getDescricao().equalsIgnoreCase(descricao)){
      TarefasParaRemover.add(t);
    }
    listaDeTarefas.removeAll(TarefasParaRemover);
   }
   
  }

  public int obterNumeroTotalDeTarefas(int numeroDeTarefas) {
    return listaDeTarefas.size();
  }
  public void obterDescricaoTarefas(){
    System.out.println(listaDeTarefas);
  }

public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  ListaDeTarefas minhaLista = new ListaDeTarefas();
  
  /*minhaLista.adicionarTarefa(scan.nextLine());
  minhaLista.adicionarTarefa(scan.nextLine());
  minhaLista.adicionarTarefa(scan.nextLine());
  minhaLista.adicionarTarefa(scan.nextLine());*/
  System.out.println("\nA lista tem " + minhaLista.obterNumeroTotalDeTarefas(0) + " tarefas gravadas!\n");
  
  minhaLista.removerTarefa(scan.nextLine());
  System.out.println("\nA lista tem " + minhaLista.obterNumeroTotalDeTarefas(0) + " tarefas gravadas!\n");

  minhaLista.obterDescricaoTarefas();
  System.out.println("\n\n");
}

}
