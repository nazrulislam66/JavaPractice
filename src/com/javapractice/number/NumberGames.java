package com.javapractice.number;
import java.util.Arrays;
public class NumberGames {

	public static void main(String[] args) {
		
		findEvenNumbers();
		findOddNumbers();
		findDuplicate();
	}
	
	//get the prime number from 1 - 100
	public static void testPrimeNumber(){
		
		for(int i=2;i<=100;i++){
			for(int j=2;j<=i;j++){
				if(j==i){
					System.out.println(i);			
				}
				if(i%j==0){
					break;
				}
			}
		}
	}
	
	public static void findEvenNumbers(){
		int[] numbers = {3, 22, 33, 21, 44, 68, 53, 90, 78, 35, 100};
		int temp = numbers[0];
		int sum = 0;
		for (int i = 1; i<numbers.length; i++){
			if(numbers[i]%2==0){
				temp=numbers[i];
			}
			sum = sum + temp;
			
			System.out.print(temp +"\t");
		}
		System.out.println();
		System.out.println(sum);
	}
	
	public static void findOddNumbers(){
		int[] numbers = {3, 22, 33, 21, 44, 69, 53, 90, 77, 35, 100};
		int temp = numbers[0];
		int sum = 0;
		for (int i = 1; i<numbers.length; i++){
			if(numbers[i]%2!=0){
				temp=numbers[i];
			}
			sum = sum + temp;
			
			System.out.print(temp +"\t");
		}
		System.out.println();
		System.out.println(sum);
	}

	public static void findDuplicate(){
		int[] numbers = {21, 21, 33, 45, 55, 65, 44, 76, 45, 88, 55};
		int temp = 0;
		Arrays.sort(numbers);
		
		for (int i = 1; i<numbers.length; i++){
			if(numbers[i-1]==numbers[i]){
				temp = numbers[i-1];
				System.out.print(temp+"\t");
			}
			
		}
	}

}
