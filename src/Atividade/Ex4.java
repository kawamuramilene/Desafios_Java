package Atividade;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M para Masculino / F para Feminino): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite o número de anos de experiência como motorista: ");
        int experiencia = scanner.nextInt();

        double valorSeguro = 0;

        if (idade < 25 && experiencia < 2) {
            if (sexo == 'M' || sexo == 'm') {
                valorSeguro = 2000; 
            } else if (sexo == 'F' || sexo == 'f') {
                valorSeguro = 1800;
            }
        } else {
            valorSeguro = 1200;
        }

        System.out.printf("O valor do seu seguro é: R$ %.2f\n", valorSeguro);
        
        scanner.close();
		    }
		}
