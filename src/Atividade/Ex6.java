package Atividade;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro lado do triângulo: ");
	        double ladoA = scanner.nextDouble();
	        
	        System.out.print("Digite o segundo lado do triângulo: ");
	        double ladoB = scanner.nextDouble();
	        
	        System.out.print("Digite o terceiro lado do triângulo: ");
	        double ladoC = scanner.nextDouble();

	        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
	            System.out.println("Os valores formam um triângulo válido.");
	        } else {
	            System.out.println("Os valores não formam um triângulo válido.");
	        }

	        scanner.close();
	    }
	}