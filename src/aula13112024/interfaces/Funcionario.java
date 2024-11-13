package aula13112024.interfaces;

//Classe Funcionario
class Funcionario implements ICalculavel,ICalculavelINSS {
 protected String nome;
 protected double salarioBase;

 public Funcionario(String nome, double salarioBase) {
     this.nome = nome;
     this.salarioBase = salarioBase;
 }

 public String getNome() {
     return nome;
 }

 @Override
 public double calcularSalario() {
     return salarioBase; // Aqui é uma implementação padrão, se necessário
 }

@Override
public double calcularInss(double salario) {
	
	return salario-0.14*salario;
}
}
