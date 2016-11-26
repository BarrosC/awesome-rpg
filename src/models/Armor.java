package models;

public class Armor extends Equipment {
	Double baseDefense;

	public Armor(String name, String description, String role, String element,
			Integer levelRequired, Double baseDefense) {
		super(name, description, role, element, levelRequired);
		this.baseDefense = baseDefense;
	}

	public Double getBaseDefense() {
		return baseDefense;
	}

	public void setBaseDefense(Double baseDefense) {
		this.baseDefense = baseDefense;
	}
}
