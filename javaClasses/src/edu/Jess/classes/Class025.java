package edu.Jess.classes;

import java.util.HashMap;
import java.util.Map;

public class Class025 {
  //Maps
  public static void main(String[] args) {
    Map<String, Integer> quartosHotel = new HashMap<>();
    quartosHotel.put("Chave 1",0);
    quartosHotel.put("Chave 2",1);
    quartosHotel.put("Chave 3",4);

    for(Map.Entry<String, Integer> quartos : quartosHotel.entrySet()){
      String chave = quartos.getKey();
      int quarto = quartos.getValue();
      System.out.println("A chave " + chave + ", e do quarto " + quarto + ".");
    }









  }



}
