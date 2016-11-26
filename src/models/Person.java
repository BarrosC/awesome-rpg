package models;

public abstract class Person {
	String name;
	String description;
	String role;
	Double baseHealth;
	Double baseDamage;
	Double baseDefense;
	Integer level;
	Armor armor;
	Weapon weapon;
	
	public Person(String name, String description, String role, Double baseHealth,
			Double baseDamage, Double baseDefense, Integer level, Armor armor,
			Weapon weapon) {
		super();
		this.name = name;
		this.description = description;
		this.role = role;
		this.baseHealth = baseHealth;
		this.baseDamage = baseDamage;
		this.baseDefense = baseDefense;
		this.level = level;
		this.armor = armor;
		this.weapon = weapon;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getBaseHealth() {
		return baseHealth;
	}

	public void setBaseHealth(Double baseHealth) {
		this.baseHealth = baseHealth;
	}

	public Double getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(Double baseDamage) {
		this.baseDamage = baseDamage;
	}

	public Double getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(Double baseDefense) {
		this.baseDefense = baseDefense;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
