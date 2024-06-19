package MapInterface.PesquisaEmMap.ContagemDePalavras;

public class Main {
    public static void main(String[] args) {
        String frase = "Java é java, é muito bom. PHP, bléh. JavaScript é legal. Python, maneiro";
        ContagemPalavras contagem = getContagemPalavras(frase);

//        ContagemPalavras contagem = new ContagemPalavras();
//        contagem.adicionaContagemPalavra("Java", 10);
//        contagem.adicionaContagemPalavra("JavaScript", 5);
//        contagem.adicionaContagemPalavra("PHP", 10);
//        contagem.adicionaContagemPalavra("PHP", 0);
//        contagem.adicionaContagemPalavra("Python", 3);

        contagem.removerPalavra("php");
        contagem.exibirPalavras();
        System.out.print("Melhor Linguagem: ");
        contagem.encontrarPalavraMaisFrequente();
    }

    private static ContagemPalavras getContagemPalavras(String frase) {
        ContagemPalavras contagem = new ContagemPalavras();
        int contagemJava = 0;
        int contagemPHP = 0;
        int contagemPython = 0;
        int contagemJavaScript = 0;
        for (String palavra : frase.split(" ")) {
            String palavraSemPontoeVirgulaMinuscula = palavra.replace(",", "").replace(".","").toLowerCase();
            switch (palavraSemPontoeVirgulaMinuscula.toLowerCase()) {
                case "java":
                contagemJava++;
                contagem.adicionaContagemPalavra(palavraSemPontoeVirgulaMinuscula, contagemJava);
                break;
                case "php":
                    contagemPHP++;
                    contagem.adicionaContagemPalavra(palavraSemPontoeVirgulaMinuscula, contagemPHP);
                    break;
                case "python":
                    contagemPython++;
                    contagem.adicionaContagemPalavra(palavraSemPontoeVirgulaMinuscula, contagemPython);
                    break;
                case "javascript":
                    contagemJavaScript++;
                    contagem.adicionaContagemPalavra(palavraSemPontoeVirgulaMinuscula, contagemJavaScript);
                break;
            }
        }
        return contagem;
    }
}
