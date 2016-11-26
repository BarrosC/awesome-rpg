package models;

public abstract class Equipment {
	String name;
	String description;
	String role;
	String element;
	Integer levelRequired;
	
	public Equipment(String name, String description, String role,
			String element, Integer levelRequired) {
		super();
		this.name = name;
		this.description = description;
		this.role = role;
		this.element = element;
		this.levelRequired = levelRequired;
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

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Integer getLevelRequired() {
		return levelRequired;
	}

	public void setLevelRequired(Integer levelRequired) {
		this.levelRequired = levelRequired;
	}

}
