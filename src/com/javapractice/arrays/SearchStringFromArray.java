package com.javapractice.arrays;

public class SearchStringFromArray {

	public static void main(String[] args) {
		String[] arrayOfString = {"Apple", "Pineapple", "Apple", "Mango", "Banana", "Orange"};
		String searchString = "Banana";
		int count;
		for(String item: arrayOfString){
			count = 1;
			if(item.equals(searchString)){
				System.out.println("Item found: "+ item);
				count++;
				if(count>1) {
					System.out.println(count);
				}
			}
		}
	}

}
