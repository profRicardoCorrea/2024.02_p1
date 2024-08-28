package receita;
public class BoloReceita {
	public static void main(String[]args) {
		
		
		
		
		
		//INGREDIENTES
		int xicarasAcucar=2;
		int xicarasFarinhaTrigo=3;
		int colheresSopaMargarina=4;
		int ovos=3;
		double xicarasChaLeite=1.5;
		int colherSopaFermento=1;
		
		boolean ovosTemClara=true;
		boolean ovosTemGema=true;
		
		//---------------------------------
		boolean temClarasNeve=false;
		boolean massaHomogenea=false;
		boolean massaHomogeneaP2=false;
		boolean massaPronta=false;
		boolean formaCOmMassa=false;
		int temperaturaForno=180;
		//MODO PREPARO
		if(ovosTemClara && ovos>0) {
			System.out.println("Batendo Claras em Neve");
			temClarasNeve=true;
		}
		
		
		if(ovosTemGema && colheresSopaMargarina>0 && xicarasAcucar>0) {
			System.out.println("Obtendo massa homogênea");
			massaHomogenea=true;
		}
		
		if(massaHomogenea && xicarasChaLeite>0 && xicarasFarinhaTrigo>0) {
			System.out.println("massa homogênea + leite + trigo");
			massaHomogeneaP2=true;
		}
		
		if(massaHomogeneaP2 && temClarasNeve && colherSopaFermento>0) {
			System.out.println("massa homogênea + leite + trigo+ neve+fermento");
			massaPronta=true;
		}
		if(massaPronta && temperaturaForno==180) {
			formaCOmMassa=true;
		
			for (int tempo = 0; tempo<40;tempo++) {
				System.out.println("MINUTOS:"+tempo);
				
			}
		System.out.println("BOLO PRONTO");
		}
	}

}
