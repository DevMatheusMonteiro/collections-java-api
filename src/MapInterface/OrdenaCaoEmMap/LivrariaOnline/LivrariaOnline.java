package MapInterface.OrdenaCaoEmMap.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        livros = new HashMap<>();
    }

    public void addLivro(String link, String titulo, String autor, float preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removeLivro(String link) {
        livros.remove(link);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> listLivros = new ArrayList<>(livros.entrySet());
        listLivros.sort(Map.Entry.comparingByValue());
        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> livroEntry : listLivros) {
            livrosOrdenados.put(livroEntry.getKey(),livroEntry.getValue());
        }

        for (Map.Entry<String, Livro> livroEntry : livrosOrdenados.entrySet()) {
            System.out.println(livroEntry.getKey() + " - " + livroEntry.getValue());
        }
    }

    public void pesquisarPorAutor(String autor) {
        for (Map.Entry<String, Livro> livroEntry : livros.entrySet()) {
            if (livroEntry.getValue().getAutor().equalsIgnoreCase(autor)) {
                System.out.println(livroEntry.getKey() + " - " + livroEntry.getValue());
            }
        }
    }

    public void obterLivroMaisCaro(){
        Livro livro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Livro item : livros.values()) {
            if(item.getPreco() > maiorPreco){
                maiorPreco = item.getPreco();
                livro = item;
            }
        }
        System.out.println(livro);
    }

    public void obterLivroMaisBarato() {
        Livro livro = null;
        double menorPreco = Double.MAX_VALUE;
        for (Livro item : livros.values()) {
            if(item.getPreco() < menorPreco){
                menorPreco = item.getPreco();
                livro = item;
            }
        }
        System.out.println(livro);
    }
}
