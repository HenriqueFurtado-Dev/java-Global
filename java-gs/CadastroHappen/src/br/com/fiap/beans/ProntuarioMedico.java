package br.com.fiap.beans;

public class ProntuarioMedico {
	private String nomeDiagnostico;
	private String dataDiagnostico;
	private String sintomas;
	private String frequencia;
	
	public ProntuarioMedico() {
		super();
	}

	public ProntuarioMedico(String nomeDiagnostico, String dataDiagnostico, String sintomas, String frequencia) {
		super();
		this.nomeDiagnostico = nomeDiagnostico;
		this.dataDiagnostico = dataDiagnostico;
		this.sintomas = sintomas;
		this.frequencia = frequencia;
	}

	public String getNomeDiagnostico() {
		return nomeDiagnostico;
	}

	public void setNomeDiagnostico(String nomeDiagnostico) {
		this.nomeDiagnostico = nomeDiagnostico;
	}

	public String getDataDiagnostico() {
		return dataDiagnostico;
	}

	public void setDataDiagnostico(String dataDiagnostico) {
		this.dataDiagnostico = dataDiagnostico;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	
	
	
}
