package poo;
 
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Pessoa {
	    
	    // Atributos básicos
	    public String nome;
	    private String sobrenome;
	    private int idade;
	    private String dataNascimento;
	    private String sexo;
	    private String estadoCivil;
	    private String nacionalidade;
	    private String naturalidade;
	    private String etnia;

	    // Atributos de contato
	    private String email;
	    private String telefone;
	    private String celular;
	    private String endereco;
	    private String cidade;
	    private String estado;
	    private String pais;
	    private String cep;
	    
	    // Atributos pessoais
	    private String cpf;
	    private String rg;
	    private String cnh;
	    private String passaporte;
	    private String genero;
	    private String orientacaoSexual;
	    private String tipoSanguineo;
	    private double altura;
	    private double peso;
	    private String corOlhos;
	    private String corCabelo;
	    private String corPele;
	    private String deficiencia;
	    private String idiomasFalados;
	    private String religiao;
	    private String hobbies;
	    
	    // Atributos educacionais e profissionais
	    private String escolaridade;
	    private List<String> cursos;
	    private String profissao;
	    private String cargoAtual;
	    private String empresaAtual;
	    private int anosExperiencia;
	    private List<String> habilidades;
	    private String salarioAtual;
	    
	    // Atributos financeiros
	    private String banco;
	    private String agencia;
	    private String numeroConta;
	    private String tipoConta;
	    private double saldo;
	    private List<String> cartoesCredito;
	    private double rendaMensal;
	    private double gastosMensais;

	    // Atributos familiares
	    private String nomePai;
	    private String nomeMae;
	    private String estadoCivilPais;
	    private int quantidadeFilhos;
	    private List<String> nomeFilhos;
	    private String conjuge;
	    
	    // Atributos de saúde
	    private String planoSaude;
	    private List<String> doencas;
	    private List<String> alergias;
	    private List<String> medicamentos;
	    
	    // Atributos de identificação online
	    private String usuarioInstagram;
	    private String usuarioFacebook;
	    private String usuarioLinkedIn;
	    private String usuarioTwitter;
	    private Map<String, String> outrasRedesSociais;
	    
	    // Atributos de viagem
	    private List<String> paisesVisitados;
	    private String passaporteNumero;
	    private Date dataValidadePassaporte;
	    
	    // Outros atributos diversos
	    private String timeFutebol;
	    private String musicaFavorita;
	    private String filmeFavorito;
	    private String livroFavorito;
	    private String signo;
	    private String tipoPersonalidade;
	    private boolean fumante;
	    private boolean bebe;
	    private boolean praticaEsportes;
	    private String comidaFavorita;
	    private String animalEstimacao;
	    private String corFavorita;

	   
	         
	        private boolean temFilhos;
	        private boolean temAnimais;
	        
	        // Atributos financeiros
	        private double salario;
	        private String numeroContaBancaria;
	        private String nomeBanco;

	       
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
	            return "Nome Completo: " + getNomeCompleto() + "\n" +
	                   "Idade: " + this.idade + "\n" +
	                   "Gênero: " + this.genero + "\n" +
	                   "CPF: " + this.cpf + "\n" +
	                   "Endereço: " + this.endereco + ", " + this.cidade + ", " + this.estado + ", " + this.pais;
	        }
	    

	    // Outros métodos relevantes como validações, cálculos e atualizações podem ser adicionados aqui.
	 
}