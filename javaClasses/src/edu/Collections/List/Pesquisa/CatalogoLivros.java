package edu.Collections.List.Pesquisa;
import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
  private List<Livro> listaLivros = new ArrayList<>();
  public CatalogoLivros(){this.listaLivros = new ArrayList<>();}
  public void adicionarLivro(String titulo, String autor, int anoPublicacao){listaLivros.add(new Livro(titulo, autor, anoPublicacao));}
  
  public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!listaLivros.isEmpty()){
      for(Livro l : listaLivros){
        if(l.getAutor().equalsIgnoreCase(autor)){
          livrosPorAutor.add(l);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
    if(!listaLivros.isEmpty()){
      for(Livro l : listaLivros){
        if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
          livrosPorIntervaloDeAnos.add(l);
        }
      }
    }
    return livrosPorIntervaloDeAnos;
  }

  public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;
    if(!listaLivros.isEmpty()){
      for(Livro l : listaLivros){
        if(l.getTitulo().equalsIgnoreCase(titulo)){
          livroPorTitulo = l;
          break;
        }

      }
    }
    return livroPorTitulo;
  }


public static void main(String[] args) {
  CatalogoLivros c = new CatalogoLivros();

  c.adicionarLivro("Livro 1", "Autor 1", 2010);
  c.adicionarLivro("Livro 2", "Autor 2", 2021);
  c.adicionarLivro("Livro 3", "Autor 3", 1760);
  c.adicionarLivro("Livro 4", "Autor 4", 1800);
  c.adicionarLivro("Livro 5", "Autor 5", 1999);

 System.out.println(c.pesquisarPorAutor("Autor 5"));
 System.out.println(c.pesquisarPorIntervaloAnos(1990, 1999));
 System.out.println(c.pesquisarPorTitulo("Livro 3"));

}

}
