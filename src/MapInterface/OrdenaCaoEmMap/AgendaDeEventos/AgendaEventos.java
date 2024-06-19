package MapInterface.OrdenaCaoEmMap.AgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<LocalDate, Evento>();
    }

    public void addEvento(LocalDate date, String nome, String atracao) {
        eventos.put(date, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        TreeMap<LocalDate, Evento> eventos = new TreeMap<>(this.eventos);

        for (Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void obterProximosEventos(){
        LocalDate hoje = LocalDate.now();
        TreeMap<LocalDate, Evento> eventos = new TreeMap<>(this.eventos);
        TreeMap<LocalDate, Evento> proximosEventos = new TreeMap<>();
        for (Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
            if (entry.getKey().isEqual(hoje) || entry.getKey().isAfter(hoje)) {
                proximosEventos.put(entry.getKey(), entry.getValue());
            }
        }

        if (!proximosEventos.isEmpty()) {
            for (Map.Entry<LocalDate, Evento> entry : proximosEventos.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        } else {
            System.out.println("Não há proximos eventos");
        }
    }
}
