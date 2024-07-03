package Restaurante;

class Sobremesa extends Refeicao {
    public Sobremesa(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double calcularValorTotal() {
        return getPreco();
    }

    private double getPreco() {
        double preco = 0;
        String nome = getNome();
        if (nome.equals("Petit Gâteau")) {
            preco = 100.0;
        } else {
            preco = 150.0;
        }
        return preco;
    }

    public String getNome() {
        String nome = "";
        nome = getNome();
        return nome;
    }
}

