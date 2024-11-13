package aula13112024;

//Classe principal para testar
public class Main {
 public static void main(String[] args) {
     Funcionario gerente = new Gerente("Alice", 5000, 1500);
     Funcionario analista = new Analista("Bob", 4000, 0.10);

     System.out.println("Salário do Gerente: " + gerente.calcularSalario());
     System.out.println("Salário do Analista: " + analista.calcularSalario());
 }
}
