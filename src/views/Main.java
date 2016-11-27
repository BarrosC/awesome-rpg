package views;

import interfaces.FlyweightInterface;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import constants.ElementConstants;
import constants.RoleConstants;
import controllers.EnemyFlyweightFactory;
import models.Armor;
import models.Move;
import models.Player;
import models.Weapon;

public class Main {

	public static void main(String[] args) {
		
		String choice = null;
		String choiceSignal = null;
		String choiceTrilha = null;
		String choiceOutroLado = null;
		
		// Configuração do jogador
		Armor basicArmor = new Armor("Exo-Armadura XT32", "Armadura de alta resistência que aumenta as capacidades humanas.",
							RoleConstants.PILOT, ElementConstants.NORMAL, 1, 6.0, 8.0);
		
		ArrayList<Move> playerMoves = new ArrayList<Move>();
		playerMoves.add( new Move("Soco Turbina", "Soco forte que usa pequenas turbinas instaladas na luva do piloto.", ElementConstants.NORMAL, false, 2.0, 0));
		
		Player player = new Player("Cpt. Allister",
									"Os avançados humanos de Marselha, com seus cabelos brancos, fala suave e grande inteligência e esclarecimento, podem lembrar rumores e lendas sobre qualquer assunto com um teste bem-sucedido de Inteligência.", 
									RoleConstants.PILOT, 
									150.00, 4.0, 6.0, 1, basicArmor, null, playerMoves, 0.0, 0.0);
		
		// Iniciar inimigos com padrão Flyweight
		FlyweightInterface enemyFlyweight = new EnemyFlyweightFactory();
		
		
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
				);
		
		System.out.println("Pressione ENTER para iniciar sua jornada");
		choice = scan.nextLine();
		
		System.out.println("**** Capítulo 1 - O Local Queda ****");
		
		String InicioCap1[] = {""				
				+ "\n\n\n[sons de Alerta] \n",
				"Você acorda com o som do sinal de alerta...luzes de emergência piscam... sua visão vai voltando ao normal aos poucos."
				+ "faíscas cintilam em várias partes do paineis de instrumentos pelo cockpit.\n"
				+ "Ao olhar para o lado você ve seu co-piloto incônsciente, o indicador do traje mostra que ele já está sem vida, não há nada que você possa fazer.\n"
				+ "Você levanta do acento e se dirige a parte traseira de sua nave, observa que existem algumas caixas de suprimentos, outras de equipamentos militar, e um trage de combate.\n"
				+ "você acha melhor vestir o trage, pois o planeta pode ser hostil e uma proteção a mais cairá bem... além disso, o traje possui uma unidade médica de campo, \n"
				+ "capaz de realizar diagnósticos e análises de sinais vitais do usuário\n"				
		};
		
		for (int i = 0;
	             i < InicioCap1.length;
	             i++) {
	            //pausa de 1,5 segundos por linha
	            try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            //Print a message
	            System.out.println(InicioCap1[i]);
	        }
				
		System.out.println("Pressione ENTER para vestir o traje...");
				choice = scan.nextLine();
				
				System.out.println("Você veste o trage, assim que coloca o capacete, o visor se inicia...\n\n");
		
		
		String InicializandoTraje[] = {
				"-- Exo-Armadura XT32 --\n"
				+"  [CARREGANDO DADOS]\n",
				"     [Inicializando...]",
				"     [Inicializando...]",
				"     [Inicializando...]\n",
	            " [USUÁRIO IDENTIFICADO]\n"
	        };
		
		
		
		for (int i = 0;
	             i < InicializandoTraje.length;
	             i++) {
	            //Pausa de 2,5 segundos por linha
	            try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            //Print a message
	            System.out.println(InicializandoTraje[i]);
	        }
		
		
		String TrajeUsuario[] = {
				" [FUZILEIRO ESTELAR :::: Cpt. James Allister - NÚMERO DE SERVIÇO: 20-131]\n",
				" [INICIANDO DIAGNÓSTICO...]\n",
				" [UNIDADE MÉDICA ATIVADA...]\n",
				" [ESTABILIZAR. 250 MILIGRAMAS DE SANSUFETANIL : Aplicados]\n",
				" [ATENÇÃO EFEITOS COLATERIAS TEMPORÁRIOS: Náusea, tontura, coordenação motora pode ser prejudicada.]\n\n"
		};
		
		
		for (int i = 0;
	             i < TrajeUsuario.length;
	             i++) {
	            //Pausa de 1,7 segundos por linha
	            try {
					Thread.sleep(1700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            //Print a message
	            System.out.println(TrajeUsuario[i]);
	        }
		
		String Parte2[] = { "\nVocê abre uma das caixas de equipamento e pega um Rifle de Plasma e uma Pistola de ions, esta que pode atordoar alvos. \n"
				+ "Ao olhar ao redor existe um fio soltando faíscas que pode religar um painel que aciona o sinal de socorro, você sabe que o sinal pode ser sua unica chance de ser resgatado, \n"
				+ "mas também sabe que quem derrubou sua nave ainda pode estar ouvindo... \n"
				+"ACIONAR SINAL DE S.O.S ?\n\n"
				+ "respostas disponíveis >>>> 'sim'  ou 'não' ou 'nao fazer nada'\n"
				+ "||Aguardando decisão||"				
		};
		
		
		for (int i = 0;
	             i < Parte2.length;
	             i++) {
	            //Pausa de 1,7 segundos por linha
	            try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            //Print a message
	            System.out.println(Parte2[i]);
	        }
		
		
				Weapon plasmaRifle = new Weapon("Rifle de plasma", "Rifle que dispara feixes de plasma.", RoleConstants.PILOT, ElementConstants.NORMAL, 1, 6.0);
				player.setWeapon(plasmaRifle);
				playerMoves.add( new Move("Tiro de plasma", "Dispara um feixe de plasma concentrado.", ElementConstants.NORMAL, true, 2.0, 0));
				
				choiceSignal = scan.nextLine();
		

				if(choiceSignal.equalsIgnoreCase("SIM")){
					
					String SinalDeSocorro[] = {
							"[SINAL DE SOCORRO ACIONADO]",
							"[INICIANDO TRANSMISSÃO]",
							" ...",
							" ...",
							"[ERRO NA TRANSMISSÃO]",
							"[ANTENA PRINCIPAL DANIFICADA]",
							"[PASSANDO PARA AUXILIAR]",
							" ...\n",
							"[========ATENÇÃO=========]",
							"[ALCANCE DO SINAL COMPROMETIDO]",
							"[TRANSMITINDO APENAS PARA SISTEMAS PLANETÁRIOS PRÓXIMOS]",
							"[:::: RECOMENDAÇÃO ::::]",
							"[REPARAR A ANTENA PRINCIPAL PARA TRANSMITIR SINAL INTER-ESTELAR]\n\n"
							
					};
					
					for (int i = 0;
				             i < SinalDeSocorro.length;
				             i++) {
				            //Pausa de 1,7 segundos por linha
				            try {
								Thread.sleep(1700);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				            //Print a message
				            System.out.println(SinalDeSocorro[i]);
				        }				
				
						
						choice = "sim";
				
				if(choiceSignal.equalsIgnoreCase("NÃO") || choiceSignal.equalsIgnoreCase("NAO") || choice.equalsIgnoreCase("SIM")){
					
					String Parte3a[] = { "\nVocê se dirige a saída da nave...\n"
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
						+"o que fazer? 'seguir trilha' de destroços ou ir para o 'outro lado'?\n\n"
						+ "respostas disponíveis >>>> 'seguir trilha' ou 'outro lado'\n"
						+ "||Aguardando decisão||"									
					};
					
					
					for (int i = 0;
				             i < Parte3a.length;
				             i++) {
				            //Pausa de 3,5 segundos por linha
				            try {
								Thread.sleep(4000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				            //Print a message
				            System.out.println(Parte3a[i]);
				        }
					
				
				choice = scan.nextLine();
				
				
				if(choice.equalsIgnoreCase("OUTRO LADO")){
					String Parte4a[] = {"\nVocê marca a nave no touch pad no ante-braço do trage e coloca em modo mapeamento, isto não deixará você se perder e ainda vai mapear o terreno.\n"
							+ "A floresta é densa, árvores grandes e altas em um terreno irregular.\n"
							+ "após andar alguns quilometros você ouve sons estranhos, animais talves?... \n"
							+ "você vai investigar a direção de onde veio o som, mas antes que possa chegar ao local, ouve um grito de mulher.\n"
							+ "ao chegar ao local você ses depara com criaturas estranhas que você ainda não tinha encontrado em suas viagens e batalhas.\n"
							+ "essas criatuaras estão tentando pegar uma jovem que tenta se esconder, embora com dificuldade, em uma caverna em um terreno elevado.\n"
							
						//tomada de decisão de ação - Atacar e ajdudar ou não se envolver
						+ "você consegue identificar 3 hostis, e se pergunta se deve se envolver ou seguir seu caminho...\n"
						+ "respostas disponíveis >>>> 'Atacar' ou 'não se envolver'\n"
						+ "||Aguardando decisão||"
							
					};
					
					for (int i = 0;
				             i < Parte4a.length;
				             i++) {
				            //Pausa de 3,5 segundos por linha
				            try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				            //Print a message
				            System.out.println(Parte4a[i]);
				        }
					choiceOutroLado = scan.nextLine();
					
					if(choiceOutroLado.equalsIgnoreCase("ATACAR")){
						System.out.println("\nVocê se prepara para atacar o hostil mais próximo... So visor do trage fica com aspecto avermelhado e mensagens são exibidas...\n");
						String ModoCombate[] = { 
								"[MODO DE COMBATE ATIVADO]",
								"[ARMAS PRONTAS]"
								
						};
						for (int i = 0;
					             i < ModoCombate.length;
					             i++) {
					            //Pausa de 3,5 segundos por linha
					            try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
					            //Print a message
					            System.out.println(ModoCombate[i]);
					        }
						
						//iniciar mecanica de combate com players atacando primeiro						
						Fight.fight(player, true, enemyFlyweight);
						Fight.fight(player, true, enemyFlyweight);
						Fight.fight(player, true, enemyFlyweight);
					}
					
					
					
					if(choiceOutroLado.equalsIgnoreCase("NÃO SE ENVOLVER")){
						System.out.println("\nVocê gostaria de ajudar, mas já tem seus próprios problemas...\n"
								+ "mas quando se distancia mais criaturas aparecem a frente, e uma já te viu e está vindo em sua direção para atacá-lo.\n"
								+ "O visor do trage fica com aspecto avermelhado e mensagens são exibidas...");
						
						String ModoCombate[] = { 
								"[MODO DE COMBATE ATIVADO]",
								"[ARMAS PRONTAS]"
								
						};
						for (int i = 0;
					             i < ModoCombate.length;
					             i++) {
					            //Pausa de 3,5 segundos por linha
					            try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
					            //Print a message
					            System.out.println(ModoCombate[i]);
					        }
						//iniciar mecanica de combate com criaturas atacando primeiro				
						Fight.fight(player, false, enemyFlyweight);
						Fight.fight(player, false, enemyFlyweight);
						Fight.fight(player, false, enemyFlyweight);
					}
					
				}
				
				if(choice.equalsIgnoreCase("SEGUIR TRILHA")){
					String Parte4b[] = {"A trilha está cheia de destroços da sua nave, alguns ainda estão em chamas.\n"
							+ "você chega ao que restou da cauda da nave, entra e ve que a maioria dos equipamentos, poor algum milagre ainda estão intactos, mas como estão apenas com a energia auxiliar, \n"
							+ "um diagnóstico completo só poderá ser feito quando a energia principal for restauranda, infelizmente as baterias de alta potência estão na outra metade da nave, algo terá que ser deslocado...\n"
							+ "talvez fazer upload de dados dos mapas de navegação e tentar carrega-los na outra parte da nave...\n"
							+ "mas antes que pudesse fazer algo, o som do rugido de alguma criatura ferroz preenche o silêncio da noite.\n"
							+ "Ao olhar para fora, você observa que vários humanóides nativos do planeta estão se aproximando correndo e eufóricos, fugindo de uma criatura enorme que está se aproximando cada vez mais.\n"
							
						//tomada de decisão	
						+"você pode tentar ajudá-los, ou não se envolver, mas dificilmente passará desbercebido quando a criatura acabar com eles.\n"
						+ "respostas disponíveis >>>> 'Ajudar' Nativos ou 'não se envolver'\n"
						+ "||Aguardando decisão||"							
					};
					for (int i = 0;
				             i < Parte4b.length;
				             i++) {
				            //Pausa de 3,5 segundos por linha
				            try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				            //Print a message
				            System.out.println(Parte4b[i]);
				        }
					choiceTrilha = scan.nextLine();
					
					
				
					if(choiceTrilha.equalsIgnoreCase("AJUDAR")){						
						System.out.println("\nVocê se prepara para atacar o hosti... o visor do trage fica com aspecto avermelhado e mensagens são exibidas...\n");
						String ModoCombate[] = { 
								"[MODO DE COMBATE ATIVADO]",
								"[ARMAS PRONTAS]"
								
						};
						for (int i = 0;
					             i < ModoCombate.length;
					             i++) {
					            //Pausa de 3,5 segundos por linha
					            try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
					            //Print a message
					            System.out.println(ModoCombate[i]);
					        }
						
						Fight.fight(player, true, enemyFlyweight);
					}
				
					if(choiceTrilha.equalsIgnoreCase("não se envolver")){
						System.out.println("A criatura da uma patada devastadora, o grito estridente de um dos nativos ecoua e é para repentinamente quando seu corpo vai de encontro ao troco de uma arvore,"
								+ "é possível ouvir o som dos ossos se partindo, e o corpo cai ao chão sem vida. A criatura para um instante para devorar o corpo de sua presa, em uma única abocanhada..."
								+ "Os outros três nativos estão vindo em sua direção, gritando. Eles podem te ver e alcançam os destroços da nave onde você está."
								+ "A criatura se volta para o local, você não tem opção a não ser lutar."
								+ "O visor do trage fica com aspecto avermelhado e mensagens são exibidas...");
						String ModoCombate[] = { 
								"[MODO DE COMBATE ATIVADO]",
								"[ARMAS PRONTAS]"
								
						};
						for (int i = 0;
					             i < ModoCombate.length;
					             i++) {
					            //Pausa de 3,5 segundos por linha
					            try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
					            //Print a message
					            System.out.println(ModoCombate[i]);
					        }
						
						//iniciar mecanica de combate com criaturas atacando primeiro					
						Fight.fight(player, true, enemyFlyweight);
						Fight.fight(player, true, enemyFlyweight);
						Fight.fight(player, true, enemyFlyweight);
					}
				
				}
			
				}
			}
			else{
				System.out.println("você se senta em uma das caixas de equipamento, quando percebe que uma célula de combustível se solta do compartimento de carga acima, se deslocando próximo ao fio que que estava soltando faíscas perto do painel...\n"
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
