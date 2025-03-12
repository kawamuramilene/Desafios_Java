package Atividade;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
        
        int somaPares = 0;
        int somaImpares = 0;
        int numero;
        
        while (true) {
            System.out.print("Digite um número (ou 0 para encerrar): ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            if (numero % 2 == 0) {
                somaPares += numero; 
                System.out.println("O número " + numero + " é PAR.");
            } else {
                somaImpares += numero;
                System.out.println("O número " + numero + " é ÍMPAR.");
            }
        }
        
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        
        scanner.close();
    }
}