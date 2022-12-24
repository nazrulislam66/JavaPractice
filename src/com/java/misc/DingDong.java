package com.java.misc;

public class DingDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print("\n ding dong  - " + i);
			}
			else if(i % 5 == 0) {
				System.out.print("\n Dong  - " + i);
			}
			else if(i % 3 == 0) {
				System.out.print("\n ding  - " + i);
			}
		}

		
	}

}
