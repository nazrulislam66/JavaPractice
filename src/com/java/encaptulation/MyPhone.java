package com.java.encaptulation;

public class MyPhone {

	public static void main(String[] args) {
		Mobile phone = new Mobile("Android", "Note 7");
		// System.out.println("Your Phone is: ");
		phone.setOs("6.0.1");
		phone.getOs();
		phone.setPrice(799.99);
		phone.getPrice();

	}

}