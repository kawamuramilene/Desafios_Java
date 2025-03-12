package Atividade;
import java.util.Scanner; 

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Digite o valor do empréstimo: R$ ");
	        double valorEmprestimo = scanner.nextDouble();

	      
	        System.out.println("Escolha o número de parcelas para o empréstimo:");
	        System.out.println("1 - 6 meses");
	        System.out.println("2 - 12 meses");
	        System.out.println("3 - 24 meses");
	        System.out.print("Digite sua opção (1, 2 ou 3): ");
	        int parcelas = scanner.nextInt();
	        
	        double valorTotal = 0.0;

	      
	        if (parcelas == 1) {
	            valorTotal = valorEmprestimo * 1.05; 
	            System.out.printf("Empréstimo de R$ %.2f com 6 parcelas resulta em um total de R$ %.2f\n", valorEmprestimo, valorTotal);
	        } else if (parcelas == 2) { 
	            valorTotal = valorEmprestimo * 1.10; 
	            System.out.printf("Empréstimo de R$ %.2f com 12 parcelas resulta em um total de R$ %.2f\n", valorEmprestimo, valorTotal);
	        } else if (parcelas == 3) { 
	            valorTotal = valorEmprestimo * 1.20; 
	            System.out.printf("Empréstimo de R$ %.2f com 24 parcelas resulta em um total de R$ %.2f\n", valorEmprestimo, valorTotal);
	        } else {
	            System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
	        }
	        
	        scanner.close();
	}

}
