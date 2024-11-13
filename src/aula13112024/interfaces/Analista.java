package aula13112024.interfaces;

//Classe Analista que implementa Calculavel
class Analista extends Funcionario {
 private double comissao;

 public Analista(String nome, double salarioBase, double comissao) {
     super(nome, salarioBase);
     this.comissao = comissao;
 }

 // Implementação do método calcularSalario da interface Calculavel
 @Override
 public double calcularSalario() {
     return salarioBase + (salarioBase * comissao);
 }
}
