package edu.Collections.Set.Ordenacao;

import java.util.Comparator;

public class ComparatorValor implements Comparator<Produto> {
  
@Override
public int compare(Produto p1, Produto p2)
{
  return Double.compare(p1.getValor(), p2.getValor());
}



}
