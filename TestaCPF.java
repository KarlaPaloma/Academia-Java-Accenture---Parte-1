package negocio;

import dados.RepositorioAlunosArray;

public class TestaCPF {

	public static void main(String[] args) {
		
		RepositorioAlunosArray rep = new RepositorioAlunosArray(10);
		
		Curso curso1 = new Curso();
		
		Aluno aluno1 = new Aluno("Melissa", "sobrenome", "06564099401", 32, curso1);
		rep.inserir(aluno1);
		
		Aluno aluno2 = new Aluno("Andrews", "santiago", "07155650447", 31, curso1);
		rep.inserir(aluno2);
		
		Aluno procurado = rep.procurar("06564099401");
		System.out.println("Aluno encontrado: "+ procurado.getCpf());
		
		procurado = rep.procurar("07155650447");
		if(procurado == null) {
			System.out.println("Não existe registro de aluno com o CPF informado.");
		}else {
			rep.remover("07155650447");
			System.out.println("Aluno "+ procurado.getCpf() + " removido!");
		}
	}

}
