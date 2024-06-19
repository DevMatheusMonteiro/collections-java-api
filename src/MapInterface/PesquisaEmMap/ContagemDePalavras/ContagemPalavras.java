package MapInterface.PesquisaEmMap.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;
    public ContagemPalavras() {
        palavras = new HashMap<>();
    }
    public Map<String, Integer> getPalavras() {
        return palavras;
    }
    public void adicionaContagemPalavra(String palavra, int contagem) {
        palavras.put(palavra, contagem);
    }
    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }
    public void exibirPalavras(){
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public void encontrarPalavraMaisFrequente() {
        int maiorContagem = Integer.MIN_VALUE;
        String palavraMaisFrequente = null;
        for (Map.Entry<String, Integer> contagem : palavras.entrySet()) {
            if (contagem.getValue() > maiorContagem) {
                maiorContagem = contagem.getValue();
                palavraMaisFrequente = contagem.getKey();
            }
        }
        System.out.println(palavraMaisFrequente);
    }
}
