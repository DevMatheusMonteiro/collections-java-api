package ListInterface.OrdenacaoEmList.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, float altura) {
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade(){
        Collections.sort(pessoas);
    }

    public void ordenarPorAltura(){
        Collections.sort(pessoas, new CompararAltura());
    }

    public String toString() {
        String listaPessoas = "";

        for (Pessoa pessoa : pessoas) {
            listaPessoas += (pessoa.toString() + "\n------------------\n");
        }

        return listaPessoas;
    }
}
