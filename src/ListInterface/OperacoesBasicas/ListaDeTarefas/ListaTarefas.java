package ListInterface.OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> listaTarefas;

    public ListaTarefas() {
        listaTarefas = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefas(String descricao) {
        List<Tarefa> tarefasARemover = new ArrayList<>();
        for(Tarefa tarefa: listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasARemover.add(tarefa);
            }
        }
        listaTarefas.removeAll(tarefasARemover);
    }

    public int numeroTotalDeTarefas(){
        return listaTarefas.size();
    }

    public String listaDeTarefas(){
        StringBuilder lista = new StringBuilder();
        int contador = 1;
        for (Tarefa tarefa : listaTarefas) {
            lista.append(contador + " - ").append(tarefa.toString()).append("\n");
            contador++;
        }

        return lista.toString();
    }

    public String toString(){
       return "Total de tarefas: " + numeroTotalDeTarefas() + "\nLista de tarefas:\n" + listaDeTarefas();
    }
}
