package SetInterface.OperacoesBasicasComSet.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;
    public ListaTarefas() {
        tarefas = new HashSet<>();
    }
    public void addTarefa(String descricao, boolean concluida){
        tarefas.add(new Tarefa(descricao, concluida));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaARemover = new Tarefa(descricao, false);
        if(tarefas.contains(tarefaARemover)) {
            tarefas.remove(tarefaARemover);
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void exibirTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas para exibir!");
            return;
        }

        for(Tarefa tarefa : tarefas){
            System.out.println(tarefa);
        }
    }

    public void contarTarefas(){
        System.out.println("Total de tarefas: " + tarefas.size());
    }
    public void obterTarefasConcluidas(){
        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas para exibir!");
            return;
        }
        System.out.println("***Tarefas concluidas***");
        for(Tarefa tarefa : tarefas){
            if(tarefa.isConcluida()){
                System.out.println(tarefa);
            }
        }
    }

    public void obterTarefasPendentes(){
        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas para exibir!");
            return;
        }
        System.out.println("***Tarefas pendentes***");
        for(Tarefa tarefa : tarefas){
            if(!tarefa.isConcluida()){
                System.out.println(tarefa);
            }
        }
    }

    public Tarefa obterTarefa(String descricao) {
        Tarefa tarefaPesquisada = new Tarefa(descricao, false);
        if(!tarefas.contains(tarefaPesquisada)) {
            return null;
        } else {
            return tarefaPesquisada;
        }
    }

    public void marcarTarefaConcluida(String descricao){
        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas para exibir!");
            return;
        }
        Tarefa tarefaPesquisada = obterTarefa(descricao);
        if(tarefaPesquisada == null){
            System.out.println("Tarefa não encontrada!");
            return;
        }
        for(Tarefa tarefa : tarefas){
            if(tarefa.equals(tarefaPesquisada)){
                tarefa.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(tarefas.isEmpty()){
            System.out.println("Não há tarefas para exibir!");
            return;
        }
        Tarefa tarefaPesquisada = obterTarefa(descricao);
        if(tarefaPesquisada == null){
            System.out.println("Tarefa não encontrada!");
            return;
        }
        for(Tarefa tarefa : tarefas){
            if(tarefa.equals(tarefaPesquisada)){
                tarefa.setConcluida(false);
            }
        }
    }
    public void limparListaDeTarefas(){
        tarefas.clear();
    }
}
