package com.javapractice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListFindElementByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>(Arrays.asList("alex", "brian", "charles", "dough"));

		list.add("Toyota");
		list.add("Honda");
		list.add("BMW");
		list.add("Teslar");
		list.add("Nissan");
		
		System.out.println(list);
		
		String firstName = list.get(0); // alex
		String secondName = list.get(1); // brian
		String seventhName = list.get(6);

		System.out.println(firstName);
		System.out.println(secondName);
		System.out.println(seventhName);
		
		
		
		for(String tst: list) {
			if(tst.contentEquals(seventhName)) {
				System.out.println(seventhName + " found item");
			}
		}
		
		Collections.sort(list);
		
		System.out.println("sorting");
		System.out.println(list);

	}

}
