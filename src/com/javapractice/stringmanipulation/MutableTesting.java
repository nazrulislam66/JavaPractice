package com.javapractice.stringmanipulation;

//**Mutable objects have fields that can be changed, mutable 
//**object has setter method to set new object.

//**immutable objects have no fields that can be changed 
//**after the object is created. It has only getter method, 
//** no setter method

public class MutableTesting {

	public String testing;
	
	public MutableTesting(String test) {
		this.testing = test;
	}

	public String getTesting() {
		return testing;
	}

	public void setTesting(String testing) {
		this.testing = testing;
	}

	public static void main(String[] args) {
		//the string before change
		MutableTesting obj = new MutableTesting("bd tech");
		System.out.println("The string is: " + obj.getTesting());
		
		// Now change the string by set method
		obj.setTesting("My bd tech");
		System.out.println("New string: " + obj.getTesting());
		
	}

}
