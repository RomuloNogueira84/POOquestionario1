package Departamento;

class Desenvolvedor extends Funcionario {
    private String linguagemDominante;

    public Desenvolvedor(String nome, int idade, double salario, String linguagemDominante) {
        super(nome, idade, salario);
        this.linguagemDominante = linguagemDominante;
    }

    public Desenvolvedor(String maria, int idade, double salario) {
            super(maria, idade, salario);
    }

    @Override
    public double calcularBonusAnual() {
        // Lógica para calcular o bônus anual do Desenvolvedor
        // Por exemplo: 5% do salário
        return getSalario() * 0.05;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Desenvolvedor: " + getNome() + ", Idade: " + getIdade() +
                ", Salário: " + getSalario() + ", Linguagem Dominante: " + linguagemDominante + "🧑‍💻");
    }

    private String getIdade() {
            return Integer.toString(this.idade);
    }
}

