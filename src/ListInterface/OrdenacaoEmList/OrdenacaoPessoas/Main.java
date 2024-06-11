package ListInterface.OrdenacaoEmList.OrdenacaoPessoas;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
        pessoas.adicionarPessoa("Matheus", 24, 1.79f);
        pessoas.adicionarPessoa("Amanda", 32, 1.65f);
        pessoas.adicionarPessoa("Nicolas", 8, 0.79f);

        System.out.println("Lista de pessoas:\n" + pessoas);
        pessoas.ordenarPorIdade();
        System.out.println("Lista de pessoas ordenadas por idade:\n" + pessoas);
        pessoas.ordenarPorAltura();
        System.out.println("Lista de pessoas ordenadas por altura:\n" + pessoas);
    }
}
