package com.qa.day5.polymorphism;

public class Runner {

	public static void main(String[] args) {

//		Vehicle x;// creating an object of the class and giving it the name "x"
//		x = new Vehicle("white", 30000, "BMW", 4); // making a new instance of the Vehicle class and storing it in "x"

		Vehicle x = new Vehicle("white", 30000, "BMW", 4);
//		System.out.println(x);//prints memory reference
		System.out.println(x.toString());
		
		Car mine = new Car("white", 30000, "Audi", 4);
		System.out.println(mine);
	}

}
