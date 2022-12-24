package com.misc;

public class StringExample1 {

	public static void main(String[] args) {
		
		String[] words = {"funk", "chunk", "furry", "terminator"};
		
		//startswith method
		for(String w: words){
			if(w.startsWith("fu"))
				System.out.println( w + " starts with fu");
		}
		
		//endswith method
		for(String w: words){
			if(w.endsWith("nk"))
				System.out.println( w + " ends with nk");
		}

	}

}
