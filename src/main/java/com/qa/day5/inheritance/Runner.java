package com.qa.day5.inheritance;

public class Runner {

	public static void main(String[] args) {

		// Grandparent class
		GrandParent mumMum = new GrandParent();//instantiating a class
		System.out.println("gp=" + mumMum.years());

		// Parent class
		Parent mum = new Parent();
		// set eyeColur variable to equal "blue"
		mum.eyeColour = "blue";
		System.out.println("parent=" + mum.print());//from the Parent class
		System.out.println("parent=" + mum.years());//from the GP class

		// DRY - Don't Repeat Yourself
		Child me = new Child();
		me.eyeColour = "brown";
		System.out.println("child=" + me.print());//parent class method
		System.out.println("child=" + me.years());

	}

}
