package MapInterface.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> palavras;
    public Dicionario() {
        palavras = new HashMap<>();
    }
    public void adicionaPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
    }
    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }
    public void imprimePalavras() {
        for (Map.Entry<String, String> palavra : palavras.entrySet()) {
            System.out.println(palavra.getKey() + " - " + palavra.getValue());
        }
    }
    public void pesquisaPalavras(String palavra) {
        System.out.println(palavras.get(palavra));
    }
}
