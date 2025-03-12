package Atividade;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double ladoA = scanner.nextDouble();
        
        System.out.print("Digite o segundo lado do triângulo: ");
        double ladoB = scanner.nextDouble();
        
        System.out.print("Digite o terceiro lado do triângulo: ");
        double ladoC = scanner.nextDouble();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo Equilátero: Todos os lados são iguais.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triângulo Isósceles: Dois lados são iguais.");
            } else {
                System.out.println("Triângulo Escaleno: Todos os lados são diferentes.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo válido.");
        }

        scanner.close();
    }
}