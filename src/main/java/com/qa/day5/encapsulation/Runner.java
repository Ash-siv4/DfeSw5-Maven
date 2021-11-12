package com.qa.day5.encapsulation;

import java.util.Scanner;

public class Runner {

	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		//created an instance of the ReadWrite class:
		ReadWrite ash = new ReadWrite();
//		ash.name;
		System.out.println("Old cvc is: " + ash.getCvc());
		System.out.println("Please enter your cvc: ");
		ash.setCvc(sc.nextInt());
		System.out.println("Your CVC is: " + ash.getCvc());

		
	}
}
