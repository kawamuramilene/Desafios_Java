package gerenciamentoEstoque;

import java.util.ArrayList;
import java.util.Scanner;

class Roupa {
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void adicionarQuantidade(int qtd) {
        quantidade += qtd;
        System.out.println("Quantidade adicionada. Novo estoque: " + quantidade);
    }

    public void removerQuantidade(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Quantidade removida. Novo estoque: " + quantidade);
        } else {
            System.out.println("Erro: Não há quantidade suficiente para remover.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Tipo: " + tipo + " | Tamanho: " + tamanho 
            + " | Quantidade: " + quantidade + " | Valor: R$ " + valor);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Roupa> estoque = new ArrayList<>();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1 - Registrar nova roupa");
            System.out.println("2 - Adicionar quantidade");
            System.out.println("3 - Remover quantidade");
            System.out.println("4 - Exibir estoque");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            if (opcao == 1) {
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Tipo (camisa, calça, vestido, etc.): ");
                String tipo = scanner.nextLine();
                System.out.print("Tamanho (P, M, G, etc.): ");
                String tamanho = scanner.nextLine();
                System.out.print("Quantidade inicial: ");
                int quantidade = scanner.nextInt();
                System.out.print("Valor unitário: ");
                double valor = scanner.nextDouble();

                Roupa novaRoupa = new Roupa(marca, tipo, tamanho, quantidade, valor);
                estoque.add(novaRoupa);
                System.out.println("Roupa adicionada ao estoque!");

            } else if (opcao == 2) {
                System.out.println("Escolha o índice da roupa para adicionar quantidade:");
                for (int i = 0; i < estoque.size(); i++) {
                    System.out.println(i + " - " + estoque.get(i).getMarca() + " (" + estoque.get(i).getTipo() + ")");
                }
                int indice = scanner.nextInt();
                System.out.print("Quantidade a adicionar: ");
                int qtd = scanner.nextInt();
                estoque.get(indice).adicionarQuantidade(qtd);

            } else if (opcao == 3) {
                System.out.println("Escolha o índice da roupa para remover quantidade:");
                for (int i = 0; i < estoque.size(); i++) {
                    System.out.println(i + " - " + estoque.get(i).getMarca() + " (" + estoque.get(i).getTipo() + ")");
                }
                int indice = scanner.nextInt();
                System.out.print("Quantidade a remover: ");
                int qtd = scanner.nextInt();
                estoque.get(indice).removerQuantidade(qtd);

            } else if (opcao == 4) {
                System.out.println("Estoque Atual:");
                for (Roupa roupa : estoque) {
                    roupa.exibirInformacoes();
                }

            } else if (opcao == 5) {
                System.out.println("Programa encerrado.");
                break;

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
