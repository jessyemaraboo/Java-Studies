package edu.Jess.Projects.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private char genero;

   protected void seComunica(){
    System.out.println("\nEsta se comunicando Agora!\n");
   }
   protected void seComunica(String professor){
    System.out.println("\n Saudacoes profe!!!\n");
   }
//Get/Set Nome
   public String getNome(){
    return this.nome;
   }
   public void setNome(String nome){
     this.nome = nome;
   }
//Get/Set Idade
   public int getIdade(){
    return this.idade;
   }
   public void setIdade(int idade){
     this.idade = idade;
   }
//Get/Set Genero
   public char getGenero(){
    return this.genero;
   }
   public void setGenero(char genero){
     this.genero = genero;
   }
   

}

