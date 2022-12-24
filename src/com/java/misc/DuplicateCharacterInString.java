package com.java.misc;
//Program to find the duplicate characters in a given string
public class DuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tst = "A quick brown fox jumps over the lazy dog in a jungle";
		String str = tst.toLowerCase();
		
		int count;
		//Converts given string into character array
		char[] chArr= str.toCharArray();
		
		System.out.println("given string: "+ str);
		for(int i=0;i<str.length(); i++) {
			count = 1;
			for(int j=i+1; j<str.length(); j++) {
				if(chArr[i] == chArr[j] && chArr[i] !=' ') {
					count++;
					//Set string[j] to 0 to avoid printing visited character
					chArr[j] = '0';
				}
			}
			
			//A character is considered as duplicate if count is greater than 1
			if(count > 1 && chArr[i]!='0') {
				System.out.println(chArr[i] + "="+count);
			}
			
		}
		
	}

}
