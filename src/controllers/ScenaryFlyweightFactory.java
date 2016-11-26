package controllers;

import interfaces.FlyweightInterface;

import java.util.ArrayList;

import models.Enemy;
import models.Scenary;

public class ScenaryFlyweightFactory implements FlyweightInterface {
	public static ArrayList<Object> scenaries;
 
    public ScenaryFlyweightFactory() {
    	setArraylist();
    }
    
    public void setArraylist() {
    	scenaries = new ArrayList<Object>();
    	scenaries.add(new Scenary());
    }
    
    public ArrayList<Object> getItems() {
    	return scenaries;
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
        
        return new Scenary();
    }

	public Integer getLength() {
		return scenaries.size();
	}
}
