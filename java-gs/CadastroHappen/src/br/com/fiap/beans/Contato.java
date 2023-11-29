package br.com.fiap.beans;

public class Contato {
	private String telefone;
	private String email;
	private String status;
	
	public Contato() {
		super();
	}

	public Contato(String telefone, String email, String status) {
		super();
		this.telefone = telefone;
		this.email = email;
		this.status = status;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
