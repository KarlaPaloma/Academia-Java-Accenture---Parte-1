package negocio;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	
	
	public Pessoa() {
		super();
	}
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
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public Pessoa(String nome, String sobrenome, String cpf, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.idade = idade;
	}
	public String toString() {
		return "Nome: "+ this.getNome() + " Sobrenome: " + this.getSobrenome() + " CPF: "+ this.getCpf()+
				" Idade: " + this.getIdade();
	}
		
}