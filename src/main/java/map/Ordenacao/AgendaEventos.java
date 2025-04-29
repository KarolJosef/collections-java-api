package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        this.eventosMap.put(data,new Evento(nome,atracao));
    }
    public void exibirAgenda(LocalDate data) {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    }
    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();


    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    }
}
