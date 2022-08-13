package bytebank.model;

public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador = new AutenticacaoUtil();
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
		
	}
	
	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		return 50;
	}
}
