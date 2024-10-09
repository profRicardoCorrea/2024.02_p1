package poo;

public class PessoaB {

	// Atributos básicos
	private String nome;
	private String sobrenome;
	private int idade;
	private String genero;
	private String cpf;
	private String rg;

	// Atributos de contato
	private String email;
	private String telefone;
	private String endereco;
	private String cidade;
	private String estado;
	private String pais;

	// Atributos físicos
	private double altura;
	private double peso;
	private String tipoSanguineo;

	// Atributos pessoais
	private String estadoCivil;
	private String profissao;
	private String nacionalidade;
	private boolean temFilhos;
	private boolean temAnimais;

	// Atributos financeiros
	private double salario;
	private String numeroContaBancaria;
	private String nomeBanco;

	// Construtor
	public PessoaB(String nome, String sobrenome, int idade, String genero, String cpf, String rg) {
	        this.nome = nome;
	        this.sobrenome = sobrenome;
	        this.idade = idade;
	        this.genero = genero;
	        this.cpf = cpf;
	        this.rg = rg;
	    }

	// Getters e Setters para encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// Métodos adicionais
	public String getNomeCompleto() {
		return this.nome + " " + this.sobrenome;
	}

	public void envelhecer(int anos) {
		this.idade += anos;
	}

	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}

	public void atualizarEndereco(String endereco, String cidade, String estado, String pais) {
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public boolean isMaiorDeIdade() {
		return this.idade >= 18;
	}

	public String imprimirDetalhes() {
		return "Nome Completo: " + getNomeCompleto() + "\n" + "Idade: " + this.idade + "\n" + "Gênero: " + this.genero
				+ "\n" + "CPF: " + this.cpf + "\n" + "Endereço: " + this.endereco + ", " + this.cidade + ", "
				+ this.estado + ", " + this.pais;
	}

	// Métodos que representam ações que a pessoa pode fazer
	public void comer(String comida) {
		System.out.println(this.nome + " está comendo " + comida + ".");
	}

	public void dormir(int horas) {
		System.out.println(this.nome + " está dormindo por " + horas + " horas.");
	}

	public void trabalhar(String trabalho) {
		System.out.println(this.nome + " está trabalhando como " + trabalho + ".");
	}

	public void caminhar(double distancia) {
		System.out.println(this.nome + " está caminhando por " + distancia + " km.");
	}

	public void falar(String mensagem) {
		System.out.println(this.nome + " diz: \"" + mensagem + "\"");
	}

	public void viajar(String destino) {
		System.out.println(this.nome + " está viajando para " + destino + ".");
	}
}
