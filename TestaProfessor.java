package negocio;

import java.util.List;

import dados.ProfessorDAO;

public class TestaProfessor {

	public static void main(String[] args) {
		
		System.out.println("Começou!");
		
		ProfessorDAO prof = new ProfessorDAO();
		
		Professor professor = new Professor("Juliana Mafra", "086.876.097-00", 30, 15000);
		
		prof.adiciona(professor);
		
		System.out.println("Listando todos os professores cadastrados: ");
		
		List<Professor> professores = prof.getLista();
		
		for(int i=0;i<professores.size();i++){
			System.out.println("=========================================");
            System.out.println("Professor(a): " + professores.get(i).getNome());
            System.out.println("CPF: " + professores.get(i).getCpf());
            System.out.println("Idade: " + professores.get(i).getIdade());
            System.out.println("Salário: " + professores.get(i).getSalario());
            System.out.println("=========================================");
		}
	
		System.out.println("Terminou!");

	}

}
