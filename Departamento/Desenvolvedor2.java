package Departamento;


class Desenvolvedor2 extends Funcionario {
    private String linguagemDominante;

    public Desenvolvedor2(String nome, int idade, double salario, String linguagemDominante) {
        super(nome, idade, salario);
        this.linguagemDominante = linguagemDominante;
    }

    public Desenvolvedor2(String neto, int idade, double salario) {
        super(neto, idade, salario);
    }

    @Override
    public double calcularBonusAnual() {

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
