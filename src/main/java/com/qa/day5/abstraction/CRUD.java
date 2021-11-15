package com.qa.day5.abstraction;

public interface CRUD {

	// templates
	// interfaces can only have abstract methods
	// methods HAVE TO be abstract so you don't have to use the abstract keyword
	public String create();

	public String[] read();;

	public String update();

	public void delete();
}
