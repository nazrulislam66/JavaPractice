package com.javapractice.stringmanipulation;

public class MutableString {

	private String name;

	MutableString(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// this setter can modify the name
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		MutableString obj = new MutableString("mkyong");
		System.out.println(obj.getName());

		// update the name, this object is mutable
		obj.setName("new mkyong");
		System.out.println(obj.getName());

	}
}
