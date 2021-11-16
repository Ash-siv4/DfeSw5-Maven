package com.qa.day6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestTemplate {

	// unit testing - JUnit
	// to write the tests we first have to add the external library and then import
	// into our class to test

	// to run tests: right-click -> run as -> Junit test

	// beforeClass annotation -> runs before any tests in the class and is used to
	// setup the test environment
	@BeforeClass
	public static void setUp() {
		// this is where you would setup the connection to a database
		System.out.println("Before class");
	}

	// before annotation -> runs before each test and is used to declare
	// variables/initialise them
	@Before
	public void init() {
		// int a = 2
		System.out.println("Before");
	}

	// test annotation -> says to test the method below the annotation
	@Test
	public void test1() {
		// a = 4
		System.out.println("Test 1");
	}

	// test annotation -> says to test the method below the annotation
	// ignore annotation -> ignores the test method below so it doesn't run it
	@Ignore
	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	// after annotation -> runs after each test to reset any data that was changed
	// within the test
	@After
	public void reset() {
		System.out.println("After");
	}

	// afterClass annotation -> runs after all tests in the class and is used to
	// close the test environment
	@AfterClass
	public static void close() {
		// this is where you would close the connection to a database
		System.out.println("After class");
	}

}
