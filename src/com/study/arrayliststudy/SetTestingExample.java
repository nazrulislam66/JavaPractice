package com.study.arrayliststudy;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTestingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setDemo();
	}
	
	public static void setDemo(){
		
		int count[] = {34, 69, 29, 58, 69, 88, 25};
		
		Set<Integer> set = new HashSet<Integer>();
			
		try{
			for(int i = 0; i <6; i ++){
				set.add(count[i]);
			}
			System.out.println(set);
			
			// using TreeSet to sort the set
			TreeSet sortedset = new TreeSet<Integer>(set);
			System.out.println("My sorted set is: " + sortedset);
			
			System.out.println("The first element of set is: " + sortedset.first());
			
			System.out.println("The last element of set is: " + sortedset.last());
			
			
		}
		catch(Exception e){}
		
	}

}
