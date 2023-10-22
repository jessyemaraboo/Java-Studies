package edu.Collections.List.OperacoesBasicas;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoDeCompras {
  private List<Item> meuCarrinho;
  

  public CarrinhoDeCompras() {
    this.meuCarrinho = new ArrayList<>();
  }

  public void adicionarItem(String nome, int quantidade, double preco ){
    meuCarrinho.add(new Item(nome,quantidade,preco));
  }
  public void removerItem(String nome){
    List<Item> RemoverItens = new ArrayList<>();
    for(Item i : meuCarrinho){
      if(i.getNome().equalsIgnoreCase(nome)){
        RemoverItens.add(i);
      }
      meuCarrinho.removeAll(RemoverItens);
    }
  }
 
  public void exibirItens(){
    System.out.println(meuCarrinho);
  }

  public double calcularValorTotal() {
    double valorTotal = 0d;

    if (!meuCarrinho.isEmpty()) {
      for (Item i : meuCarrinho) {
        double valorItem = i.getPreco() * i.getQuantidade();
        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
  public static void main(String[] args) {
    CarrinhoDeCompras meuCarrinhoDeCompras = new CarrinhoDeCompras();
    Scanner scan = new Scanner(System.in);

    System.out.println("\nItens adicionados: ");
    meuCarrinhoDeCompras.adicionarItem(scan.nextLine(), scan.nextInt(), scan.nextDouble());
    meuCarrinhoDeCompras.adicionarItem(scan.nextLine(), scan.nextInt(), scan.nextDouble());
    meuCarrinhoDeCompras.adicionarItem(scan.nextLine(), scan.nextInt(), scan.nextDouble());
    meuCarrinhoDeCompras.adicionarItem(scan.nextLine(), scan.nextInt(), scan.nextDouble());
    meuCarrinhoDeCompras.exibirItens();
    System.out.println("----------------------------------------------------------------------");
    System.out.println("Removendo Itens Duplicados...");
    meuCarrinhoDeCompras.removerItem(null);
    System.out.println("----------------------------------------------------------------------");
    System.out.println("\nTotal do carrinho R$ " + meuCarrinhoDeCompras.calcularValorTotal());
    System.out.println("----------------------------------------------------------------------\n");
  }
}
