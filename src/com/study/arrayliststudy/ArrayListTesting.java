package com.study.arrayliststudy;

import java.util.*;
import com.study.arrayliststudy.*;

public class ArrayListTesting {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createStringArrayList();
		
		
	}
	
	public static void createStringArrayList(){
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Nazrul");
		al.add("Islam");
		al.add("Zafor");
		al.add("Malsi");
		al.add("Raya");
		al.add("Roja");
		
		Iterator it = al.iterator();
		while(it.hasNext()){
			System.out.println("Names are: " + it.next());
		}
	}
	
	

}
