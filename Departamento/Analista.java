package Departamento;

class Analista extends Funcionario {
    private String especialidade;

    public Analista(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    public Analista(String pedro, int idade, double salario) {
            super(pedro, idade, salario);
    }

    @Override
    public double calcularBonusAnual() {
        // Lógica para calcular o bônus anual do Analista
        // Por exemplo: 7% do salário
        return getSalario() * 0.07;
    }

    public double getSalario() {
            return super.getSalario();
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Analista: " + getNome() + ", Idade: " + getIdade() +
                ", Salário: " + getSalario() + ", Especialidade: " + especialidade);
    }

    private String getIdade() {
        String idade    = Integer.toString(this.idade);
        return idade;
    }
}

