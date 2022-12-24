package com.javapractice.number;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int num1 = 10;
        int num2 = 20;
		int temp = num1;
        num1 = num2;
        num2 = temp;
       
        System.out.println("After Swapping");
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is :" +num2);

	}

}
