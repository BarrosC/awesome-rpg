package views;

import controllers.FightController;
import interfaces.FlyweightInterface;
import models.Person;

public abstract class Fight {
	
	
	public static void fight(Boolean playerTurn) {
		FightController fightController = new FightController();
		fightController.doFight(playerTurn);		
	}
}
