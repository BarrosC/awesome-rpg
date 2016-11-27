package controllers;

import interfaces.FlyweightInterface;

import java.util.Random;

import models.Enemy;
import models.Move;
import models.Person;

public abstract class FightController {
	
	public void doFight(Person player, Boolean playerTurn, FlyweightInterface flyweight) {
		
		Enemy enemy = EnemyController.getRandomEnemy(flyweight);
		
		while (player.getBaseHealth() > 0 && enemy.getBaseHealth() > 0) {

			if (playerTurn) {
				// @TO-DO Rodar método doAttack com a escolha do jogador
			} else {
				// @TO-DO Rodar método doAttack com aataque randomico do monstro
			}
			
			playerTurn = !playerTurn;
		}
	}

	public void doAttack(Person attacker, Move attack, Person defender) {
		
		Integer successTest;
		Integer attackerSuccessTest;
		Integer defenderSuccessTest;
		Double attackValue = 0.0;
		Double defenseValue = 0.0;
		Random random = new Random();
		
		// Calcula o valor base do ataque
		if (attack.getUsesWeapon()) {			
			attackValue += attacker.getWeapon().getBaseDamage() 
							+ attack.getBaseDamage() 
							+ random.nextInt(8);
		} else {
			attackValue += attacker.getBaseDamage() 
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
			
		} else if (successTest <= 5) {
			attackValue = attackValue * 2;
			System.out.println("Ataque crítico!");
		} else if (successTest > 5 && successTest <= 10) {
			attackValue = attackValue * 0.33;
			System.out.println("Ataque fraco!");
		} else if (successTest > 10 && successTest <= 15) {
			attackValue = attackValue * 0.66;
			System.out.println("Ataque médio!");
		} else if (successTest > 15 && successTest < 20) {
			System.out.println("Ataque bem sucedido!");
		}
		
		// Retira a vida do defensor baseado no valor do ataque
		defender.setBaseHealth(defender.getBaseHealth() - attackValue);
	}
}
