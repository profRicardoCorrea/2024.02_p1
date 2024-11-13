package aula13112024;

class Analista extends Funcionario {
    private double comissao;

    public Analista(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    // Implementação do método abstrato calcularSalario
    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * comissao);
    }
}
