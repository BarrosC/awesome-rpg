package models;

import java.util.ArrayList;

public class Player extends Person {
	Double experience;
	Double money;
	
	public Player(String name, String description, String role,
			Double baseHealth, Double baseDamage, Double baseDefense,
			Integer level, Armor armor, Weapon weapon, ArrayList<Move> moves,
			Double experience, Double money) {
		super(name, description, role, baseHealth, baseDamage, baseDefense,
				level, armor, weapon, moves);
		this.experience = experience;
		this.money = money;
	}

	public Double getExperience() {
		return experience;
	}

	public void setExperience(Double experience) {
		this.experience = experience;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
	
}
