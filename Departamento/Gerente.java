package Departamento;

class Gerente extends Funcionario {
    private String areaResponsavel;

    public Gerente(String nome, int idade, double salario, String areaResponsavel) {
        super(nome, idade, salario);
        this.areaResponsavel = areaResponsavel;
    }

    public Gerente(String joão, int idade, double salario) {
        super(joão, idade, salario);
    }

    @Override
    public double calcularBonusAnual() {
        // Lógica para calcular o bônus anual do Gerente
        // Por exemplo: 10% do salário
        return getSalario() * 0.1;
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Gerente: " + getNome() + ", Idade: " + getIdade() +
                ", Salário: " + getSalario() + ", Área Responsável: " + areaResponsavel);
    }

    private String getIdade() {
            String idade    = Integer.toString(this.idade);
            return idade;
    }
}

