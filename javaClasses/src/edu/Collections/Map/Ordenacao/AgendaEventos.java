package edu.Collections.Map.Ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
  private Map<LocalDate, Evento> agendaDeEventos;

  public AgendaEventos(){
    this.agendaDeEventos = new HashMap<>();
  }

  public void adicionarEvento(LocalDate date, String nome, String atracao){
   Evento evento = new Evento(nome, atracao);
    agendaDeEventos.put(date, evento); 
  }

  public void exibirAgenda(){
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaDeEventos);
    System.out.println("\n" + eventosTreeMap);
  }

  public void proximoEvento(){
    LocalDate proximaData= null;
    Evento proximoEvento = null;
    LocalDate dataAtual = LocalDate.now();
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaDeEventos);
    for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
      if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
        proximaData = entry.getKey();
        proximoEvento = entry.getValue();

        System.out.println("\nProximo evento: " + proximoEvento + "\nAcontece dia: " + proximaData + "\n");
        break;
      }
    }
    
  }


public static void main(String[] args) {
  AgendaEventos minhaAgendaDeEventos = new AgendaEventos();

  minhaAgendaDeEventos.adicionarEvento(LocalDate.of(2023, 10, 30), "Halloween", "Blackpink");
  minhaAgendaDeEventos.adicionarEvento(LocalDate.of(2023, 10, 15), "Dia do Professor", "Festa");
  minhaAgendaDeEventos.adicionarEvento(LocalDate.of(2023, 11, 4), "Festa Beneficente", "Anitta");
  minhaAgendaDeEventos.adicionarEvento(LocalDate.of(2023, 12, 3), "Festa da Jessye", "Jessye");

  minhaAgendaDeEventos.exibirAgenda();
  minhaAgendaDeEventos.proximoEvento();

}

}
