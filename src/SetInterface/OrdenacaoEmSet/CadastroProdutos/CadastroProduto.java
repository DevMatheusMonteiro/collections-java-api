package SetInterface.OrdenacaoEmSet.CadastroProdutos;

import java.util.*;

public class CadastroProduto {
    Set<Produto> produtos;
    public CadastroProduto() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(long id, String nome, double preco, int quantidade) {
        produtos.add(new Produto(id, nome, preco, quantidade));
    }
    public void exibirProdutosPorNome() {
        Set<Produto> produtos = new TreeSet<>(this.produtos);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void exibirProdutosPorPreco() {
        Set<Produto> produtos = new TreeSet<>(new CompararPreco());
        produtos.addAll(this.produtos);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
    public void exibirProdutosPorPrecoNaOrdemDecrescente() {
        Set<Produto> produtos = new TreeSet<>(new CompararPreco().reversed());
        produtos.addAll(this.produtos);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
