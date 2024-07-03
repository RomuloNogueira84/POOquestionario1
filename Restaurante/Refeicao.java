package Restaurante;

abstract class Refeicao {
    private String nome;
    private double preco;

    public Refeicao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularValorTotal();

    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }

    protected String getNome() {
        return null;
    }
}

