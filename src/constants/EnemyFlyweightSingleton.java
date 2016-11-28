package constants;

import interfaces.FlyweightInterface;

import controllers.EnemyFlyweightFactory;

public class EnemyFlyweightSingleton {

	private static FlyweightInterface enemyFlyweight;
	
	public static FlyweightInterface getPlayer() {
		
		if (enemyFlyweight == null) {
			enemyFlyweight = new EnemyFlyweightFactory();
		}
		
		return enemyFlyweight;
	}

}
