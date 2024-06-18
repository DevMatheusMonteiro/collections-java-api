package SetInterface.OperacoesBasicasComSet.ConjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if (palavrasUnicas.contains(palavra)) {
            palavrasUnicas.remove(palavra);
        }
    }
    public void verificarPalavras(String palavra) {
        String existe = palavrasUnicas.contains(palavra) ? "A palavra \"" + palavra + "\" existe no conjunto" : "A palavra \"" + palavra + "\" não existe no conjunto";
        System.out.println(existe);
    }
    public void exibirPalavras() {
        for (String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }
    }
    public void contarPalavras(){
        System.out.println(palavrasUnicas.size());
    }
}
