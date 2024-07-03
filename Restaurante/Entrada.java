package Restaurante;
public class Entrada {
    private String nome;
    private double preco;

    public Entrada(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }

    public double calcularValorTotal() {
        return preco;
    }
}
