package Desafio;

import java.util.Arrays;
import java.util.List;

public class atv2 {

    public static void main(String[] args) {
  
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40);
       
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
      
        double media = numeros.isEmpty() ? 0 : (double) soma / numeros.size();

        System.out.println("=== Resultado ===");
        System.out.println("Lista de números: " + numeros);
        System.out.println("Soma dos números: " + soma);
        System.out.printf("Média dos números: %.2f\n", media); // com duas casas decimais
    }
}
