package views;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String choice = null;
		String choiceSignal;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "**** RPG textual de narrativa baseada nas escolhas do jogador ****\n"
				+ "   ********* por Cristiano dos santos e Gustavo Silva *********"
				+ "\n\n\n======== LOST STAR ==========="
				+ "\n\n**** Cap�tulo 1 - A Queda ****"
				+ "\n\n\n[sons de Alerta] \n\n"
				+ "Voc� a corda com o som do sinal de alerta, luzes de emerg�ncia e piscam e fa�scam cintilam por todo painel de instrumentos do cockpit.\n"
				+ "Ao olhar para o lado voc� ve seu co-piloto inc�nsciente, o indicado do trage indica que ele j� est� sem vida.\n"
				+ "Voc� levanta do acento e se dirige a parte traseira de sua nave, observa que existem algumas caixas de equipamentos, e um trage de combate.\n"
				+ "[veste Trage de combate] \n"
				+ "Ao olhar ao redor existe um painel que pode acionar o sinal de socorro, voc� sabe que o sinal pode ser sua unica chance de ser resgatado, \n"
				+ "mas tamb�m sabe que derrubou sua nave ainda pode estar ouvindo... \n\n"
				
				//tomada de decis�o de a��o sair da nave ou ligar sinal de socorro
				+ "ACIONAR SINAL DE S.O.S ?\n"
				+ "respostas dispon�veis >>>> 'sim'  ou   'n�o'\n");		
				choiceSignal = scan.nextLine();
		

				if(choiceSignal.equalsIgnoreCase("SIM")){
				System.out.println( "[SINAL DE SOCORRO ACIONADO]\n\n"
						+ "[INICIANDO TRANSMISS�O]\n"
						+ "...\n"
						+ "...\n"
						+ "[ANTENA PRINCIPAL DANIFICADA]\n\n"
						+ "...\n"
						+ "...\n"
						+ "...\n"
						+ "[PASSANDO PARA AUXILIAR]\n\n"
						+ "...\n"
						+ "[ALCANCE DO SINAL COMPROMETIDO]\n\n"
						+ "...\n"
						+ "...\n"
						+ "[TRANSMITINDO APENAS PARA SISTEMAS PLANET�RIOS PR�XIMOS]\n\n"
						+ "[REPARE A ANTENA PRINCIPAL TRANSMITIR SINAL INTER-ESTELAR]\n\n");
						
						choice = "sim";
				}
				if(choiceSignal.equalsIgnoreCase("n�o") || choice.equalsIgnoreCase("sim")){
					System.out.println("Voc� se dirige a sa�da da nave...\n"
							+ "A porta se abre e ao sair da nave voc� se depara com uma clareira que a queda abriu em meio a uma floresta...\n"
							+ "ao dar uma breve olhada para sua nave, ve que os danos s�o catrastr�ficos...\n"
							+ "os motores principais, ou oque sobrou de tr�s deles nunca mais mais ir�o voar, \n"
							+ "as armas principais j� n�o existem mais... assim como uma parte da cauda com antena principal e os instrumentos de navega��o e mapas\n"
							+ "\n"
							+ "Voc� ve um rastro de destro�os e uma enorme trincheira de uns 500 metros de comprimento que a quedra abriu... e ao longe uma parte da nave ainda em chamas\n"
							+ "\n"
							+ "At� o momento voc� n�o se depara com nenhum ser vivo no local, est� de noite, a lua do planeta em sua fase mais cheia possibilita uma ilumina��o singular, em meio a escurid�o\n\n"
				
					//tomada de decis�o de a��o sair da nave ou ligar sinal de socorro
					+ "o que fazer? seguir a trincheira ou ir para o outro lado?\n"
					+ "respostas dispon�veis >>>> 'outro lado'  ou   'seguir'\n");
					choice = scan.nextLine();
				}
				
				if(choice.equalsIgnoreCase("outro lado")){
					System.out.println("");
					choice = scan.nextLine();
				}
				
				if(choice.equalsIgnoreCase("seguir")){
					System.out.println("");
					choice = scan.nextLine();					
				}
								
	}

}
