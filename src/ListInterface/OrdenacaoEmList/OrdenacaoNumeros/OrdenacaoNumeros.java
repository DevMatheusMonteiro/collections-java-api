package ListInterface.OrdenacaoEmList.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numeros;

    public OrdenacaoNumeros(){
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(numeros);
    }

    public void ordenarDescendente() {
        Collections.reverse(numeros);
    }
    public String toString() {
        String listaNumeros = "";

        for(Integer numero : numeros){
            listaNumeros += numero + "\n";
        }

        return listaNumeros;
    }
}
