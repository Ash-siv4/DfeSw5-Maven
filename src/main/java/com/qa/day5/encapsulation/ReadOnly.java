package com.qa.day5.encapsulation;

public class ReadOnly {

	// only has getters

	// customer public info

	private String firstName;

	private String lastName;

	private int age;

	// shortcut to generate getters & setters:
	// right-click on the class -> Source -> generate getters & setters ->
	// select the ones you want to create the getters for -> click Generate

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

}
