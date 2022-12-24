package com.javapractice.staticvariable;

public class StaticVariables {

	static int id = 100;
	StaticVariables(){
		id++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariables av = new StaticVariables();
		int myid = av.id;
		System.out.println("id = " +myid);
		
		StaticVariables av2 = new StaticVariables();
		int myid2 = av2.id;
		System.out.println("id = " +myid2);
		
		StaticVariables av3 = new StaticVariables();
		int myid3 = av.id;
		System.out.println("id = " +myid3);
		
		//################ 2nd class Test1 ###############
		// value not increasing because count is not static
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		
		//################ 2nd class Test1 ###############
		// value not increasing because count is not static
		Test2 ts1 = new Test2();
		Test2 ts2 = new Test2();
		Test2 ts3 = new Test2();

	}

}

// if variable is not static everytime you create object value gets 0 from count
class Test1
{
	int count = 100;
	Test1()
	{
		count++;
		System.out.println("value of count " + count);
	}
}

// static variable, increasing by 5
class Test2
{
	static int counter = 10;
	Test2()
	{
		counter = counter + 5;
		System.out.println("value of counter " + counter);
	}
}
