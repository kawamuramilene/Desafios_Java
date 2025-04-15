package Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Benicio");
        nomes.add("Camila");
        nomes.add("Carlos");
        nomes.add("Amanda");
        nomes.add("Mariana");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a letra inicial para filtrar os nomes: ");
        String letraFiltro = scanner.nextLine().toUpperCase();

        List<String> nomesFiltrados = new ArrayList<>();

        for (String nome : nomes) {
            if (nome.toUpperCase().startsWith(letraFiltro)) {
                nomesFiltrados.add(nome);
            }
        }

        System.out.println("\n=== Resultado da Filtragem ===");
        System.out.println("Nomes encontrados que começam com \"" + letraFiltro + "\": " + nomesFiltrados);
        System.out.println("Total de nomes encontrados: " + nomesFiltrados.size());

        scanner.close();
    }
}
