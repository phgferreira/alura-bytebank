package bytebank.model;

public class Cliente implements Autenticavel {

	private int senha;
	
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha)
			return true;
		return false;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	
	
//	private String nome;
//	private String cpf;
//	private String profissao;
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public String getCpf() {
//		return cpf;
//	}
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
//	public String getProfissao() {
//		return profissao;
//	}
//	public void setProfissao(String profissao) {
//		this.profissao = profissao;
//	}
	
	
}
