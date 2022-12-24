package com.study.arrayliststudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] things = {"Mango", "Orange", "Apple", "Strawberry", "Kiwi", "Banana"};
		System.out.println("Original Array string");
		for(int i = 0; i<things.length; i++){
			System.out.print(things[i] + " ");
		}
		
		Arrays.sort(things);
		System.out.println("\n\nSorted String ");
		for(int i = 0; i<things.length; i++){
			System.out.print(things[i] + " ");
		}
		
	}
	
	public static void arrayTesting1(){
		String[] things = {"Mango", "Orange", "Apple", "Strawberry", "Kiwi", "Banana"};
		List<String> list = new ArrayList<String>();
		
				
		Collections.sort(list);
		for (String x: list){
			System.out.println("The Fruits are: " +x);
		}
	}

}
