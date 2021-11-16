package com.qa.day6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalcTest {

	// make sure you follow the same packaging and class structure as your
	// src/main/java folder
	// to ensure tests can be found easily

	// create an instance to the class to test (once)
	Calc a = new Calc();

	@Test
	public void addTest() {
		// assertEquals -> compare two values and check if they are equal
		// tests follow the structure of: expected vs actual
		// expected -> when I call a method and pass in some inputs, this is what I
		// should get
		// actual -> call this method, pass in the inputs, will retrieve what is stored
		// in memory once the method has executed
		assertEquals(7, Calc.add(3, 4));
		assertEquals(17, Calc.add(3, 14));
	}

	@Test
	public void checkTest() {
		// assertTrue or assertFalse -> only expects one input because the input is the
		// "actual" value you compare to the assert method
		assertTrue(a.check(false));// this should return true
		assertFalse(a.check(true));// this should return false
//		assertTrue(Calc.check(true));//the check method returns false so it fails
	}

}
