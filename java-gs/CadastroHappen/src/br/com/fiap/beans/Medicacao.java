package br.com.fiap.beans;

public class Medicacao {
	private String medicacao;
	private String dosagem;
	private String tempo_prescricao;
	private String efeitosColaterais;
	
	public Medicacao() {
		super();
	}

	public Medicacao(String medicacao, String dosagem, String tempo_prescricao, String efeitosColaterais) {
		super();
		this.medicacao = medicacao;
		this.dosagem = dosagem;
		this.tempo_prescricao = tempo_prescricao;
		this.efeitosColaterais = efeitosColaterais;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public String getTempo_prescricao() {
		return tempo_prescricao;
	}

	public void setTempo_prescricao(String tempo_prescricao) {
		this.tempo_prescricao = tempo_prescricao;
	}

	public String getEfeitosColaterais() {
		return efeitosColaterais;
	}

	public void setEfeitosColaterais(String efeitosColaterais) {
		this.efeitosColaterais = efeitosColaterais;
	}
	
	
	
}
