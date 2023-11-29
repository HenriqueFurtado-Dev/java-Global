package br.com.fiap.beans;

public class Hospital {
	private String nomeHospital;
	private String descricao;
	private String especialidade;
	private String cnpj;
	
	public Hospital() {
		super();
	}

	public Hospital(String nomeHospital, String descricao, String especialidade, String cnpj) {
		super();
		this.nomeHospital = nomeHospital;
		this.descricao = descricao;
		this.especialidade = especialidade;
		this.cnpj = cnpj;
	}

	public String getNomeHospital() {
		return nomeHospital;
	}

	public void setNomeHospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
