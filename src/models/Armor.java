package models;

public class Armor extends Equipment {
	Double baseAttack;
	Double baseDefense;
	
	public Armor(String name, String description, String role, String element,
			Integer levelRequired, Double baseAttack, Double baseDefense) {
		super(name, description, role, element, levelRequired);
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
	}

	public Double getBaseAttack() {
		return baseAttack;
	}

	public void setBaseAttack(Double baseAttack) {
		this.baseAttack = baseAttack;
	}

	public Double getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(Double baseDefense) {
		this.baseDefense = baseDefense;
	}
	
}
