package models;

import java.util.ArrayList;

public class Enemy extends Person {

	public Enemy(String name, String description, String role,
			Double baseHealth, Double baseDamage, Double baseDefense,
			Integer level, Armor armor, Weapon weapon, ArrayList<Move> moves) {
		super(name, description, role, baseHealth, baseDamage, baseDefense, level,
				armor, weapon, moves);
		// TODO Auto-generated constructor stub
	}

}
