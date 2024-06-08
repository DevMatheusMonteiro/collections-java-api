import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) {
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add("90");

        // Exemplo com Generics
        List<String> listaComGenerics = new ArrayList<>();
        listaComGenerics.add("Elemento 1");
        listaComGenerics.add("Elemento 2");
        // listaComGenerics.add(10); compilador aponta erro

        for (String elemento : listaComGenerics){
            System.out.println(elemento);
        }

        /*
            Por não ser genérico o compilador não deixa executar
            o foreach passando um tipo específico
            pois o loop é passível de ocorrer erro de tipo incompatível
            for (String elemento : listaSemGenerics){
                System.out.println(elemento);
            }
        */

        for (Object elemento : listaSemGenerics){
            /*
                Não é possível rodar sem o cast
                String stringo = elemento;
            */

            String stringo = (String) elemento;
            System.out.println(stringo);
        }
    }
}
