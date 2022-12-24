package com.misc;

public class LoopTesting {

	public static void main(String[] args) {
		
		testForLoop();
		System.out.println("==============================");
		testWhileLoop();
		System.out.println("==============================");
		testDoLoop();

	}
	
	public static void testForLoop(){
		
		int x = 10;
		for(x=0; x<=10; x++){
			System.out.println("x = " + x);
		}
	}
	
	public static void testWhileLoop(){
		
		int x = -10;
		while(x<=0){
			System.out.println("x = " + x);
			x += 1;
		}
	}
	
	public static void testDoLoop(){
		
		int x = 10;
		do{
			System.out.println("x = " + x);
			x -= 1;
		}while(x >0);
	}

}
