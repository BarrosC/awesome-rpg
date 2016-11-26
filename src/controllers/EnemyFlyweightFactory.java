package controllers;

import interfaces.FlyweightInterface;

import java.util.ArrayList;

import models.Enemy;

public class EnemyFlyweightFactory implements FlyweightInterface {
	protected ArrayList<Object> enemies;
 
    public EnemyFlyweightFactory() {
    	setArraylist();
    }
    
    public void setArraylist() {
        enemies = new ArrayList<Object>();
        //enemies.add(new Enemy());
    }
    
    public ArrayList<Object> getItems() {
    	return enemies;
    }
 
    public Object getItem(String name) {
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
        
        //return new Enemy();
        
        return new Object();
    }

	public Integer getLength() {
		
		return enemies.size();
	}
}
