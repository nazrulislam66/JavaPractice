package com.javapractice.number;

public class FindSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tests = {8, 34, 3, 45, 56, 12, 3};
		
		int smallest = tests[0];
		
		for (int i = 0; i<tests.length; i++) {
			if(tests[i]< smallest) {
				smallest = tests[i];
			}
		}
		
		System.out.println(smallest);

	}

}
