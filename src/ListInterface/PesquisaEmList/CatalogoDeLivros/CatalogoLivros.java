package ListInterface.PesquisaEmList.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public String pesquisarPorAutor(String autor) {
        List<Livro> livrosPesquisadosPorAutor = new ArrayList<>();
        if(!livros.isEmpty()){
            for (Livro livro : this.livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPesquisadosPorAutor.add(livro);
                }
            }
        } else {
            return "Não há livros para pesquisar";
        }

        if(livrosPesquisadosPorAutor.isEmpty()){
            return "Nenhum livro encontrado com esse autor!";
        }

        StringBuilder listaLivrosPesquisadosPorAutor = new StringBuilder();
        for (Livro livro : livrosPesquisadosPorAutor) {
            listaLivrosPesquisadosPorAutor.append(livro.toString()).append("\n");
        }

        return listaLivrosPesquisadosPorAutor.toString();
    }

    public String pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPesquisadosPorIntervaloDeAnos = new ArrayList<>();
        if(!livros.isEmpty()){
            for (Livro livro : this.livros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPesquisadosPorIntervaloDeAnos.add(livro);
                }
            }
        } else {
            return "Não há livros para pesquisar";
        }

        if(livrosPesquisadosPorIntervaloDeAnos.isEmpty()){
            return "Nenhum livro encontrado com esse intervalo de anos!";
        }

        StringBuilder listaLivrosPesquisadosPorIntervaloDeAnos = new StringBuilder();
        for (Livro livro : livrosPesquisadosPorIntervaloDeAnos) {
            listaLivrosPesquisadosPorIntervaloDeAnos.append(livro.toString()).append("\n");
        }

        return listaLivrosPesquisadosPorIntervaloDeAnos.toString();
    }

    public String pesquisarPorTitulo(String titulo) {
        String livroPesquisadoPorTitulo = "";
        if(!livros.isEmpty()){
            for (Livro livro : this.livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPesquisadoPorTitulo = livro.toString();
                    break;
                }
            }
        } else {
            return "Não há livros para pesquisar";
        }

        if(livroPesquisadoPorTitulo.isEmpty()){
            return "Não há livros com esse titulo!";
        }

        return livroPesquisadoPorTitulo;
    }

    public String toString(){
        StringBuilder listaLivros = new StringBuilder();
        for (Livro livro : this.livros) {
            listaLivros.append(livro.toString()).append("\n");
        }

        return listaLivros.toString();
    }
}
