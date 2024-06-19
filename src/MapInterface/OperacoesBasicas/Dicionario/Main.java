package MapInterface.OperacoesBasicas.Dicionario;

public class Main {
    public static void main(String[] args) {
        Dicionario d = new Dicionario();
        d.adicionaPalavra("Significado", "Sentido de uma palavra, termo, frase; sentido, conceito.");
        d.adicionaPalavra("Perseverança", "Qualidade da pessoa persistente, de quem não desiste jamais: conseguiu o trabalho pelo seu excesso de perseverança.");
        d.adicionaPalavra("Significado", "Sentido de uma palavra, termo, frase; sentido, conceito.");
        d.adicionaPalavra("Resiliência", "Característica dos corpos que, após sofrerem alguma deformação ou choque, voltam à sua forma original; elasticidade.");
        d.imprimePalavras();
        d.removerPalavra("Significado");
        System.out.println("****************");
        d.imprimePalavras();
        System.out.println("****************");
        d.pesquisaPalavras("Perseverança");

    }
}
