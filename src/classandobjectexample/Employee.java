package classandobjectexample;

public class Employee {

	double salary;
	double bonus;
	
	public void calculateTotalPay(){
		double totalpay = salary + bonus;
		System.out.println("Total Payment : " + totalpay);
	}
}
