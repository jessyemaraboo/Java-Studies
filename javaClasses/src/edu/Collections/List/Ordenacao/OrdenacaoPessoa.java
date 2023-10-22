package edu.Collections.List.Ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa(){
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new CompararPorAltura());
    return pessoasPorAltura;
  }

public static void main(String[] args) {
  
OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

ordenacaoPessoa.adicionarPessoa("Giovanna", 23, 1.55);
ordenacaoPessoa.adicionarPessoa("Paulo", 15, 1.75);
ordenacaoPessoa.adicionarPessoa("Larissa", 25, 1.60);
ordenacaoPessoa.adicionarPessoa("Kika", 10, 1.38);
ordenacaoPessoa.adicionarPessoa("Christian", 30, 1.90);

System.out.println(ordenacaoPessoa.pessoaList);
System.out.println(ordenacaoPessoa.ordenarPorAltura());
System.out.println(ordenacaoPessoa.ordenarPorIdade());





}
}
