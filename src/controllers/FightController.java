package controllers;

import interfaces.FlyweightInterface;

import java.util.Random;
import java.util.Scanner;

import constants.PlayerSingleton;
import views.GameOver;
import models.Enemy;
import models.Move;
import models.Person;
import models.Player;

public class FightController {
	
	public void doFight(Boolean playerTurn) {
		
		Player player = PlayerSingleton.getPlayer();
		Enemy enemy = EnemyController.getRandomEnemy();
		Double enemyInitialHealth = enemy.getBaseHealth();
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String choice;
		
		System.out.println("\n[=====" + enemy.getName() + " apareceu!=====]\n");
		
		while (player.getBaseHealth() > 0 && enemy.getBaseHealth() > 0) {

			if (playerTurn) {
				
				System.out.println("\n----------------------------------------------------------"
									+ "\n" + player.getName() + " HP: " + player.getBaseHealth() + "         "
									+ enemy.getName() + " HP: " + enemy.getBaseHealth() + "\n"
									+ "----------------------------------------------------------");
				
				System.out.println("Escolha uma ação: \n\n");
				
				Integer loopIndex = 1;
				
				for (Move move : player.getMoves()) {
					
					System.out.println(loopIndex + ". " + move.getName() + "\n");
					loopIndex++;
				}

				choice = scan.nextLine();
				
				try {
					doAttack(player, player.getMoves().get(Integer.parseInt(choice) - 1), enemy);
				} catch (Exception e) {
					doAttack(player, player.getMoves().get(0), enemy);
				}
			} else {
				
				Random random = new Random();

				doAttack(enemy, enemy.getMoves().get(random.nextInt(enemy.getMoves().size())), player);
			}
			
			playerTurn = !playerTurn;
		}
		
		
		if (enemy.getBaseHealth() <= 0) {
			System.out.println(enemy.getName() + " derrotado!\n");
			enemy.setBaseHealth(enemyInitialHealth);
		} else {
			GameOver.gameOver();
		}
	}

	public void doAttack(Person attacker, Move attack, Person defender) {
		
		Integer successTest;
		Integer attackerSuccessTest;
		Integer defenderSuccessTest;
		Double attackValue = 0.0;
		Double defenseValue = 0.0;
		Random random = new Random();
		
		System.out.println("\n>>>>>> " + attacker.getName() + " usou " + attack.getName() + "\n");
		
		// Calcula o valor base do ataque
		if (attack.getUsesWeapon()) {			
			attackValue += attacker.getWeapon().getBaseDamage() 
							+ attack.getBaseDamage() 
							+ random.nextInt(8);
		} else {
			attackValue += attacker.getBaseDamage() 
							+ attacker.getArmor().getBaseAttack() 
							+ attack.getBaseDamage() 
							+ random.nextInt(8);			
		}
		
		// Calcula o valor base da defesa
		defenseValue += defender.getArmor().getBaseDefense()
						+ random.nextInt(10);					
						
		// Calcula o teste
		attackerSuccessTest = random.nextInt(20);
		defenderSuccessTest = random.nextInt(20);
		
		successTest = attackerSuccessTest - defenderSuccessTest;
		
		if (attackerSuccessTest == 20) {
			attackValue = attackValue * 2;
			System.out.println("Ataque crítico! Dano: " + (attackValue - defenseValue) + "\n");
		} else if (successTest <= 5) {
			attackValue = 0.0;
			System.out.println("Ataque anulado! Dano: " + (attackValue - defenseValue) + "\n");
		} else if (successTest > 5 && successTest <= 10) {
			attackValue = attackValue * 0.33;
			System.out.println("Ataque fraco! Dano: " + (attackValue - defenseValue) + "\n");
		} else if (successTest > 10 && successTest <= 15) {
			attackValue = attackValue * 0.66;
			System.out.println("Ataque médio! Dano: " + (attackValue - defenseValue) + "\n");
		} else if (successTest > 15 && successTest < 20) {
			System.out.println("Ataque bem sucedido! Dano: " + (attackValue - defenseValue) + "\n");
		}
		
		// Retira a vida do defensor baseado no valor do ataque
		if (attackValue - defenseValue >= 0) {
			defender.setBaseHealth(defender.getBaseHealth() - (attackValue  - defenseValue));
		} else {
			attacker.setBaseHealth(attacker.getBaseHealth() + (attackValue  - defenseValue));
		}
	}
}
