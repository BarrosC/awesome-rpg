package models;

public class Move {
	String name;
	String description;
	String element;
	Double baseDamage;
	Integer manaCost;
	
	public Move(String name, String description, String type,
			Double baseDamage, Integer manaCost) {
		this.name = name;
		this.description = description;
		this.element = type;
		this.baseDamage = baseDamage;
		this.manaCost = manaCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return element;
	}

	public void setType(String type) {
		this.element = type;
	}

	public Double getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(Double baseDamage) {
		this.baseDamage = baseDamage;
	}

	public Integer getManaCost() {
		return manaCost;
	}

	public void setManaCost(Integer manaCost) {
		this.manaCost = manaCost;
	}
	
}
