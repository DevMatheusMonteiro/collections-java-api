package ListInterface.OrdenacaoEmList.OrdenacaoNumeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros ordNumeros = new OrdenacaoNumeros();

        ordNumeros.adicionarNumero(10);
        ordNumeros.adicionarNumero(9);
        ordNumeros.adicionarNumero(5);
        ordNumeros.adicionarNumero(8);
        ordNumeros.adicionarNumero(7);
        ordNumeros.adicionarNumero(6);
        ordNumeros.adicionarNumero(4);

        System.out.println("Lista de números:\n" + ordNumeros);
        ordNumeros.ordenarAscendente();
        System.out.println("Lista de números em ordem ascendente:\n" + ordNumeros);
        ordNumeros.ordenarDescendente();
        System.out.println("Lista de números em ordem descendente:\n" + ordNumeros);
    }
}
