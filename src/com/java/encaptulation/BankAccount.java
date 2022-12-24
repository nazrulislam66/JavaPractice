package com.java.encaptulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//Nazrul Islam
//This class defines a new type of objects called BankAccount.
//Each BankAccount object represents information about one user's bank account
//information, such as their name and balance of money.
//A BankAccount has methods to deposit and withdraw money; these methods make
//sure that the account's balance does not become negative.
//An account also counts the total number of transactions performed on it.

public class BankAccount {

	// fields (encapsulated)
	private String name;
	private double balance;
	private int transactions; // count of total transactions (deposits and
								// withdrawals)
	private int id;
	private double transactionFee;

	// BankAccount marty = new BankAccount();
	// marty.name = "Marty Stepp";
	// marty.balance = 1000000.00;
	// marty.id = 12345;

	public BankAccount(String initialName, double initialBalance, int initialID) {
		name = initialName;
		balance = initialBalance;
		id = initialID;
		// transactions = 0;
		transactionFee = 1.00;
		System.out.println("Your name : " + name + "; " + "Your account number : " + id);
	}

	public void setTransactionFee(double fee) {
		if (fee >= 0.00) {
			transactionFee = fee;
		}
	}

	// Returns a String representation of the current bank account,
	// so that it can be printed by client code.
	public String currentBalance() {
		System.out.println("Current balance is: $" + balance);
		return name + ": $" + balance;
	}

	// Deposits (adds) the given amount to this account's balance.
	// The deposit will not be performed if the amount is negative.
	public void deposit(double amount) {

		System.out.println("balance before diposit: $" + balance);

		System.out.println("Your diposit amount is: $" + amount);
		if (amount >= 0.00) {
			balance = balance + amount;
			System.out.println("balance after diposit: $" + balance);
			transactions++;
		}
	}

	// Withdraws (subtracts) the given amount from this account's balance.
	// The withdrawal will not be performed if the amount is negative or if
	// the account does not have enough money to withdraw that amount.
	public void withdraw(double amount) {

		System.out.println("balance before withdrawal: $" + balance);

		System.out.println("Your withdrawal amount is: $" + amount);
		if (amount >= 0.00 && amount <= balance) {
			balance = balance - amount - transactionFee;

			System.out.println("Transaction fee : $" + transactionFee);
			System.out.println("balance after withdrawal: $" + balance);
			transactions++;
		}
	}

	public void showAccountInfo() {
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println("Today's date is: " + df.format(dateobj));

		System.out.println("You balance is: " + balance);

		System.out.println("Thank You To Be With US...");
	}
}