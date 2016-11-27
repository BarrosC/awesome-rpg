package views;

import controllers.FightController;
import interfaces.FlyweightInterface;
import models.Person;

public abstract class Fight {
	
	
	public static void fight(Person player, Boolean playerTurn, FlyweightInterface flyweight) {
		FightController fightController = new FightController();
		
		fightController.doFight(player, playerTurn, flyweight);
		
	}
}
