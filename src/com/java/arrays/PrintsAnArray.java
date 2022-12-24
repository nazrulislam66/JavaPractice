package com.java.arrays;

public class PrintsAnArray {

	public static void main(String[] args) {
		
		int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 6, 9};
		for (int i = 0; i < testArray.length; i++) {
	         if (i > 0) {
	            System.out.print(", ");
	         }
	         System.out.print(testArray[i]);
	      }

	}

}
