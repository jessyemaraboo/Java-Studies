package edu.Jess.classes;
public class class001 {
    public static void main(String[] args) {
        String firstName = "Jessye";
        String secondName = "Maraboo";

        String fullName = fullName (firstName, secondName);

        System.out.println(fullName);
    }
    public static String fullName (String firstName, String secondName){
        return "\nMethod result of " + firstName.concat(" ") + (secondName)+"\n";
    }
}
