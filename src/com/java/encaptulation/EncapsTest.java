package com.java.encaptulation;

public class EncapsTest {

	public static void main(String[] args) {
		
		EncaptulationDemo enc = new EncaptulationDemo();
		//give set value
		enc.setSsn(2345125);
		enc.setEmpName("Nazrul Islam");
		enc.setEmpAge(40);
		
		//get value
		int empssn = enc.getSsn();
		String empName = enc.getEmpName();
		int empAge = enc.getAge();
		
		//print
		System.out.println("Employee SSN: "+ empssn);
		System.out.println("Employee Name: "+ empName);
		System.out.println("Employee Age: "+ empAge);
	}

}
