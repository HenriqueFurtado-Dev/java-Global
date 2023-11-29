package br.com.fiap.beans;

public class Profissional {
	private String nome;
	private String idade;
	private String especializacao;
	
	public Profissional() {
		super();
	}

	public Profissional(String nome, String idade, String especializacao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.especializacao = especializacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
}
