package com.javapractice.number;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int[] numbers = {19, 3, 6, 22, 89, 203, 37, 88, 5, 100};
		
		int largest = numbers[0];
		
		for(int i = 1; i<numbers.length; i++){
			if(numbers[i]> largest){
				largest = numbers[i];
			}
		}
		
		System.out.println("The largest number: "+ largest);

	}

}
