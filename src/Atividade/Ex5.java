package Atividade;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor total da compra: R$ ");
	        double valorCompra = scanner.nextDouble();

	        System.out.print("Digite o número de itens adquiridos: ");
	        int numeroItens = scanner.nextInt();

	        double desconto = 0.0;

	        if (valorCompra > 1000) {
	            desconto = 0.20; 
	        } else if (valorCompra > 500 || numeroItens > 5) {
	            desconto = 0.10;
	        } else if (valorCompra > 300 || numeroItens > 3) {
	            desconto = 0.05;
	        }

	        double valorFinal = valorCompra - (valorCompra * desconto);

	        System.out.printf("Valor da compra: R$ %.2f\n", valorCompra);
	        if (desconto > 0) {
	            System.out.printf("Desconto aplicado: %.0f%%\n", desconto * 100);
	        } else {
	            System.out.println("Nenhum desconto aplicado.");
	        }
	        System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);

	        scanner.close();
	}

}
