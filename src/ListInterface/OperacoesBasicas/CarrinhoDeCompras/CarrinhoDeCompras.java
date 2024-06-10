package ListInterface.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItens(String nome) {
        List<Item> itensARemover = new ArrayList<>();

        if (!itens.isEmpty()) {
            for (Item item : itens) {
                if(item.getNome().equalsIgnoreCase(nome)){
                    itensARemover.add(item);
                }
            }
            itens.removeAll(itensARemover);
        }
    }

    public float calcularTotal() {
        float total = 0;

        if (!itens.isEmpty()) {
            for (Item item : itens) {
                total += (item.getPreco() * item.getQuantidade());
            }
        }

        return total;
    }

    public String listarItens() {
        StringBuilder message = new StringBuilder();
        if (!itens.isEmpty()) {
            for (Item item : itens) {
                message.append(item.toString() + "\n");
            }
        }
        return message.toString();
    }

    public String toString() {
        String totalFormatado = String.format("%.2f", calcularTotal()).replace(".",",");

        return "Lista de itens:\n" + listarItens() + "\nTotal: R$ " + totalFormatado;
    }
}
