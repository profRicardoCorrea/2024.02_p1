package aula13112024;

abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato: não tem implementação e deve ser implementado pelas subclasses
    public abstract double calcularSalario();

    // Método concreto
    public String getNome() {
        return nome;
    }
}
