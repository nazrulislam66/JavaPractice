package com.study.arrayliststudy;

import java.util.HashMap;
import java.util.Map;

public class MapObjectExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mapObjectTesting();
	}
	
	public static void mapObjectTesting(){
		
		Map m1 = new HashMap();
		
		m1.put("5", "Mahiya");
		m1.put("7", "Naz");
		m1.put("9", "Raya");
		m1.put("11", "Mishu");
		m1.put("13", "Roja");
		
		System.out.println(" The key pair value is: " + m1);
		
	}

}
