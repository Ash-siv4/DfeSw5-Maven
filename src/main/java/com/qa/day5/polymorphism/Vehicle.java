package com.qa.day5.polymorphism;

public class Vehicle {

	// variables
	private String colour;// null
	private double mileage;// 0.0
	private String model;// null
	private int wheels;// 0

	// constructor - to set the initial values for the variables in the class
	// method
	// can tell if a method is a constructor because it has the same name as the
	// class
	// can auto-generate
	// right-click -> source -> generate constructor using fields -> select the
	// fields -> click Generate

	public Vehicle(String colour, double mileage, String model, int wheels) {
		super();
		this.colour = colour;
		this.mileage = mileage;
		this.model = model;
		this.wheels = wheels;
	}

	// can auto-generate getters and setters to update the inital values

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	// can auto-generate
	// right-click -> source -> generate toString -> select the fields -> click
	// Generate
	// toString method allows you to print out all the values of the variables in
	// the object
	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", mileage=" + mileage + ", model=" + model + ", wheels=" + wheels + "]";
	}

}
