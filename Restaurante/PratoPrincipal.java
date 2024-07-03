package Restaurante;

class PratoPrincipal extends Refeicao {
    public PratoPrincipal(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularValorTotal() {
        return getPreco();
    }

    private double getPreco() {
        double preco = 0;
        String nome = super.getNome();
        if (nome != null && nome.equals("Tartar de Salmao")) {
            preco = 150.0;
        } else {
            preco = 100.0;
        }
        return preco;
    }
}





