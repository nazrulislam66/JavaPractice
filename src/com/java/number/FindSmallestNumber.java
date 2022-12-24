package com.java.number;

public class FindSmallestNumber {

	public static void main(String[] args) {
		
		int[] numbers = {19, 3, 6, 22, 89, 203, 37, 88, 5, 100};
		
		int smallest = numbers[0];
		
		for(int i = 1; i<numbers.length; i++){
			if(numbers[i]< smallest){
				smallest = numbers[i];
			}
		}
		
		System.out.println("The smallest number is: " + smallest);

	}

}
