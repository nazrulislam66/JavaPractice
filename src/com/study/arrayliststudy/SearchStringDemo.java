package com.study.arrayliststudy;

public class SearchStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchStringDemo search = new SearchStringDemo();
		search.searchString1();
	}
	
	public static void searchString1(){
		String original = "A quick brown fox jumps over the lazy dog";
		String find1 = "jumps";
		String find2 = "dumps";
		
		original.contains(find1);
		
		System.out.println(original.contains(find1));
		System.out.println(original.contains(find2));
	}
	
	public static void searchString2(){
		
	}

}
