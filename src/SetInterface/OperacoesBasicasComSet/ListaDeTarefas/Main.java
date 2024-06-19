package SetInterface.OperacoesBasicasComSet.ListaDeTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.addTarefa("Estudar Java Collections", true);
        listaTarefas.addTarefa("Estudar Hash Map", false);
        listaTarefas.addTarefa("Estudar Hash Map", true);
        listaTarefas.addTarefa("Terminar projeto Food Explorer", false);
        listaTarefas.addTarefa("Terminar AT", true);

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();
        listaTarefas.marcarTarefaConcluida("Estudar Hash Map");
        listaTarefas.exibirTarefas();
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.marcarTarefaPendente("Estudar Hash Map");
        listaTarefas.obterTarefasPendentes();
        listaTarefas.limparListaDeTarefas();
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();
    }
}
