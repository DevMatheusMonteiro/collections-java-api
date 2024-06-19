package MapInterface.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, String> contatos;

    public AgendaContatos() {
        contatos = new HashMap<>();
    }
    public void adicionaContato(String nome, String telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (contatos.isEmpty()) {
            return;
        }

        contatos.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }
    public void pesquisaContato(String nome) {
        if (contatos.isEmpty()) {
            return;
        }
        String telefone = contatos.get(nome);

        if (telefone != null) {
            System.out.println(telefone);
        }
    }
}
