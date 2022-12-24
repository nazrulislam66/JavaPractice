package classandobjectexample;

public class EmployeePayment {

	public static void main(String[] args) {
		
		Employee Alex = new Employee();
		Alex.salary = 80000;
		Alex.bonus = 15000;
		Alex.calculateTotalPay();
		
		Employee Linda = new Employee();
		Linda.salary = 90000;
		Linda.bonus = 16000;
		Linda.calculateTotalPay();
		
		Employee Nazrul = new Employee();
		Nazrul.salary = 110000;
		Nazrul.bonus = 20000;
		Nazrul.calculateTotalPay();
		
	}

}
