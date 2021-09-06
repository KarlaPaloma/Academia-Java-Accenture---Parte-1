package negocio;

import java.util.List;

import dados.AlunoDAO;

public class TestaAluno {

	public static void main(String[] args) {
		
		System.out.println("Começou!");
		
		AlunoDAO psd = new AlunoDAO();
		
		Curso curso = new Curso("0001", "Programação Java Básico");
		Aluno aluno = new Aluno("Karla Paloma da Silva", "06569000099", 31, curso);
		psd.adiciona(aluno);
		
		System.out.println("Listando todos os alunos cadastrados: ");
		
		List<Aluno> alunos = psd.getLista();
		
		for(int i=0;i<alunos.size();i++){
			System.out.println("=========================================");
            System.out.println("Aluno(a): " + alunos.get(i).getNome());
            System.out.println("CPF: " + alunos.get(i).getCpf());
            System.out.println("Idade: " + alunos.get(i).getIdade());
            System.out.println("Curso: " + alunos.get(i).getCurso().getNome() + " | Código: " +  alunos.get(i).getCurso().getCodigo());
            System.out.println("=========================================");
		}
	
		System.out.println("Terminou!");
		
	}

}
