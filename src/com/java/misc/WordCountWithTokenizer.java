package com.java.misc;

import java.util.StringTokenizer;

public class WordCountWithTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Tajmahal was build to respect Mamtaj";

		int result = countWordsWithTokenizer(str);

		System.out.println(result);

	}

	public static int countWordsWithTokenizer(String sentence) {
		if (sentence == null || sentence.isEmpty()) {
			return 0;
		}
		StringTokenizer tokens = new StringTokenizer(sentence);
		return tokens.countTokens();
	}

}

/*
 * Constructs a string tokenizer for the specified string. The tokenizer uses
 * the default delimiter set, which is " \t\n\r\f": the space character, the tab
 * character, the newline character, the carriage-return character, and the
 * form-feed character. Delimiter characters themselves will not be treated as
 * tokens
 * You can see that we have not given any explicit delimiter to StringTokenizer, 
 * it uses the default set of delimiters which is enough to find any whitespace and 
 * since words are separated by whitespace, the number of tokens is actually equal 
 * to the number of words in given String. 
 */