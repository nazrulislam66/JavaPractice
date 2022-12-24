package com.java.misc;

public class WordCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The sky is blue";
		int res = myWord("This is my test to run automation");
		
		System.out.println(res);
		
		String str1[] = str.split("\\s+");
		System.out.println(str1.length);

	}
	
	
	public static int myWord(String input) {
		if(input == null || input.isEmpty()) {
			return 0;
		}
		
		String str[] = input.split("\\s+");
		
		return str.length;
	}

}
