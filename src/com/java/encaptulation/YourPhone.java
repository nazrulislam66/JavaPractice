package com.java.encaptulation;

public class YourPhone {

	public static void main(String[] args) {
		Mobile phone = new Mobile("iPhone", "6S Plus");
		// System.out.println("Your Phone is: ");
		phone.setOs("10.3.1");
		phone.getOs();
		phone.setPrice(749.99);
		phone.getPrice();

	}

}
