package Departamento;

class Desenvolvedor1 extends Funcionario {
    private String linguagemDominante;

    public Desenvolvedor1(String nome, int idade, double salario, String linguagemDominante) {
        super(nome, idade, salario);
        this.linguagemDominante = linguagemDominante;
    }

    public Desenvolvedor1(String romulo, int idade, double salario) {
        super(romulo, idade, salario);
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