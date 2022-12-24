package com.misc;

//Java Program to Check Palindrome Number
//A palindromic number is a number that remains the same when its digits are reversed.
public class PalidromicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3553, reversedNum = 0, remainder;

		// store the number to originalNum
		int originalNum = num;

		// get the reverse of originalNum
		// store it in variable
		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num/10;
		}

		// check if reversedNum and originalNum are equal
		if (originalNum == reversedNum) {
			System.out.println(originalNum + " is Palindrome.");
		} else {
			System.out.println(originalNum + " is not Palindrome.");
		}

	}

}
