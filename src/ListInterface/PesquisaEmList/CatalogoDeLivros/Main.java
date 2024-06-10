package ListInterface.PesquisaEmList.CatalogoDeLivros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Harry Potter", "J. K. Rowling", 1997);
        catalogo.adicionarLivro("Senhor dos Aneis", "J. R. R. Tolkien", 1954);
        catalogo.adicionarLivro("Código Limpo", "Robert C. Martin", 2008);

        System.out.println("Todos os livros: \n" + catalogo);
        System.out.println("Livros pesquisados por autor: \n" + catalogo.pesquisarPorAutor("Robert C. Martin"));
        System.out.println("Livros pesquisados por intervalos de anos: \n" + catalogo.pesquisarPorIntervaloDeAnos(1900, 2000));
        System.out.println("Livro pesquisado por título: \n" + catalogo.pesquisarPorTitulo("Senhor dos Aneis"));
    }
}
