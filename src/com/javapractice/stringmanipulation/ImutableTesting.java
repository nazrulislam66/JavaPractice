package com.javapractice.stringmanipulation;

public class ImutableTesting {

	public String test;
	
	public ImutableTesting(String test){
		this.test = test;
	}
	
	public String getTest() {
		return test;
	}

	public static void main(String[] args) {
		//19158957
		ImutableTesting obj = new ImutableTesting("My test");
		System.out.println("The string is: "+ obj.getTest());

	}

}
