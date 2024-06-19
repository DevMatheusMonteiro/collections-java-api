package MapInterface.PesquisaEmMap.EstoqueDeProdutosComPreco;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1, "PS5", 4000, 4);
        estoqueProdutos.adicionarProduto(2, "Notebook", 3000, 10);
        estoqueProdutos.adicionarProduto(3, "Código Limpo", 237, 40);
        estoqueProdutos.adicionarProduto(3, "Programador Pragmático", 237, 40);

        estoqueProdutos.exibirProdutos();
        System.out.print("Produto mais caro: ");
        estoqueProdutos.obterProdutoMaisCaro();
        System.out.print("Produto mais barato: ");
        estoqueProdutos.obterProdutoMaisBarato();
        System.out.print("Produto maior quantidade e valor total no estoque: ");
        estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.print("Valor total no estoque: ");
        estoqueProdutos.calcularValorTotalDoEstoque();
    }
}
