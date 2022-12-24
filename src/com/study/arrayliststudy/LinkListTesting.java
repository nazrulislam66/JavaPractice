package com.study.arrayliststudy;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringListTesting();
	}
	
	public static void stringListTesting(){
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Nazrul");
		ll.add("Islam");
		ll.add("Badhon");
		ll.add("Raya");
		ll.add("Brishti");
		
		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext()){
			System.out.println("The name is: " + itr.next());
		}
		
	}

}
