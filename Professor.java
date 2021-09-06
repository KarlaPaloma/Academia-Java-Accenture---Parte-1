package negocio;

public class Professor extends Pessoa{
	 double salario;
	
	 
	 public Professor() { 
		super();
	}
	 public Professor(String nome, String cpf, int idade, double salario) {
		 super(nome, cpf, idade);
		 this.salario = salario;
	 }
	public Professor(String nome, String sobrenome, String cpf, int idade, double salario) {
		 super(nome, sobrenome, cpf, idade);
		 this.salario = salario;
	 }
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Nome: "+ this.getNome() + "Sobrenome: " + this.getSobrenome() + "CPF: "+ this.getCpf()+
				" Idade: " + this.getIdade() + " Salário: " + this.getSalario();
	}
}
