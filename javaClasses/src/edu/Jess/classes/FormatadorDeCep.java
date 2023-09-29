package edu.Jess.classes;

public class FormatadorDeCep {
public static void main(String[] args) {
    try{
      String meuCepFormatado = formatarCep("697874509");
      System.out.println("\nCep valido "+ meuCepFormatado + "\n\n");

    } catch(CepInvalidoExpection e){
    System.out.println("\n\tCep Invalido!\n\n");
  }
  
  }

static String formatarCep(String cep) throws CepInvalidoExpection{
    if(cep.length() !=8)
      throw new CepInvalidoExpection();

      return cep;
}
}
  
