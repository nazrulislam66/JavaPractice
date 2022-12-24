package com.java.recursion;

public class AddNumbersFiveToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(5, 10);
	    System.out.println(result);
	}
	
	public static int sum(int start, int end) {
	    if (end > start) {
	      return end + sum(start, end - 1);
	    } else {
	      return end;
	    }
	  }

}

/*
 * In this example, 
 * the function adds a range of numbers between a start and an
 * end. The halting condition for this recursive function is when end is not
 * greater than start:
 */