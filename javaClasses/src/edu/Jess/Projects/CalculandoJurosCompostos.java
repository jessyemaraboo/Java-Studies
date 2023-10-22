package edu.Jess.Projects;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class CalculandoJurosCompostos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        valorInicial = calcularJurosCompostos(valorInicial, taxaJuros, periodo);
        
        double valorFinal = valorInicial;

        DecimalFormat df = new DecimalFormat("#0.00");

        String valorFinalFormatado = df.format(valorFinal);
       
        System.out.println("Valor final do investimento: R$ " + valorFinalFormatado);
        
        scanner.close();
    }
    
    public static double calcularJurosCompostos(double valorInicial, double taxaJuros, int periodo){
      //M = C*(1+i)t
      double valorFinal = valorInicial * Math.pow(1+taxaJuros,periodo);
      
      return valorFinal;
}
}