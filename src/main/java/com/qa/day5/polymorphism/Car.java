package com.qa.day5.polymorphism;

public class Car extends Vehicle {

	private String reg;

	// constructor with 4 parameters
	public Car(String colour, double mileage, String model, int wheels) {
		// super keyword - means get the values of the variables from the parent class
		super(colour, mileage, model, wheels);
		// TODO Auto-generated constructor stub
	}

	// constructor with 5 parameters
	// method overloading
	public Car(String colour, double mileage, String model, int wheels, String reg) {
		super(colour, mileage, model, wheels);
		this.reg = reg;
	}

	// method overriding
	
	@Override
	public String toString() {
		return "Car [reg=" + reg + ", " + super.toString() + "]";
	}

}
