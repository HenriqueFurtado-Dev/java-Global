package br.com.fiap.beans;

public class Sintomas {
	private int sintoma;
	private int dor;
	
	public Sintomas() {
		super();
	}
	
	public Sintomas(int sintoma, int dor) {
		super();
		this.sintoma = sintoma;
		this.dor = dor;
	}
	
	public int getSintoma() {
		return sintoma;
	}
	public void setSintoma(int sintoma) {
		this.sintoma = sintoma;
	}
	public int getDor() {
		return dor;
	}
	public void setDor(int dor) {
		this.dor = dor;
	}
	
	public void gravidade(){
		if (sintoma == 1) {
			System.out.println("Gravidade: Baixa");
		} else if (sintoma == 2) {
			System.out.println("Gravidade: Baixa");
		} else if (sintoma == 3) {
			System.out.println("Gravidade: Media");
		} else if (sintoma == 4) {
			System.out.println("Gravidade: Alta");
		} else if (sintoma == 5) {
			System.out.println("Gravidade: Urgencia - IMEDIATA");
		} else {
			System.out.println("Nao foi possivel verificar");
		}
	}
	
	public void urgencia(){
		if (dor == 1) {
			System.out.println("Tempo maximo de espera: Nao precisa de atendimento imediato");
		} else if (dor == 2) {
			System.out.println("Tempo maximo de espera: Até 40 minutos");
		} else if (dor == 3) {
			System.out.println("Tempo maximo de espera: Até 30 minutos");
		} else if (dor == 4) {
			System.out.println("Tempo maximo de espera: Até 10 minutos");
		} else if (dor == 5) {
			System.out.println("Tempo maximo de espera: IMEDIATA");
		}
	}
	
	public void autoAtendimento() {
		if (sintoma == 1) {
	        System.out.println("\n\n1. Repouso: Garanta que a crianca descanse o suficiente para permitir a recuperacao.\n" +
                    "2. Hidratacao: Ofereca liquidos como agua, sucos naturais e sopas para manter a hidratacao.\n" +
                    "3. Alimentacao leve: Proporcione refeicões leves e nutritivas para ajudar na recuperacao.\n" +
                    "4. Medicamentos: Consulte um médico antes de administrar qualquer medicamento. Use apenas os recomendados pelo profissional.\n" +
                    "5. Ambiente confortavel: Mantenha o ambiente onde a crianca esta descansando confortavel e aquecido.\n" +
                    "6. Lave as maos: Incentive a crianca a lavar as maos regularmente para evitar a propagacao do virus.\n" +
                    "7. Evite contato próximo: Reduza o contato da crianca com outras pessoas para evitar a propagacao da gripe.\n" +
                    "8. Procure ajuda médica: Se os sintomas persistirem ou piorarem, consulte um médico.");
		} else if (sintoma == 2) {
	        System.out.println("\n\n1. Acalme a crianca: Tranquilize-a e assegure-a de que você esta ali para ajudar.\n" +
                    "2. Ambiente tranquilo: Coloque a crianca em um ambiente calmo e sem muita luz.\n" +
                    "3. Descanso: Encoraje-a a descansar e relaxar.\n" +
                    "4. Hidratacao: Certifique-se de que a crianca esta bem hidratada. Ofereca agua para evitar desidratacao.\n" +
                    "5. Evite telas: Diminua o uso de dispositivos eletrônicos, pois a luz pode piorar a dor de cabeca.\n" +
                    "6. Compressa fria ou quente: Coloque uma compressa fria ou quente na testa da crianca, conforme preferência dela.\n" +
                    "7. Medicacao: Consulte um profissional de saúde antes de administrar qualquer medicamento. Se for permitido, use a dose apropriada para a idade.\n" +
                    "8. Procure ajuda profissional: Se a dor de cabeca persistir ou piorar, consulte um médico.");
		} else if (sintoma == 3) {
	        System.out.println("\n\n1. Monitorar a temperatura: Meca a temperatura da crianca regularmente para acompanhar a febre.\n" +
                    "2. Hidratacao: Mantenha a crianca bem hidratada, oferecendo agua, sucos ou sopas leves.\n" +
                    "3. Roupas leves: Vista a crianca com roupas leves para ajudar na dissipacao do calor.\n" +
                    "4. Banho morno: Dê um banho morno para ajudar a baixar a temperatura do corpo.\n" +
                    "5. Medicamentos: Consulte um médico antes de administrar qualquer medicamento para reduzir a febre.\n" +
                    "6. Descanso: Certifique-se de que a crianca descanse o suficiente para auxiliar na recuperacao.\n" +
                    "7. Ambiente confortavel: Mantenha o ambiente onde a crianca esta descansando confortavel e fresco.\n" +
                    "8. Procure ajuda médica: Se a febre persistir por mais de alguns dias, consulte um médico.");
		} else if (sintoma == 4) {
			System.out.println("\n\n1. Chame ajuda: Peca ajuda de emergência imediatamente. Ligue para o servico de emergência ou procure socorro médico.\n" +
                    "2. Nao mova a pessoa desnecessariamente: Evite mover a pessoa a menos que seja absolutamente necessario para garantir a seguranca.\n" +
                    "3. Imobilizacao: Se possivel, imobilize o membro quebrado com talas, panos firmes ou objetos disponiveis.\n" +
                    "4. Elevacao: Eleve o membro, se possivel, para reduzir o inchaco.\n" +
                    "5. Compressas frias: Aplique compressas frias no local para reduzir a dor e o inchaco.\n" +
                    "6. Alivio da dor: Se a pessoa estiver consciente e nao houver contraindicacões, você pode oferecer analgésicos de venda livre.\n" +
                    "7. Mantenha a pessoa aquecida: Cubra a pessoa com um cobertor para evitar a hipotermia, especialmente se estiver esperando ajuda ao ar livre.\n" +
                    "8. Fique com a pessoa: Mantenha-se próximo da pessoa, forneca conforto e tranquilize-a até que a ajuda chegue.");
		} else if (sintoma == 5) {
			System.out.println("\n\n1. Chame ajuda de emergência: Ligue para uma ambulância ou procure socorro médico imediatamente.\n" +
                    "2. Nao mova a pessoa desnecessariamente: Evite movimentos que possam piorar a lesao.\n" +
                    "3. Mantenha a calma: Tanto você quanto a vitima precisam manter a calma para lidar com a situacao.\n" +
                    "4. Nao tente colocar o osso de volta no lugar: Isso deve ser feito por profissionais de saúde.\n" +
                    "5. Cubra a ferida: Use um pano limpo ou gaze esterilizada para cobrir a ferida e evitar a entrada de sujeira.\n" +
                    "6. Evite pressionar a area: Nao aplique pressao direta sobre a fratura exposta.\n" +
                    "7. Eleve a area, se possivel: Elevar a extremidade afetada pode ajudar a reduzir o inchaco.\n" +
                    "8. Mantenha a pessoa aquecida: Cubra a pessoa com um cobertor para evitar a hipotermia, especialmente se estiver esperando ajuda ao ar livre.");
		} else {
			System.out.println("Nao foi possivel verificar");
		}
	}


}
