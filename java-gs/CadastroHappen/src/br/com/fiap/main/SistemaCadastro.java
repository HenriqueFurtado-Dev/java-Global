package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Contato;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.EnderecoHospital;
import br.com.fiap.beans.Hospital;
import br.com.fiap.beans.Paciente;
import br.com.fiap.beans.Profissional;
import br.com.fiap.beans.Responsavel;
import br.com.fiap.beans.Sintomas;

public class SistemaCadastro {

	/* JOP */
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String string) {
		return Integer.parseInt(JOptionPane.showInputDialog(string));
	}
	
	static double Double (Double j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}	
	
	
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao Happen! Vamos iniciar seu cadastro");
		Paciente objPaciente = new Paciente(
				texto("Digite seu nome: "),
				texto("Digite sua data de nascimento: "),
				inteiro("Digite sua idade: "),
				texto("Informe seu tipo sanguinio: ")
				);
		
		JOptionPane.showMessageDialog(null, "Informe os dados do Responsável por " + objPaciente.getNome());
		Responsavel objResponsavel = new Responsavel(
				texto("(Responsável) Digite seu nome: "),
				texto("(Responsável)Digite sua data de nascimento: "),
				inteiro("(Responsável) Digite sua idade: "),
				texto("Informe seu parentesco com paciente " + objPaciente.getNome() + ": ")
				);
		
		JOptionPane.showMessageDialog(null, "Informações de contato");
		Contato objContato = new Contato(
				texto("Digite um Telefone de Contato: "),
				texto("Digite um email de Contato: "),
				"Ativo"
				);
		
		JOptionPane.showMessageDialog(null, "Endereço de contato");
		Endereco objEndereco = new Endereco(
				texto("Digite o logradouro: "),
				inteiro("Digite o numero do endereco "),
				texto("Digite o bairro: "),
				texto("Digite o cidade: "),
				texto("Digite o estado: ")
				);
		
		JOptionPane.showMessageDialog(null, "Sintomas do paciente");
		
		Sintomas objSintomas = new Sintomas(
				inteiro("Informe qual o sintoma: \n1 - Gripe \n2-Dor de cabeça \n3-Febre \n4-Membro Quebrado \n5-Fratura Exposta"),
				inteiro("Qual o nível da dor \n1-Fraca \n2-Leve \n3-medio \n4-Alta \n5-Grave")
				);
		
		Hospital objHospital = new Hospital(
				"NotreDame Paulista",
				"Pronto socorro, consultas agendadas e mais",
				"Hospital Generalista",
				"12.345.678/0001-00"
				);
		
		EnderecoHospital objEnderecoHospital = new EnderecoHospital(
				null,
				"NotreDame Paulista",
				1220,
				"Hospital Generalista",
				"12.345.678/0001-00",
				"São Paulo"
				);
		
		Profissional objProfissional = new Profissional(
				"Dr. Rafael Desida",
				"41",
				"Médico Geral"
				);

		System.out.println(
				"--- Informacoes do Paciente ---" +
				"\nNome do paciente: " + objPaciente.getNome() +
				"\nData de Nascimento: " + objPaciente.getDtNascimento() +
				"\nIdade do paciente: " + objPaciente.getIdade() +
				"\nTipo Sanguinio: " + objPaciente.getTipoSanguinio() +
				
				"\n\n--- Informacoes do Responsavel --- " +
				"\nNome do Responsável: " + objResponsavel.getNome() +
				"\nData de Nascimento do Responsável: " + objResponsavel.getDtNascimento()+
				"\nIdade: " + objResponsavel.getIdade() +
				"\nParentesco: " + objResponsavel.getParentesco() +
				
				"\n\n--- Informacoes de Contato / Endereco --- " +
				"\nLogradouro: " + objEndereco.getLogradouro() +
				"\nNumero: " + objEndereco.getNumero() +
				"\nBairro: " + objEndereco.getBairro() +
				"\nCidade: " + objEndereco.getCidade() +
				"\nEstado: " + objEndereco.getEstado() +
				"\n\nTelefone: " + objContato.getStatus() +
				"\nEmail: " + objContato.getEmail() +
				"\nStatus: " + objContato.getStatus() +
				
				"\n\n--- Informacoes do Hospital --- " +
				"\nHospital: " + objHospital.getNomeHospital() +
				"\nDescrição: " + objHospital.getDescricao() +
				"\nEspecialidade: " + objHospital.getEspecialidade() +
				"\nCNPJ: " + objHospital.getCnpj() +
				
				"\n--- Endereco Hospital --- " +
				"\nLogradouro: " + objEnderecoHospital.getLogradouro() +
				"\nNumero: " + objEnderecoHospital.getNumero() +
				"\nBairro: " + objEnderecoHospital.getBairro() +
				"\nCidade: " + objEnderecoHospital.getCidade() +
				"\nEstado: " + objEnderecoHospital.getEstado() +
				
				"\n--- Profissional --- " +
				"Abaixo esta as informacoes do profissional que ira atender o/a " + objPaciente.getNome() +
				"\n Nome do Medico: " + objProfissional.getNome() +
				"\nIdade do Medico: " + objProfissional.getIdade() +
				"\nEspecialidade do Medico: " + objProfissional.getEspecializacao() +
				"\n\n" +
				"\n--- ATENDIMENTO - GRAVIDADE --- " 
				);
		
		
		objSintomas.gravidade();
		objSintomas.urgencia();
		objSintomas.autoAtendimento();
		
	}

}
