package com.qa.day5.abstraction;

public class Runner {

	public static void main(String[] args) {
		
		//abstract classes cannot be instantiated
//		Specification z = new Specification();
		
		Implementing demo1 = new Implementing();
		demo1.delete(0);//delete stuff
		
		
		Implement2 demo2 = new Implement2();
		demo2.delete(0);// deleted id: 0
		
	}
	
}
