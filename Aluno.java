package negocio;

public class Aluno extends Pessoa{ 
	private Curso curso;
	
	public Aluno() {
		super();
	}
	public Aluno(String nome, String cpf, int idade, Curso curso) {
		super(nome, cpf, idade);
		this.curso = curso;
	}
	public Aluno(String nome, String sobrenome, String cpf, int idade, Curso curso) {
		super(nome, sobrenome, cpf, idade);
		this.curso = curso;
	}
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public String toString() {
		return "Nome: "+ this.getNome() + "| Sobrenome:" + this.getSobrenome() + "| CPF: "+ this.getCpf()+
				"| Idade: " + this.getIdade() + this.getCurso();
	}
		
}
