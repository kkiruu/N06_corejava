package org.tnsif.singledimentionalarray;
//program to /demonstrate on Array of Objects
public class Employee {
	//private data members
	private int ID;
	private String name;
	private double salary;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//parameterized constructor
	public Employee(int iD,String name,double salary)
	{
		super();
		ID=iD;
		this.name=name;
		this.salary=salary;
		
	}
}
