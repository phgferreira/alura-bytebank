package bytebank.curso3;

import bytebank.model.Administrador;
import bytebank.model.Gerente;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		Administrador administrador = new Administrador();
		administrador.setSenha(3333);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente);
		sistema.autentica(administrador);
	}

}
