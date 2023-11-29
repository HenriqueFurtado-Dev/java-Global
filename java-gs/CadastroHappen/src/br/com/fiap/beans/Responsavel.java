package br.com.fiap.beans;

public class Responsavel {
	private String nome;
	private String dtNascimento;
	private int Idade;
	private String parentesco;
	
	public Responsavel() {
		super();
	}

	public Responsavel(String nome, String dtNascimento, int idade, String parentesco) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		Idade = idade;
		this.parentesco = parentesco;
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

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
}
