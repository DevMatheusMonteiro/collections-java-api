package ListInterface.PesquisaEmList.SomaDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosInteiros;

    public SomaNumeros(){
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosInteiros.add(numero);
    }

    public int somarNumeros(){
        int soma = 0;
        for(Integer numero : this.numerosInteiros){
            soma += numero;
        }

        return soma;
    }

    public int encontrarMaiorNumero(){
        return Collections.max(this.numerosInteiros);
    }

    public int encontrarMenorNumero(){
        return Collections.min(this.numerosInteiros);
    }

    public String listarNumeros(){
        StringBuilder listaNumeros = new StringBuilder();
        for(Integer numero : this.numerosInteiros){
            listaNumeros.append(numero + "\n");
        }
        return listaNumeros.toString();
    }


    public String toString() {
        return "Lista de números:\n" + listarNumeros();
    }
}
