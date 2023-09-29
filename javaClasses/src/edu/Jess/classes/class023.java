package edu.Jess.classes;

import java.text.NumberFormat;
import java.text.ParseException;

public class class023 {
  public static void main(String[] args){
    Number valor;
      try{
       valor = NumberFormat.getInstance().parse("1.95a");
      System.out.println("\n" + valor + "\n\n");
    } catch (ParseException e){
      e.printStackTrace();
    }
    




  }
}
