package bytebank.model;

public class Gerente extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
}
