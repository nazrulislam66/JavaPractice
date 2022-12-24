package com.java.misc;

public class CheckAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'D';
		
		if((ch>='a' && ch<='z' )||(ch>='A' && ch<='Z')) {
			System.out.println(ch + " is an alphabet");
		}
		else {
			System.out.println(ch + " is not an alphabet");
		}
	}

}
