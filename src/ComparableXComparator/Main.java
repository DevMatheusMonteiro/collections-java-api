package ComparableXComparator;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>() {
            {
                add(new Livro("Java - Guia do Programador: Atualizado Para Java 16", "Peter Jandl Junior", 2021));
                add(new Livro("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java",
                        "Raoul-Gabriel Urma e  Richard Warburton", 2021));
                add(new Livro(
                        "Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software",
                        "Susan J. Fowler", 2017));
                add(new Livro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
                        "Aditya Y. Bhargava", 2017));
                add(new Livro("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
            }
        };
        System.out.println("Livros após a ordenação padrão da classe Livro (Título):");
        Collections.sort(livros);
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - "
                    + livro.getAutor() + " - "
                    + livro.getAno());
        }
        System.out.println("--------------------------------------");
        System.out.println("Livros após ordenação por ano da classe CompararAno:");
        Collections.sort(livros, new CompararAno());
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - "
                    + livro.getAutor() + " - "
                    + livro.getAno());
        }
        System.out.println("--------------------------------------");
        System.out.println("Livros após ordenação por autor da classe CompararAutor:");
        Collections.sort(livros, new CompararAutor());
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - "
                    + livro.getAutor() + " - "
                    + livro.getAno());
        }
        System.out.println("--------------------------------------");
        System.out.println("Livros após ordenação por ano, autor e título da classe CompararAnoAutorTitulo:");
        Collections.sort(livros, new CompararAnoAutorTitulo());
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - "
                    + livro.getAutor() + " - "
                    + livro.getAno());
        }
    }
}
