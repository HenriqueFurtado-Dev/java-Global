package br.com.fiap.beans;

public class Paciente {
	private String nome;
	private String dtNascimento;
	private int Idade;
	private String tipoSanguinio;
	private Responsavel responsavel;
	
	public Paciente() {
		super();
	}
	
	public Paciente(String nome, String dtNascimento, int idade, String tipoSanguinio) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		Idade = idade;
		this.tipoSanguinio = tipoSanguinio;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDtNascimento() {
		return dtNascimento;
	}
	
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public int getIdade() {
		return Idade;
	}
	
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	public String getTipoSanguinio() {
		return tipoSanguinio;
	}
	
	public void setTipoSanguinio(String tipoSanguinio) {
		this.tipoSanguinio = tipoSanguinio;
	}
	
	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	
	
}

