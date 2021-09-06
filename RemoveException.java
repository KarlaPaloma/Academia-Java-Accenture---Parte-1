package negocio;

public class RemoveException extends Exception {
	public RemoveException() {
		super("CPF informado não encontrado!");
	}
}
