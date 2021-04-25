package entities.enums;

public enum TipoDeDocumento {
	
	RG("Registro Geral"),
	CPF("Cadastro de Pessoa F�sica");
	
	private String descricao;
	
	TipoDeDocumento(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
