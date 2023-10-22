package edu.Collections.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class SistemaDeAlunos {
  Map<String, Long> alunosMap;

  public SistemaDeAlunos(){
    this.alunosMap = new HashMap<>();
  }

  public void adicionarAluno(String nome, Long matricula){
    alunosMap.put(nome, matricula);
  }
  public void removerAluno(String nome){
    if(!alunosMap.isEmpty()){
      alunosMap.remove(nome);
    }
  }
  public void exibirAlunos(){
    System.out.println(alunosMap);
  }
  public Long pesquisarPorNome(String nome){
    Long matriculaPorNome = null;
    if(!alunosMap.isEmpty()){
      matriculaPorNome = alunosMap.get(nome);
    }
    System.out.println("\n" + matriculaPorNome + "\n");
    return matriculaPorNome;
    
  }

  public static void main(String[] args) {
    SistemaDeAlunos sistemaDeAlunos = new SistemaDeAlunos();

    sistemaDeAlunos.adicionarAluno("Jessye", 147258369L);
    sistemaDeAlunos.adicionarAluno("Mara", 369147258L);
    sistemaDeAlunos.adicionarAluno("Clarice", 159357852L);
    sistemaDeAlunos.adicionarAluno("Morgane", 753159258L);
    sistemaDeAlunos.pesquisarPorNome("Jessye");










  }





}
