package com.java.misc;

public class WordCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Dhaka city   is by the river    of Buriganga";
		
		String res[] = str.split("\\s+");
		
		System.out.println(res.length);

	}

}
