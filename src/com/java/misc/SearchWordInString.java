package com.java.misc;

public class SearchWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "A quick brown fox jumps over the lazy dog";
		
		String str2[] = str.split("\\s+");
		
		String search = "brown";
		
		if(str.contains(search)) {
			System.out.println("found: " + search);
		}
		
		for(String t : str2) {
			if(t.contentEquals(search)) {
				System.out.println("found:" + search);
			}
		}

	}

}
