package gerenciamentoEstoque;

public class Roupas {
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupas(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double calcularValorTotal() {
        return quantidade * valor;
    }

    public void adicionarQuantidade(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
            System.out.println(qtd + " unidades adicionadas.");
        } else {
            System.out.println("Quantidade inválida para adição.");
        }
    }

    public void removerQuantidade(int qtd) {
        if (qtd > 0 && qtd <= this.quantidade) {
            this.quantidade -= qtd;
            System.out.println(qtd + " unidades removidas.");
        } else {
            System.out.println("Quantidade inválida para remoção.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Tipo: " + tipo + " | Tamanho: " + tamanho +
                " | Quantidade: " + quantidade + " | Valor unitário: R$ " + valor +
                " | Valor total: R$ " + calcularValorTotal());
    }
}
