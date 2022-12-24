package com.java.misc;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "My Garden", nstr="";
        char ch;
        
        System.out.println("Original String: "+ str);
        for(int i=0; i<str.length(); i++) {
        	//extract each character of string
        	ch = str.charAt(i);
        	nstr = ch + nstr;
        	
        }
        System.out.println(nstr);
	}

}
