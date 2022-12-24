package com.java.number;

import java.util.Arrays;

public class BubbleSortExample {

	public static void main(String[] args) {
		int[] arrlist = { 15, 3, 9, 7, 19, 8, 1, 5 };
		int temp;
		for (int i = 0; i < arrlist.length - 1; i++) {
 
			for (int j = 1; j < arrlist.length - i; j++) {
				if (arrlist[j - 1] > arrlist[j]) {
					temp = arrlist[j - 1];
					arrlist[j - 1] = arrlist[j];
					arrlist[j] = temp;
				}
			}
			//log("Iteration " + (i + 1) + ": " + Arrays.toString(arrlist));
			System.out.println(Arrays.toString(arrlist));
		}
		
		System.out.println(Arrays.toString(arrlist));
	}

}
