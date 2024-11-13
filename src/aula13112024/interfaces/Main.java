package aula13112024.interfaces;

//Classe principal para testar
public class Main {
 public static void main(String[] args) {
     ICalculavel gerente = new Gerente("Alice", 5000, 1500);
     ICalculavel analista = new Analista("Bob", 4000, 0.10);

     System.out.println("Salário do Gerente: " + gerente.calcularSalario());
     System.out.println("Salário do Analista: " + analista.calcularSalario());
 }
}
