package bytebank.model;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chhamando o método de bonificação EDITOR DE VÍDEO");
		return super.getBonificacao() + 100;
	}
}
