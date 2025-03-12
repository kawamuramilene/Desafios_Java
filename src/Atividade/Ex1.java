package Atividade;

import java.util.Scanner; 
import java.util.Random;  

public class Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1; 
        
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número que estou pensando, entre 1 e 10.");
        
        System.out.print("Digite seu palpite: ");
        int palpite = scanner.nextInt();
        
        if (palpite == numeroAleatorio) {
            System.out.println("Parabéns! Você acertou o número!");
        } else {
            System.out.println("Você errou. O número correto era " + numeroAleatorio + ".");
        }
        
        scanner.close();
    }
}
