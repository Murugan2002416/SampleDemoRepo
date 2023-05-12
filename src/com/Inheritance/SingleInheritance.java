/**
 * 
 */
package com.Inheritance;

/**
 * program to use single inheritance
 * @author mkanakkanadar
 * 28/04/2023
 */
class Employee
{
	String empName;
	int empId;
	public void setData(String empName, int empId)
	{
		this.empName = empName;
		this.empId = empId;
	}
	public void displayData1()
	{
		System.out.println("Employee name: "+empName+" Employee: "+empId);
	}
}
class Manager extends Employee
{
	String empDep;
	public void setDept(String empDep)
	{
		this.empDep = empDep;
	}
	public void displayData()
	{
		System.out.println("Employee Department: "+empDep);
	}
}
public class SingleInheritance {
	public static void main(String args[]) {
		Manager employee = new Manager();
		employee.setData("MURUGAN",1236);
		employee.setDept("CEO");
		employee.displayData1();
		employee.displayData();
	}

}
