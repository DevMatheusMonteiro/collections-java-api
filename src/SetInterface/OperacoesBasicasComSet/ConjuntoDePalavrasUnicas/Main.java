package SetInterface.OperacoesBasicasComSet.ConjuntoDePalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");

        conjuntoPalavrasUnicas.contarPalavras();
        conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
        conjuntoPalavrasUnicas.verificarPalavras("Palavra 3");
        conjuntoPalavrasUnicas.verificarPalavras("Palavra 2");
        conjuntoPalavrasUnicas.contarPalavras();
        conjuntoPalavrasUnicas.exibirPalavras();
    }
}
