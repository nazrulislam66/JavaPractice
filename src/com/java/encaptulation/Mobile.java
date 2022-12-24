package com.java.encaptulation;

public class Mobile {
	private String brandName;
	private String operating_system;
	private String model;
	private double cost;

	public Mobile(String brand, String model) {
		this.brandName = brand;
		// this.operating_system=os;
		this.model = model;
		// this.cost=price;
		System.out.println("Your phone is: " + brand + " and " + "Model:" + model);
	}

	public void setOs(String os) {
		// System.out.println("Your os version: ");
		this.operating_system = os;
	}

	public String getOs() {
		System.out.println("OS version: " + this.operating_system);
		return this.operating_system;
	}

	public void setPrice(double price) {
		this.cost = price;
	}

	public double getPrice() {
		System.out.println("The Price for this phone: $" + this.cost);
		return this.cost;
	}

}
