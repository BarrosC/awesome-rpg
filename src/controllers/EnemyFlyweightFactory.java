package controllers;

import interfaces.FlyweightInterface;

import java.util.ArrayList;

import models.Enemy;

public class EnemyFlyweightFactory implements FlyweightInterface {
	protected ArrayList<Enemy> enemies;
 
    public EnemyFlyweightFactory() {
        setFlyweight();
    }
    
    public void setFlyweight() {
        enemies = new ArrayList<Enemy>();
        enemies.add(new Enemy());
    }
 
    public Object getFlyweight(String name) {
        switch (name) {
	        /*case JOGADOR:
	            return flyweights.get(0);
	        case INIMIGO_1:
	            return flyweights.get(1);
	        case INIMIGO_2:
	            return flyweights.get(2);
	        case INIMIGO_3:
	            return flyweights.get(3);
	        case CENARIO_1:
	            return flyweights.get(4);
	        default:
	            return flyweights.get(5);*/
        }
        
        return new Enemy();
    }
}
