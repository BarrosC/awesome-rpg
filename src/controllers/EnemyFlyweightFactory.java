package controllers;

import interfaces.FlyweightInterface;

import java.util.ArrayList;

import constants.ElementConstants;
import constants.RoleConstants;
import models.Armor;
import models.Enemy;
import models.Move;
import models.Player;

public class EnemyFlyweightFactory implements FlyweightInterface {
	protected ArrayList<Object> enemies;
 
    public EnemyFlyweightFactory() {
    	setArraylist();
    }
    
    public void setArraylist() {
        enemies = new ArrayList<Object>();
        

		Armor basicArmor = new Armor("Casco endurecido", "Casco endurecido sobre a pele.",
							RoleConstants.PILOT, ElementConstants.NORMAL, 1, 6.0, 8.0);
		
		ArrayList<Move> enemyMoves = new ArrayList<Move>();
		enemyMoves.add( new Move("Arranhão", "Um arranhão que pode rasgar metal.", ElementConstants.NORMAL, false, 2.0, 0));
		enemyMoves.add( new Move("Mordida Violenta", "Uma mordida perigosa com presas enormes.", ElementConstants.NORMAL, false, 2.0, 0));
		
		Enemy enemy = new Enemy("Crawller",
									"Um monstro que habita as cavernas e se arrasta grotescamente.", 
									RoleConstants.PILOT, 
									20.00, 4.0, 6.0, 1, basicArmor, null, enemyMoves);

        enemies.add(enemy);
        
		enemy = new Enemy("Flying Bitter",
				"Um monstro que habita as cavernas e voa rapidamente com suas asas pontudas.", 
				RoleConstants.PILOT, 
				20.00, 4.0, 6.0, 1, basicArmor, null, enemyMoves);
        
        enemies.add(enemy);
    }
    
    public ArrayList<Object> getItems() {
    	return enemies;
    }
 
    public Object getItem(String name) {
        switch (name) {
	        case "Crawller":
	            return enemies.get(0);
	        case "Flying Bitter":
	            return enemies.get(1);
	        default:
	            return enemies.get(0);
        }
    }

	public Integer getLength() {
		
		return enemies.size();
	}
}
