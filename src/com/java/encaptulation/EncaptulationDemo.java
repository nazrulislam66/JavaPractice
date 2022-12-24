package com.java.encaptulation;

	/*The whole idea behind encapsulation is to hide the implementation details
	from users. If a data member is private it means it can only be accessed
	within the same class. No outside class can access private data member (variable)
	of other class. However if we setup public getter and setter methods to update
	(for e.g. void setSSN(int ssn))and read (for e.g.  int getSSN()) the private data
	fields then the outside class can access those private data fields via public methods.
	 */
public class EncaptulationDemo {

	private int ssn;
    private String empName;
    private int empAge;
    
    //Get and Set method
    public int getSsn(){
    	return ssn;
    }
    
    public String getEmpName(){
    	return empName;
    }
    
    public int getAge(){
    	return empAge;
    }
    
    public void setSsn(int essn){
    	this.ssn = essn;
    }
    
    public void setEmpName(String name){
    	this.empName = name;
    }
    
    public void setEmpAge(int age){
    	this.empAge = age;
    }
    
}
