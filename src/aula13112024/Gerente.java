package aula13112024;

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    // Implementação do método abstrato calcularSalario
    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
