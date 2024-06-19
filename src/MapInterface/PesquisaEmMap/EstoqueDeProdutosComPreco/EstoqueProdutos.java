package MapInterface.PesquisaEmMap.EstoqueDeProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Integer, Produto> produtos;
    public EstoqueProdutos() {
        produtos = new HashMap<>();
    }
    public void adicionarProduto(int id, String nome, double preco, int quantidade) {
        produtos.put(id, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos() {
        for (Produto produto : produtos.values()) {
            System.out.println(produto);
        }
    }
    public void calcularValorTotalDoEstoque() {
        double total = 0;
        for(Produto produto : produtos.values()){
            total += (produto.getPreco() * produto.getQuantidade());
        }
        System.out.println(total);
    }
    public void obterProdutoMaisCaro() {
        double maiorPreco = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        for(Produto produto : produtos.values()) {
            if(produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }

        System.out.println(produtoMaisCaro);
    }
    public void obterProdutoMaisBarato() {
        double menorPreco = Double.MAX_VALUE;
        Produto produtoMaisBarato = null;
        for(Produto produto : produtos.values()){
            if(produto.getPreco() < menorPreco) {
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        System.out.println(produtoMaisBarato);
    }
    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        double maiorPreco = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        for(Produto produto : produtos.values()) {
            if((produto.getPreco() * produto.getQuantidade()) > maiorPreco) {
                maiorPreco = (produto.getPreco() * produto.getQuantidade());
                produtoMaisCaro = produto;
            }
        }

        System.out.println(produtoMaisCaro);
    }
}
