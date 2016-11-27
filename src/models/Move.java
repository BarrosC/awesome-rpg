package models;

public class Move {
	String name;
	String description;
	String element;
	Boolean usesWeapon;
	Double baseDamage;
	Integer staminaCost;

	public Move(String name, String description, String element,
			Boolean usesWeapon, Double baseDamage, Integer staminaCost) {
		super();
		this.name = name;
		this.description = description;
		this.element = element;
		this.usesWeapon = usesWeapon;
		this.baseDamage = baseDamage;
		this.staminaCost = staminaCost;
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

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Boolean getUsesWeapon() {
		return usesWeapon;
	}

	public void setUsesWeapon(Boolean usesWeapon) {
		this.usesWeapon = usesWeapon;
	}

	public Integer getStaminaCost() {
		return staminaCost;
	}

	public void setStaminaCost(Integer staminaCost) {
		this.staminaCost = staminaCost;
	}
	
}
