package SetInterface.OperacoesBasicasComSet.AgendaDeContatos;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.addContato("Matheus", "21999999999");
        agenda.addContato("Amanda", "21988888888");
        agenda.addContato("Amanda do Nascimento", "21988888888");
        agenda.addContato("Nicolas", "21977777777");
        agenda.addContato("Nicolas", "21966666666");

        agenda.exibirContatos();
        System.out.println("************");
        try {
            Set<Contato> contatosPesquisa = agenda.pesquisarContato("Amanda");
            for (Contato c : contatosPesquisa) {
                System.out.println(c);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("*************");

        agenda.atualizarNumeroContato("Nicolas", "21966666666");

        agenda.exibirContatos();
    }
}
