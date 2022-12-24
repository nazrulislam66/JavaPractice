package com.javapractice.abstraction;

public class Demo extends AbstractExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj = new Demo();
		obj.disp();	
	}
	
	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("Thsi is child");
	}
	

}
