package edu.Jess.classes;
  //launch.json
public class class010 {
  public static void main(String[] args){

    String name = args[0];
    String surname = args[1];
    int age = Integer.valueOf(args[2]);
    double height = Double.valueOf(args[3]);

    System.out.println("\nHello! My name is " + name + "" + surname + "\n");
    System.out.println("I am " + age + " years old" + "\n");
    System.out.println("I'm " + height + " tall" + "\n");


  }
}
