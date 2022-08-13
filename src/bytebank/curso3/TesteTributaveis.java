package bytebank.curso3;

import bytebank.model.CalculadorDeImposto;
import bytebank.model.ContaCorrente;
import bytebank.model.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(contaCorrente);
		calculador.registra(seguro);
		
		System.out.println(calculador.getTotalImposto());

	}

}
