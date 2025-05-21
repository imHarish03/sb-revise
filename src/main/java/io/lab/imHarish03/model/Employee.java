package io.lab.imHarish03.model;

import javax.validation.constraints.NotNull;

public class Employee {

	private int id;
	@NotNull(message = "Name cannot be null")
	private String name;

	@NotNull(message = "Email cannot be null")
	private String email;

	public String getEmail() {
		return email;
	}
	public  void setEmail(String email) {
		this.email = email;
	}

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
