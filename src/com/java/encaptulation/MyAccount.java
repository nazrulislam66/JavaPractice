package com.java.encaptulation;

public class MyAccount {

	public static void main(String[] args) {
		BankAccount myAcc = new BankAccount("Nazrul Islam", 10000.0, 522522);
		myAcc.deposit(5000);
		myAcc.withdraw(300);
		myAcc.currentBalance();
		myAcc.showAccountInfo();

	}

}
