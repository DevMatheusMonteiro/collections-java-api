package SetInterface.OrdenacaoEmSet.CadastroProdutos;

public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1L, "PS5", 4000, 4);
        cadastroProduto.adicionarProduto(2L, "Notebook", 3000, 10);
        cadastroProduto.adicionarProduto(3L, "Programador Pragmático", 237, 40);
        cadastroProduto.adicionarProduto(3L, "Código Limpo", 237, 40);

        cadastroProduto.exibirProdutosPorNome();
        System.out.println("*****************");
        cadastroProduto.exibirProdutosPorPreco();
        System.out.println("*****************");
        cadastroProduto.exibirProdutosPorPrecoNaOrdemDecrescente();
    }
}
