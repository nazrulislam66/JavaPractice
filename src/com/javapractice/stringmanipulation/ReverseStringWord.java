package com.javapractice.stringmanipulation;

public class ReverseStringWord {

	public static void main(String[] args) {
		
		reversString1();
	}
	
	//reverse word in string
		public static void reversString1(){
			String str = "I love java coding";
			String[] str2 = str.split(" ");
			String temp="";
			// Print the string
			for(int i =0;i<str2.length; i++){
				System.out.print(str2[i]+ " ");
			}
			
			//Print reverse word
			for(int i =str2.length-1; i>=0; i--){
				temp= temp+str2[i]+" ";
			}
			System.out.println("\nThe reverse string is: ");
			System.out.print(temp);
		}


}
