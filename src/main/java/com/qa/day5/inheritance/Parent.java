package com.qa.day5.inheritance;

public class Parent extends GrandParent {
	
	//variables
	
	String eyeColour;
	String hairColour = "black";
	int height;
	int bankDetails;
	
	
	public String print() {
		return "Eye colour is: " + eyeColour + "; Hair colour is: " + hairColour;
	}
	
}
