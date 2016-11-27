package views;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String choice = null;
		String choiceSignal = null;
		String choiceTrilha = null;
		String choiceOutroLado = null;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "**** RPG textual de narrativa baseada nas escolhas do jogador ****\n"
				+ "   ********* por Cristiano Barros e Gustavo Silva ********* \n\n"
				+ " ██████████╗  █████████╗    ██╗     ██████╗███████████████╗                              \n"
				+ " ╚══██╔══██║  ████╔════╝    ██║    ██╔═══████╔════╚══██╔══╝                              \n"
				+ "    ██║  ████████████╗      ██║    ██║   █████████╗  ██║                                 \n"
				+ "    ██║  ██╔══████╔══╝      ██║    ██║   ██╚════██║  ██║                                 \n"
				+ "    ██║  ██║  █████████╗    ███████╚██████╔███████║  ██║                                 \n"
				+ "    ╚═╝  ╚═╝  ╚═╚══════╝    ╚══════╝╚═════╝╚══════╝  ╚═╝                                 \n"
				+ " ███████████████╗█████╗██████╗     █████████╗██████╗██╗  ████████╗█████████████████████╗ \n"
				+ " ██╔════╚══██╔══██╔══████╔══██╗    ██╔════████╔════╝██║  ████╔══██╚══██╔══██╔════██╔══██╗\n"
				+ " ███████╗  ██║  █████████████╔╝    █████╗ ████║  ████████████████╔╝  ██║  █████╗ ██████╔╝\n"
				+ " ╚════██║  ██║  ██╔══████╔══██╗    ██╔══╝ ████║   ████╔══████╔══██╗  ██║  ██╔══╝ ██╔══██╗\n"
				+ " ███████║  ██║  ██║  ████║  ██║    ██║    ██╚██████╔██║  ████║  ██║  ██║  █████████║  ██║\n"
				+ " ╚══════╝  ╚═╝  ╚═╝  ╚═╚═╝  ╚═╝    ╚═╝    ╚═╝╚═════╝╚═╝  ╚═╚═╝  ╚═╝  ╚═╝  ╚══════╚═╝  ╚═╝\n\n"
				+ ".		.	.			.					.					\n"
				+ "     .     _,---.__          .     .         ________,-----.__      .         .    .     \n"
				+ "          /_________`-------._    .      _,-'      ___ ---    `--._            .\n"
				+ "      .    ,----------------------------<         |   |---     `-._`-._	  .		  .  \n"
				+ "   .      (======(    ==============   | )  - - - - - - - - - - - - - - >.    . \n"
				+ "  .   .    `----------------------------'         |___|---       __,--'    .    .    .\n"
				+ "       .     `|     ,-----.----.-----._______________________,--'  .     .  \n"
				+ "     .    .   |____/     _|____|_     _|_____|_	 	. .    . .        	     .\n"
				+ "		.					.			.            	   	\n"
				+ "**** Capítulo 1 - O Local Queda ****"
				+ "\n\n\n[sons de Alerta] \n\n"
				+ "Você a corda com o som do sinal de alerta, luzes de emergência piscam, faíscas estão cintilando em várias partes do painel de instrumentos e do cockpit.\n"
				+ "Ao olhar para o lado você ve seu co-piloto incônsciente, o indicador do traje mostra que ele já está sem vida, não há nada que você possa fazer.\n"
				+ "Você levanta do acento e se dirige a parte traseira de sua nave, observa que existem algumas caixas de suprimentos, outras de equipamentos militar, e um trage de combate.\n"
				+ "você veste o trage, pois ele possui uma unidade médica de campo, capaz de realiza diagnósticos e análises de sinais vitais do usuário\n"
				+ "o visor do trage se iniicia assim que você coloca o capacete...\n\n"
				+ "[Inicializando...]\n"
				+ "[Inicializando...]\n"
				+ "[Inicializando...]\n"
				+ "[Inicializando...]\n\n"
				+ "[USUÁRIO IDENTIFICADO]\n"
				+ "[FUZILEIRO ESTELAR XXXXXXXXXX - NÙMERO DE SERVIÇO: 20-131]\n\n"
				+" [INICIANDO DIAGNÓSTICO...]\n"
				+ "[UNIDADE MÉDICA ATIVADA...]\n\n"
				+ "[ESTABILIZAR. 250 MILIGRAMAS DE SANSUFETANIL : Aplicados]\n"
				+ "[ATENÇÃO EFEITOS COLATERIAS TEMPORÁRIOS: Náusea, tontura, coordenação motora pode ser prejudicada.]\n\n"
				
				+ "Você abre as caixar de equipamento e pega um Rifle de Plama e uma Pistola de ions, esta que pode atordoar alvos.\n"
				+ "Ao olhar ao redor existe fio soltando faíscas que pode religar um painel que aciona o sinal de socorro, você sabe que o sinal pode ser sua unica chance de ser resgatado, \n"
				+ "mas também sabe que derrubou sua nave ainda pode estar ouvindo... \n\n"
				
				//tomada de decisão de ação sair da nave ou ligar sinal de socorro
				+ "ACIONAR SINAL DE S.O.S ?\n\n"
				+ "respostas disponíveis >>>> 'sim'  ou 'não' ou 'nao fazer nada'\n"
				+ "||Aguardando decisão||");
				choiceSignal = scan.nextLine();
		

				if(choiceSignal.equalsIgnoreCase("SIM")){
				System.out.println( "[SINAL DE SOCORRO ACIONADO]\n"
						+ "[INICIANDO TRANSMISSÃO]\n"
						+ "...\n"
						+ "...\n"
						+ "[ANTENA PRINCIPAL DANIFICADA]\n"
						+ "...\n"
						+ "...\n"
						+ "...\n"
						+ "[PASSANDO PARA AUXILIAR]\n"
						+ "...\n"
						+ "[ALCANCE DO SINAL COMPROMETIDO]\n"
						+ "...\n"
						+ "...\n"
						+ "[TRANSMITINDO APENAS PARA SISTEMAS PLANETÁRIOS PRÓXIMOS]\n\n"
						+ "[:::: RECOMENDAÇÃO ::::]\n"
						+ "[REPARAR A ANTENA PRINCIPAL PARA TRANSMITIR SINAL INTER-ESTELAR]\n\n");
						
						choice = "sim";
				
				if(choiceSignal.equalsIgnoreCase("NÃO") || choiceSignal.equalsIgnoreCase("NAO") || choice.equalsIgnoreCase("SIM")){
					System.out.println("Você se dirige a saída da nave...\n"
							+ "A porta se abre e ao sair da nave você se depara com uma clareira que a queda abriu em meio a uma floresta...\n"
							+ "ao dar uma breve olhada para sua nave, ve que os danos são catrastróficos...\n"
							+ "os motores principais, ou oque sobrou de três deles nunca mais mais irão voar, \n"
							+ "as armas principais já não existem mais... assim como uma parte da cauda com antena principal e os instrumentos de navegação e mapas\n"
							+ "\n"
							+ "Você ve um rastro de destroços e uma enorme trincheira de uns 500 metros de comprimento que a quedra abriu... e ao longe uma parte da nave ainda em chamas\n"
							+ "\n"
							+ "Até o momento você não se depara com nenhum ser vivo no local, está de noite, a lua do planeta em sua fase mais cheia possibilita uma iluminação singular, em meio a escuridão\n"
							+ "Você acha melhor explorar a área ao redor, análisar o terreno e garantir a segurança para analisar qual será o próximno passo\n\n"
				
					//tomada de decisão de ação - seguir caminho da trincheira e destroços, ou ir para outro lado
					+ "o que fazer? 'seguir trilha' de destroços ou ir para o 'outro lado'?\n\n"
					+ "respostas disponíveis >>>> 'seguir trilha' ou 'outro lado'\n"
					+ "||Aguardando decisão||");
					choice = scan.nextLine();
				
				
				
				if(choice.equalsIgnoreCase("OUTRO LADO")){
					System.out.println("Você marca a nave no touch pad no ante-braço do trage e coloca em modo mapeamento, isto não deixará você se perder e ainda vai mapear o terreno.\n"
							+ "A floresta é densa, árvores grandes e altas em um terreno irregular.\n"
							+ "após andar alguns quilometros você ouve sons estranhos, animais talves?... \n"
							+ "você vai investigar a direção de onde veio o som, mas antes que possa chegar ao local, ouve um grito de mulher.\n"
							+ "ao chegar ao local você ses depara com criaturas estranhas que você ainda não tinha encontrado em suas viagens e batalhas.\n"
							+ "essas criatuaras estão tentando pegar uma jovem que tenta se esconder, embora com dificuldade, em uma caverna em um terreno elevado.\n"
							
							//tomada de decisão de ação - Atacar e ajdudar ou não se envolver
							+ "você consegue identificar 3 hostis, e se pergunta se deve se envolver ou seguir seu caminho...\n"
							+ "respostas disponíveis >>>> 'Atacar' ou 'não se envolver'\n"
							+ "||Aguardando decisão||");
						
					choiceOutroLado = scan.nextLine();
					if(choice.equalsIgnoreCase("ATACAR")){
						System.out.println("Você pega seu rifle de plasma e mira no hostil mais próximo...\n");
						
						//iniciar mecanica de combate com players atacando primeiro
						/*
						 * ATRIBUTOS DO PLAYER
						 * DANO: baseado no dano da arma (5pts + Dado de 8 Lados)
						 * DEFESA: baseado na defesa do traje ( 10 pts + Dado de 6 lados)
						 * 
						 * ATRIBUTOS DA CRIATURA
						 * DEFESA: 2 dados de 10 lados
						 * ATAQUE: 2 Dados de 6 lados
						 * 
						 * TESTES DE SUCESSO
						 * ATAQUE >>>> 1 D20 para Atacante versus 1D20 do Defensor
						 * diferenças de 1 a 5pts = ataque com sucesso
						 * diferenças de 6 a 10pts = ataque com sucesso parcial metade do dano
						 * diferenças de 11 a 15pts = ataque com com sucesso pequeno 1/3 do dano
						 * diferenças de +12pts = Ataque falhou
						 * 
						 * Caso o atacante tire 20 e o o dano é dobrado
						 * todos danos são subtratidos das defesas do defensor tirando o resultado da quantidade de pts de vida
						 */
					}
					
					if(choiceOutroLado.equalsIgnoreCase("NÃO SE ENVOLVER")){
						System.out.println("Você gostaria de ajudar, mas já tem seus próprios problemas...\n"
								+ "mas quando se distancia mais criaturas aparecem a frente, e uma já te viu e está vindo em sua direção para atacá-lo.\n");
						
						//iniciar mecanica de combate com criaturas atacando primeiro
					}
					
				}
				
				if(choice.equalsIgnoreCase("SEGUIR TRILHA")){
					System.out.println("A trilha está cheia de destroços da sua nave, alguns ainda estão em chamas.\n"
							+ "você chega ao que restou da cauda da nave, entra e ve que a maioria dos equipamentos, poor algum milagre ainda estão intactos, mas como estão apenas com a energia auxiliar, \n"
							+ "um diagnóstico completo só poderá ser feito quando a energia principal for restauranda, infelizmente as baterias de alta potência estão na outra metade da nave, algo terá que ser deslocado...\n"
							+ "talvez fazer upload de dados dos mapas de navegação e tentar carrega-los na outra parte da nave...\n"
							+ "mas antes que pudesse fazer algo, o som do rugido de alguma criatura ferroz preenche o silêncio da noite.\n"
							+ "Ao olhar para fora, você observa que vários humanóides nativos do planeta estão se aproximando correndo e eufóricos, fugindo de uma criatura enorme que está se aproximando cada vez mais.\n"
							
						//tomada de decisão	
						+"você pode tentar ajudá-los, ou não se envolver, mas dificilmente passará desbercebido quando a criatura acabar com eles.\n"
						+ "respostas disponíveis >>>> 'Ajudar' Nativos ou 'não se envolver'\n"
						+ "||Aguardando decisão||");
						choiceTrilha = scan.nextLine();					
				
					if(choiceTrilha.equalsIgnoreCase("AJUDAR")){
						System.out.println("ATACANDO CRIATURA");
						
						//iniciar mecanica de combate com players atacando primeiro
						/*
						 * ATRIBUTOS DO PLAYER
						 * DANO: baseado no dano da arma (5pts + Dado de 8 Lados)
						 * DEFESA: baseado na defesa do traje ( 10 pts + Dado de 6 lados)
						 * 
						 * ATRIBUTOS DA CRIATURA
						 * DEFESA: 2 dados de 10 lados
						 * ATAQUE: 2 Dados de 6 lados
						 * 
						 * TESTES DE SUCESSO
						 * ATAQUE >>>> 1 D20 para Atacante versus 1D20 do Defensor
						 * diferenças de 1 a 5pts = ataque com sucesso
						 * diferenças de 6 a 10pts = ataque com sucesso parcial metade do dano
						 * diferenças de 11 a 15pts = ataque com com sucesso pequeno 1/3 do dano
						 * diferenças de +12pts = Ataque falhou
						 * 
						 * Caso o atacante tire 20 e o o dano é dobrado
						 * todos danos são subtratidos das defesas do defensor tirando o resultado da quantidade de pts de vida
						 */
					}
				
					if(choiceTrilha.equalsIgnoreCase("não se envolver")){
						System.out.println("VENDO OS NATIVOS MORREREM");
						
						//iniciar mecanica de combate com criaturas atacando primeiro
					}
				
				}
			
				}
			}
			else{
				System.out.println("você se senta em uma das caixas de equipamento, quando percebe que uma célula de combustível se solta do compartimento de carga acima, se deslocando próximo ao fio que soltando faíscas perto do painel...\n"
						+ "você tenta fazer algo, mas não alcança a célula de combustível a tempo, o curto-circuito causa uma imensa explosão...\n\n"
						+ "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"
						+ "░█▀▀ ░█▀█ ░█ ░█▀▀ ░░█▀▀ ░█▀█░█ ░█░░░░\n"
						+ "░█▀▀ ░█▀▀ ░█ ░█ ░░░░█▀▀ ░█▀█░█ ░█ ░░░\n"
						+ "░▀▀▀ ░▀ ░░░▀ ░▀▀▀ ░░▀░░ ░▀░▀░▀ ░▀▀▀░░\n"
						+ "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n\n"
						+ "[A NAVE FOI COMLETAMENTE DESTRUÍDA]\n"
						+ "[VOCÊ ESTÁ MORTO!]");
			}
	}

}
