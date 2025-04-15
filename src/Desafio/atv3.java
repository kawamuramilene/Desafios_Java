package Desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class atv3 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 5, 6, 9, 5);

        List<Integer> numerosPares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }

        System.out.println("=== Números Pares ===");
        System.out.println("Lista original: " + numeros);
        System.out.println("Números pares encontrados: " + numerosPares);
        System.out.println("Total de números pares: " + numerosPares.size());
    }
}
