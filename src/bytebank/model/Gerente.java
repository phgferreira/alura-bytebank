package bytebank.model;

public class Gerente extends Funcionario {

	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha == senha)
			return true;
		return false;
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + super.salario;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
