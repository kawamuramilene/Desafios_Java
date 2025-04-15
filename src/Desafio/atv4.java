package Desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>(Arrays.asList("Banana", "Maçã", "Abacate", "Manga"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra para remover palavras que a contenham: ");
        String letraRemover = scanner.nextLine().toLowerCase();

        Iterator<String> iterator = palavras.iterator();
        while (iterator.hasNext()) {
            String palavra = iterator.next();
            if (palavra.toLowerCase().contains(letraRemover)) {
                iterator.remove();
            }
        }

        System.out.println("Palavras restantes: " + palavras);
        scanner.close();
    }
}
