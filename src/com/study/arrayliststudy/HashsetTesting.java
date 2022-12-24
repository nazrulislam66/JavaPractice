package com.study.arrayliststudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringHashset();
		
	}
	
	public static void stringHashset(){
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Nazrul");
		hs.add("Raya");
		hs.add("Mishu");
		hs.add("Raya");
		hs.add("Roja");
		hs.add("Mishu");
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext()){
			System.out.println("The name: " + itr.next());
		}
	}

}
