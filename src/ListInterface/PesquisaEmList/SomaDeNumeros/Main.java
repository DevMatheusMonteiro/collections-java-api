package ListInterface.PesquisaEmList.SomaDeNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(3);
        soma.adicionarNumero(5);
        soma.adicionarNumero(7);
        soma.adicionarNumero(-9);
        System.out.println(soma);
        System.out.println("Maior número: " + soma.encontrarMaiorNumero());
        System.out.println("Menor número: " + soma.encontrarMenorNumero());
        System.out.println("Soma de todos números: " + soma.somarNumeros());
    }
}
