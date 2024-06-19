package MapInterface.OrdenaCaoEmMap.LivrariaOnline;

public class Main {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.addLivro("Link 1", "Livro 1", "Autor 1", 400);
        livrariaOnline.addLivro("Link 2", "Livro 2", "Autor 2", 300);
        livrariaOnline.addLivro("Link 3", "Livro 3", "Autor 2", 500);
        livrariaOnline.addLivro("Link 4", "Livro 4", "Autor 3", 200);
        livrariaOnline.addLivro("Link 5", "Livro 5", "Autor 4", 600);
        livrariaOnline.exibirLivrosOrdenadosPorPreco();
    }
}
