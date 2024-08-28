package basico;

public class Metodo {
	public static int soma(int x,int y) {
		int  resultado= x+y;
		return resultado;
	}
	
	public static void  imprimeSoma(String soma) {
		System.out.println("SOMA:"+soma);
		
	}
	public static void main(String []args) {
		//230/30+56*123/980-12*-98
		int[]valores= {230,30,56,123,980,12,-98};
		String [] operadores= {"/","+","*","/","-","*"};
		
		
		
		//int result= soma(23,54);
		String x= "456a";
		imprimeSoma(Integer.toString(soma(23,54)));
		System.out.println(">>>"+(Integer.parseInt(x)+180));
		}
}
