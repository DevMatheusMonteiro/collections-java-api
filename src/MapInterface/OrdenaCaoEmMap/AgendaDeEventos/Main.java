package MapInterface.OrdenaCaoEmMap.AgendaDeEventos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.addEvento(LocalDate.of(2024, 10, 10), "Show", "Bruno mars");
        agenda.addEvento(LocalDate.now(), "Show", "Bruno mars");
        agenda.addEvento(LocalDate.of(2022, 9, 10), "Show", "Bruno mars");
        agenda.addEvento(LocalDate.of(2023, 9, 10), "Show", "Bruno mars");
        agenda.exibirAgenda();
        System.out.println("************");
        agenda.obterProximosEventos();
    }
}
