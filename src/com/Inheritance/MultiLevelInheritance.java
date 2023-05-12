/**
 * 
 */
package com.Inheritance;

/**
 * program to display multilevel inheritance
 * @author mkanakkanadar
 * 28/04/2023
 */
class Person
{
	String personName;
	int personAge;
	int personMobileNo;
	public void setDetails(String personName, int personAge, int personMobileNo)
	{
		this.personName = personName;
		this.personAge = personAge;
		this.personMobileNo = personMobileNo;
	}
	public void display()
	{
		System.out.println("Name "+personName+" Age "+personAge+" MobileNo"+personMobileNo);
	}
}
class Employee1 extends Person
{
	int empId;
	public void setData(int empId)
	{
		this.empId = empId;
	}
	public void show()
	{
		System.out.println(empId);
	}
}
class Manager1 extends Employee1
{
	String empDep;
	public void setInfo(String empDep)
	{
		this.empDep = empDep;
	}
	public void Print()
	{
		System.out.println(empDep);
	}
}
public class MultiLevelInheritance {
	public static void main(String args[]) {
		Manager1 obj = new Manager1();
		obj.setDetails("MURUGAN", 21,995255765);
		obj.setData(1236);
		obj.setInfo("CEO");
		obj.display();
		obj.show();
		obj.Print();
		
	}

}
