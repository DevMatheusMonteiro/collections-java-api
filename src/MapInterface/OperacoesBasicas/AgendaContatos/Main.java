package MapInterface.OperacoesBasicas.AgendaContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionaContato("Matheus", "21988888888");
        agenda.adicionaContato("Amanda", "21966666666");
        agenda.adicionaContato("Nicolas", "21955555555");
        agenda.adicionaContato("Matheus", "21944444444");
        agenda.adicionaContato("Matheus", "21977777777");
        agenda.exibirContatos();
        agenda.pesquisaContato("Matheus");
        agenda.removerContato("Matheus");
        System.out.println("***********");
        agenda.exibirContatos();
    }
}
