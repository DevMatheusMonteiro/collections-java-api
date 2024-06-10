package ListInterface.OperacoesBasicas.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("PS5", 2400.99f, 1);
        carrinho.adicionarItem("Iphone", 1499.99f, 1);
        carrinho.adicionarItem("Memória Ram 16GB", 249.99f, 2);

        carrinho.removerItens("Iphone");

        System.out.println(carrinho);
    }
}
