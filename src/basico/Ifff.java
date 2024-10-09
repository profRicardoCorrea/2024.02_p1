package basico;

public class Ifff {
	public static int num2 = 123;

	public int soma(int num) {

		return num + num2;
	}

	public static void main(String[] args) {
		String sinal = "VERDE";
		/* 
		if ( sinal.equals("VERDE")) {
			 System.out.println("SIGA");
			 		 
		}else {
			if(sinal.equals("VERMELHO"))
				System.out.println("PARE");
			else
				System.out.println("ATENCAO");
		}*/
		
		/*if(sinal.equals("VERDE")) {
			System.out.println("SIGA");
		}else {
			System.out.println("OI");
		}
		 
		if(sinal.equals("VERMELHO")) {
			System.out.println("PARE");
		}
		else {System.out.println("ATENCAO");}*/
		
		/*if(sinal.equals("AMARELO")) {
			System.out.println("ATENCAO");
		} 
		 
		else if(sinal.equals("VERMELHO")) {
			System.out.println("PARE");
		}
		else if(sinal.equals("VERDE")) {
			System.out.println("SIGA");}
		else {
			System.out.println("ERRO");
		}*/
		
		/*switch(sinal) {
		  case "VERDE":
			  System.out.println("SIGA");
		    break;
		  case "VERMELHO":
			  System.out.println("PARE");
		    break;
		  case "AMARELO":
			  System.out.println("ATENCAO");
			  break;
		  default:
			  System.out.println("ERRO");
			  
		}*/
		int op=4;
		switch(op) {
		  case 1,2,3:
			  System.out.println("LISTAR");
		    break;
		  case 4,5,6:
			  System.out.println("REMOVER");
		    break;
		  
		  default:
			  System.out.println("ERRO");
			  
		}
		 
	}
}
