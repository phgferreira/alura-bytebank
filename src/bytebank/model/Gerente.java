package bytebank.model;

public class Gerente extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
}
