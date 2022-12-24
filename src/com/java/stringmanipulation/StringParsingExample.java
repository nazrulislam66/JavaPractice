package com.java.stringmanipulation;

public class StringParsingExample {

	public static void main(String[] args) {
		
		String str = "This is a sentence.  This is a question, right?  Yes!  It is.";
		String delims = "[ .,?!]+";
		String[] tokens = str.split(delims);
		for(int i=0; i<tokens.length; i++){
			System.out.println(tokens[i]);
		}
		

	}

}
