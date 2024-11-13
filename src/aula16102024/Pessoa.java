package aula16102024;

public class Pessoa {
    public int id;
    protected String nome;
    private String contato;
    private String cpf;
    
   public Pessoa() {
    }
   /* public Pessoa(String nome) {
    	this.nome=nome;
    }*/
    
    public Pessoa(int id, String nome, String contato, String cpf) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

