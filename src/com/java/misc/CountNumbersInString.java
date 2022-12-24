package com.java.misc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = countDigits("BD23Tech5");
		
		System.out.println(count);
		
	}
	
	static int countDigits(String stringToSearch) {
	    Pattern digitRegex = Pattern.compile("\\d");
	    Matcher countEmailMatcher = digitRegex.matcher(stringToSearch);

	    int count = 0;
	    while (countEmailMatcher.find()) {
	        count++;
	    }

	    return count;
	}

}
