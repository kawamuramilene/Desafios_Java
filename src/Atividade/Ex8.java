package Atividade;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        int numero;
        
        do {
            System.out.print("Digite um número (ou 0 para encerrar): ");
            numero = scanner.nextInt();
            
            if (numero != 0) {
                soma += numero;
                contador++;
            }
            
        } while (numero != 0);
        
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("A média dos números digitados é: %.2f\n", media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
        
        scanner.close();
    }
}