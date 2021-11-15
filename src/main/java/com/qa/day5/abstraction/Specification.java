package com.qa.day5.abstraction;

public abstract class Specification {
	// abstract class -> abstract and non-abstract methods
	// normal class -> non-abstract methods
	// interfaces -> can only have abstract methods

	// method without any implementation - so it is an abstract method
	public abstract String create();

	// method with implementation (a body) - so it is not abstract
	public void read() {
		System.out.println("read function");
	}

	public abstract String update(int id, String str);

	public abstract void delete(int id);

}
