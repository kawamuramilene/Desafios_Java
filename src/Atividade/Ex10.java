package Atividade;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		
		   Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
	        int numero = scanner.nextInt();
	        
	        if (numero < 0) {
	            System.out.println("Por favor, digite um número inteiro positivo.");
	        } else {
	            long fatorial = 1;
	            
	            for (int i = 1; i <= numero; i++) {
	                fatorial *= i;
	            }
	            
	            System.out.println("O fatorial de " + numero + " é: " + fatorial);
	        }
	        
	        scanner.close();
	    }
	}