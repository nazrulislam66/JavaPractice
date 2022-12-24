package com.javapractice.arraylist;

public class SingleDimDeclare {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		strArray[0] = "Apple";
		strArray[1] = "Orange";
		strArray[2] = "Pineapple";
		strArray[3] = "Mango";
		
		System.out.println(strArray[1]);
		
		/*for(String fruit: strArray){
			System.out.println(fruit);
			//System.out.println(strArray[1]);
			//System.out.println(strArray[2]);
			//System.out.println(strArray[3]);
		}*/

	}

}
