package com.javapractice.arraylist;

public class StringArrayExample {

	public static void main(String[] args) {

		String[] texts = {"A", "quick", "brown",  "fox", "jumps", "over the lazy dog"};

		//print all the words
		for(String t: texts){
			System.out.println(t);
		}
		
		//find jumps
		for(String t: texts){
			if(t.contentEquals("jumps"))
			System.out.println("found the word");
		}
	}

}
