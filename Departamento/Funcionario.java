package Departamento;

abstract class Funcionario {
    protected int idade;
    private String nome;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public abstract double calcularBonusAnual();

    public abstract void imprimirDetalhes();

    protected double getSalario() {
            return salario;
    }

    protected String getNome() {
        return nome;
    }
}


