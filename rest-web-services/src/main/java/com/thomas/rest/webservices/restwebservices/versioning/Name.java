package com.thomas.rest.webservices.restwebservices.versioning;

public class Name {

	private String firstName;
	private String lastName;

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstname() {
		return firstName;
	}

	public String getLastname() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Name [firstname=" + firstName + ", lastname=" + lastName + "]";
	}

}
