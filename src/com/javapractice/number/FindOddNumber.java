package com.javapractice.number;

public class FindOddNumber {

	public static void main(String[] args) {
		int[] numbers = {19, 3, 6, 22, 89, 203, 37, 88, 5, 100};
		
		int oddNumber = 0;
		
		for(int i=0; i<numbers.length; i++){
			if(numbers[i]%2 !=0){
				oddNumber = numbers[i];
				System.out.println("Odd numbers are: "+ oddNumber);
			}
		}

	}

}
