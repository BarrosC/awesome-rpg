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
				+ "\n\n**** Capítulo 1 - A Queda ****"
				+ "\n\n\n[sons de Alerta] \n\n"
				+ "Você a corda com o som do sinal de alerta, luzes de emergência e piscam e faíscam cintilam por todo painel de instrumentos do cockpit.\n"
				+ "Ao olhar para o lado você ve seu co-piloto incônsciente, o indicado do trage indica que ele já está sem vida.\n"
				+ "Você levanta do acento e se dirige a parte traseira de sua nave, observa que existem algumas caixas de equipamentos, e um trage de combate.\n"
				+ "[veste Trage de combate] \n"
				+ "Ao olhar ao redor existe um painel que pode acionar o sinal de socorro, você sabe que o sinal pode ser sua unica chance de ser resgatado, \n"
				+ "mas também sabe que derrubou sua nave ainda pode estar ouvindo... \n\n"
				
				//tomada de decisão de ação sair da nave ou ligar sinal de socorro
				+ "ACIONAR SINAL DE S.O.S ?\n"
				+ "respostas disponíveis >>>> 'sim'  ou   'não'\n");		
				choiceSignal = scan.nextLine();
		

				if(choiceSignal.equalsIgnoreCase("SIM")){
				System.out.println( "[SINAL DE SOCORRO ACIONADO]\n\n"
						+ "[INICIANDO TRANSMISSÃO]\n"
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
						+ "[TRANSMITINDO APENAS PARA SISTEMAS PLANETÁRIOS PRÓXIMOS]\n\n"
						+ "[REPARE A ANTENA PRINCIPAL TRANSMITIR SINAL INTER-ESTELAR]\n\n");
						
						choice = "sim";
				}
				if(choiceSignal.equalsIgnoreCase("não") || choice.equalsIgnoreCase("sim")){
					System.out.println("Você se dirige a saída da nave...\n"
							+ "A porta se abre e ao sair da nave você se depara com uma clareira que a queda abriu em meio a uma floresta...\n"
							+ "ao dar uma breve olhada para sua nave, ve que os danos são catrastróficos...\n"
							+ "os motores principais, ou oque sobrou de três deles nunca mais mais irão voar, \n"
							+ "as armas principais já não existem mais... assim como uma parte da cauda com antena principal e os instrumentos de navegação e mapas\n"
							+ "\n"
							+ "Você ve um rastro de destroços e uma enorme trincheira de uns 500 metros de comprimento que a quedra abriu... e ao longe uma parte da nave ainda em chamas\n"
							+ "\n"
							+ "Até o momento você não se depara com nenhum ser vivo no local, está de noite, a lua do planeta em sua fase mais cheia possibilita uma iluminação singular, em meio a escuridão\n\n"
				
					//tomada de decisão de ação sair da nave ou ligar sinal de socorro
					+ "o que fazer? seguir a trincheira ou ir para o outro lado?\n"
					+ "respostas disponíveis >>>> 'outro lado'  ou   'seguir'\n");
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
