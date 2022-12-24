package com.java.arrays;

public class SearchStringFromArray {

	public static void main(String[] args) {
		String[] arrayOfString = {"Apple", "Pineapple", "Mango", "Banana", "Apple", "Banana", "Pineapple", "Orange"};
		String searchString = "Banana";
		int count = 0;
		for(String item: arrayOfString){
			if(item.equals(searchString)){
				System.out.println("Item found: "+ item);
				count++;
			}
			
		}
		System.out.println(count);
	}

}
