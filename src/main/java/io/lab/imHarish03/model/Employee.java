package io.lab.imHarish03.model;

import javax.validation.constraints.NotNull;

public class Employee {

	private int id;
	@NotNull(message = "Name cannot be null")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
