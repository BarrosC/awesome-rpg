package controllers;

import java.util.ArrayList;
import java.util.Random;

import interfaces.FlyweightInterface;
import models.Enemy;

public abstract class EnemyController {
	
	public static Enemy getRandomEnemy(FlyweightInterface flyweight) {
		
		ArrayList<Object> arr = flyweight.getItems();
		
		Random random = new Random();
		return (Enemy) arr.get(random.nextInt(flyweight.getLength()));
	}
}
