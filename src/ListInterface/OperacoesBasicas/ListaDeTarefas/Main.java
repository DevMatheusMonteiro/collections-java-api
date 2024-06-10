package ListInterface.OperacoesBasicas.ListaDeTarefas;

public class Main {
    public static void main(String[] args) {

        ListaTarefas listaTarefas  = new ListaTarefas();
        listaTarefas.adicionaTarefa("Estudar Java");
        listaTarefas.adicionaTarefa("Estudar UML");
        listaTarefas.adicionaTarefa("Estudar Estrutura de Dados");
        listaTarefas.adicionaTarefa("Estudar UML");

        listaTarefas.removerTarefas("Estudar UMl");

        System.out.println(listaTarefas);
    }
}
