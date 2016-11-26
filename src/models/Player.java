package models;

public class Player extends Person {
	Double experience;
	Double money;

	public Player(String name, String description, String role,
			Double baseHealth, Double baseDamage, Double baseDefense,
			Integer level, Armor armor, Weapon weapon, Double experience,
			Double money) {
		super(name, description, role, baseHealth, baseDamage, baseDefense,
				level, armor, weapon);
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
