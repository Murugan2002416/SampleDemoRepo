/**
 * 
 */
package com.Inheritance;

/**
 * progarm to display super keyword example
 * @author mkanakkanadar
 * 28/04/2023
 */
class EmployeeOne
{
	String empName="MURU";
	int empId=12;
	/*public void setDetail(String empName,int empId)
	{
		this.empName = empName;
		this.empId = empId;
	}
	public void Display()
	{
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee ID:"+empId);
	}*/
	 
}
class ManagerOne extends EmployeeOne
{
	String empDept;
	int empId;
	public void setDetails(String empDept, int empId)
	{
		this.empDept = empDept;
		this.empId = empId;
	}
	public void Print()
	{
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee ID:"+super.empId);
		System.out.println("Employee Department: "+empDept);
		System.out.println("Manager ID: "+empId);
	}
}
public class SuperExample {
	public static void main(String args[])
	{
		ManagerOne obj = new ManagerOne();
		//obj.setDetail("MURUGAN",1236);
		obj.setDetails("Sales",64321);
		//obj.Display();
		obj.Print();
	}

}
