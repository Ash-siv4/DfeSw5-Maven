package com.qa.day5.encapsulation;

public class ReadWrite {

	// READ & WRITE - HAS GETTERS AND SETTERS
	// WRITE ONLY CLASS - ONLY HAS SETTERS
	// READ ONLY CLASS - ONLY HAS GETTERS
	
	// - Encapsulation -> Restricting direct access to variables within a class
	// - - Access Modifiers: public, private(only seen within the class), protected,
	// default

	public String name;

	private long digits;//0
	private int cvc;//0
	private String expiryDate;//null

	// getters (read values) & setters (update/write to variables)

	// shortcut to generate getters & setters:
	// right-click on the class -> Source -> generate getters & setters ->
	// select the ones you want to create the getters&setters for -> click Generate

	// getter for the digits variable
	public long getDigits() {
		return digits;
	}

	// setter for the digits variable ->void return type because it isn't returning
	// anything
	public void setDigits(long digits) {
		// this keyword -> gets the current value of the "digits" variable then
		// reassigns it to what you pass in the method
		this.digits = digits;
	}

	// getter for the cvc variable
	public int getCvc() {
		return cvc;
	}

	// setter for the cvc variable
	public void setCvc(int cvc) {
		// 0 = 432
		this.cvc = cvc;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
