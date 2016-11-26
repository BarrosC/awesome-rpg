package models;

public class Weapon extends Equipment {
	Double baseDamage;

	public Weapon(String name, String description, String role, String element,
			Integer levelRequired, Double baseDamage) {
		super(name, description, role, element, levelRequired);
		this.baseDamage = baseDamage;
	}

	public Double getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(Double baseDamage) {
		this.baseDamage = baseDamage;
	}

}
