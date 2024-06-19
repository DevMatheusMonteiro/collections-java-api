package SetInterface.PesquisaEmSet.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;
    public AgendaContatos() {
        contatos = new HashSet<>();
    }

    public void addContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        if(!contatos.isEmpty()) {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    public Set<Contato> pesquisarContato(String nome) {
        Set<Contato> contatosPesquisa = new HashSet<>();
        if(!contatos.isEmpty()) {
            for (Contato contato : contatos) {
                if(contato.getNome().startsWith(nome)) {
                    contatosPesquisa.add(contato);
                }
            }
        }
        if(contatosPesquisa.isEmpty()) {
            throw new RuntimeException("Nenhum contato encontrado");
        }

        return contatosPesquisa;
    }
    public void atualizarNumeroContato(String nome, String telefone) {
        Contato contatoAtualizado = new Contato(nome, telefone);
        if(contatos.contains(contatoAtualizado)){
            for (Contato contato : contatos) {
                if(contato.equals(contatoAtualizado)){
                    contato.setTelefone(telefone);
                    break;
                }
            }
        } else {
            System.out.println("Contato não encontrado");
        }
    }
}
