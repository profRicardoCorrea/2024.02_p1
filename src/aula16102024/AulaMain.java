package aula16102024;

public class AulaMain {
	public static void imprimePessoa(Pessoa p) {
		
		System.out.println(p.getNome());
		System.out.println(p.getCpf());
	}
	public static void modificaPessoa(Pessoa p) {
		p.setNome("2w3"+p.getNome()+" Brazil OBJETO");	
		System.out.println("NOME:"+p.getNome());
	}
	public static String modificaNome(String nome) {
		String nomeModificado=nome+" Brazil";
		System.out.println(nomeModificado);
		return nomeModificado;
	}
	public static void main(String[] args) {
		Pessoa p1= new Pessoa();		
		p1.setContato("81 9999999");
		p1.setCpf("8787878787878");
		p1.setNome("Fulano");
		p1.setId(1);		
		//String retornoFuncao=modificaNome(p1.getNome());
		//p1.setNome(retornoFuncao);
		
		//modificaPessoa(p1);
		//System.out.println("GET_NOME:"+p1.getNome());
		
		//Pessoa p2=new Pessoa(2,"Ciclano","wewe@g.com","24234234");
		
		Aluno a1=new Aluno();
		a1.matricula=2335245;
		a1.salario=30000;
		a1.nome="Fulano Aluno";
		
		/*Pessoa p3=a1;
		System.out.println(p3.getNome());
		
		Funcionario f1=a1;
		System.out.println(f1.salario);*/
		
		Funcionario f1=new Funcionario();
		f1.setNome("Beltrano f");
		f1.salario=234456;
		
		imprimePessoa(p1);
		imprimePessoa(a1);
		imprimePessoa(f1);
		
		
	}

}
