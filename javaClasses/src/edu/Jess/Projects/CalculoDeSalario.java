package edu.Jess.Projects;
import java.util.Scanner;
public class CalculoDeSalario {
  public static void main(String[] args) {
    double salario;
    double aliquota;
    double beneficios;
    double calcSalario = 0.0;
    String formatarSalario = String.format("%.2f", calcSalario);

    //coletando salario bruto
    System.out.println("\n Qual o salario? ");
    Scanner getSalario = new Scanner(System.in);
    salario = getSalario.nextDouble();

    //Analisando aliquotas
    if(salario >= 0.00 && salario <= 1100.0){
      aliquota = salario * 5.0/100.0;
    } else if(salario > 1100.0 && salario <=2500.0){
      aliquota = salario * 10.0/100.0;
    } else{
      aliquota = salario * 15.0/100.0;
    }

    //coletar valor de beneficios
    System.out.println("\n Qual os beneficios? ");
    Scanner getBeneficios = new Scanner(System.in);
    beneficios = getBeneficios.nextDouble();

    //Fechando Scanners
    getSalario.close();
    getBeneficios.close();

    //calculo de salario liquido
    calcSalario = salario - aliquota + beneficios;

    //Resultado
    System.out.println("\nO valor do salario bruto e de R$ " + salario + ". Foi descontado o valor de " + aliquota + ", e adicionado R$ " + beneficios + " de beneficios ao salario. Sendo assim o valor liquido a receber e de R$ " + calcSalario + ".");
System.out.println("\n");
    
    

  }
  
  }

