package aula13112024.interfaces;

//Classe Gerente que implementa Calculavel
class Gerente extends Funcionario {
 private double bonus;

 public Gerente(String nome, double salarioBase, double bonus) {
     super(nome, salarioBase);
     this.bonus = bonus;
 }

 // Implementação do método calcularSalario da interface Calculavel
 @Override
 public double calcularSalario() {
     return salarioBase + bonus;
 }
}

