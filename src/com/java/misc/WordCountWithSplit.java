package com.java.misc;

public class WordCountWithSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tajmahal was build to respect Mamtaj";

		int result = countWords(str);

		System.out.println(result);

	}

	public static int countWords(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		
		String[] words = input.split("\\s+");
		
		return words.length;

	}

}

/*
 * If you are new to a regular expression in Java, the \s is a character class
 * to detect space including tabs, since \ needs to be escaped in Java, it
 * becomes \\s and because there could be multiple spaces between words we made
 * this regular expression greedy by adding +, hence \\s+ will find one more
 * space and split the String accordingly.
 */
