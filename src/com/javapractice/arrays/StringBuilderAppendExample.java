package com.javapractice.arrays;

public class StringBuilderAppendExample {

	public static void main(String[] args) {
		int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		StringBuilder sb = new StringBuilder();
	      for (int i = 0; i < testArray.length; i++) {
	         if (i > 0) {
	            sb.append(", ");
	         }
	         sb.append(testArray[i]);
	      }
	      System.out.println(sb.toString());
	}

}
