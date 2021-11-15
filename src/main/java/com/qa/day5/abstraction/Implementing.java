package com.qa.day5.abstraction;

public class Implementing extends Specification {

	// can only inherit from 1 class
	// CANNOT inherit from multiple classes
	// use "extend" keyword to say we want to inherit
	@Override
	public String create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(int id, String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {

		System.out.println("delete stuff");
	}

	// this class can have it's own methods onto of the ones that were inherited
	public void method() {

	}

}
