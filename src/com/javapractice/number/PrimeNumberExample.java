package com.javapractice.number;

public class PrimeNumberExample {

	public static void main(String[] args) {
		//limit number
		int limit = 100;
		
		System.out.println("Prime numbers between 1 and " + limit);
        
        //loop through the numbers one by one
		for(int i=1; i<limit; i++){
			
			boolean isPrime= true;
			
			//check is the number is prime!
			for(int j=2; j<i; j++){
				if(i % j == 0){
					isPrime=false;
					break;
				}
			}
			
			//print prime
			if(isPrime){
				System.out.println("The prime number is: " + i);
			}
		}	
		
	}

}
