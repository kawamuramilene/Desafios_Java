package Atividade;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1 - Dólar (US$)");
        System.out.println("2 - Euro (€)");
        System.out.println("3 - Libra (£)");
        System.out.print("Digite sua opção (1, 2 ou 3): ");
        int opcao = scanner.nextInt();
        
        double valorConvertido = 0.0;

        switch (opcao) {
            case 1:
                valorConvertido = valorReais * 0.20;
                System.out.printf("R$ %.2f equivalem a US$ %.2f\n", valorReais, valorConvertido);
                break;
            case 2:
                valorConvertido = valorReais * 0.18;
                System.out.printf("R$ %.2f equivalem a € %.2f\n", valorReais, valorConvertido);
                break;
            case 3:
                valorConvertido = valorReais * 0.15;
                System.out.printf("R$ %.2f equivalem a £ %.2f\n", valorReais, valorConvertido);
                break;
            default:
                System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
        }
        
        scanner.close();
    }

}
