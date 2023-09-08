package edu.Jess.classes;

/*TIPOS DE VARIÁVEIS*/

public class class003 {
  public static void main(String[] args){
    /*Valor Milhar em java
     - double minimumWage = 2500 or 2500.25;
     It follows American convetion*/
    int minimumWage = 2500;

    /*Converting types */
    
    short smallNumber = 1;
    int normalNumber = smallNumber;
    /*Casting: Casting in Java is converting a value from one type to another. There are two types: widening and narrowing. Widening is automatic and safe, narrowing is manual and risky. Casting can also be done between classes that have inheritance. */
    short smallNumber2 = (short) normalNumber;

    /*Types of variables */
    byte age = 23;
    short year = 2011;
    int zipcode = 20500;
    long id = 874596123;
    double income = 35875; 
    float height = 1.55f;

    /*Declaring Text variables with the the type STRING */
    String myName = "Jessye Carlah";

    /*Declaring CONSTANTS: using "final" at the beggining is MANDATORY */
    final int MY_NUMBER = 3;

    System.out.print("\n" + myName + "\n\n");

     }
}