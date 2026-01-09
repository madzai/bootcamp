package com.javahongkong.bootcamp.exercise;

public class Person {
	private String firstName;
	private String lastName;
	// private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = super.getIdNumber();
	}

	public String getFirstName() {
		// complete the function
		if (this.firstName != null)
			return this.firstName;
		return null;
	}

	public String getLastName() {
		// complete the function
		if (this.lastName != null)
			return this.lastName;
		return null;
	}
}
