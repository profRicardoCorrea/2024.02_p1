package aula09102024;

public class AulaMain {
	public static void modificaPessoa(Pessoa p) {
		p.setNome(p.getNome()+" Brazil");
		
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
		
		p1.setNome(modificaNome(p1.getNome()));
		System.out.println("GET_NOME:"+p1.getNome());
		
		Pessoa p2=new Pessoa(2,"Ciclano","wewe@g.com","24234234");
		
	}

}
