package com.javapractice.number;

public class CompareNumbers {

	public static void main(String[] args) {
		
		int num1 = 123;
		int num2 = 123;
		
		if(num2>num1){
			System.out.println("num2 "+ num2+ " is greater than num1 "+ num1);
		}
		else if(num2<num1){
			System.out.println("num2 "+ num2+ " is smaller than num1 "+ num1);
		}
		else{
			System.out.println("num2 "+ num2+ " and "+ num1+" is equal");
		}

	}

}
