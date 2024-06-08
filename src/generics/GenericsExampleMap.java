package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExampleMap {
    public static void main(String[] args) {
        // Exemplo sem Generics
        Map mapSemGenerics = new HashMap<>();
        mapSemGenerics.put("Chave 1", 10);
        mapSemGenerics.put("Chave 2", "valor"); // permite adicionar qualquer tipo de objeto.

        // Exemplo com Generics
        Map<String, Integer> mapGenerics = new HashMap<>();
        mapGenerics.put("Chave 1", 10);
        mapGenerics.put("Chave 2", 20);

        // Iterando sobre o map com Generics
        for (Map.Entry<String, Integer> entry : mapGenerics.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }

        // Iterando sobre o map sem Generics (necessário realizar o Cast)
        for (Object obj : mapSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }
    }
}
