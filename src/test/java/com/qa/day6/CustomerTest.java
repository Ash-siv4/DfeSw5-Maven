package com.qa.day6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	// in order to be able to use/test the customer class
	// instantiate it
	Customer cust = new Customer();

	Customer x;

	@Before
	public void init() {
		x = new Customer(1, "Minnie", "n/a");
		cust.setName("Mickey");// initalised the name variable with the value of Mickey
	}

	// test the getters not the setters since they are void methods

	@Test
	public void testGetName() {
		assertEquals("Mickey", cust.getName());
		assertEquals("Minnie", x.getName());
	}

	@Test
	public void testToString() {
		assertEquals("Customer [id=0, name=Mickey, address=null]", cust.toString());
	}

}
