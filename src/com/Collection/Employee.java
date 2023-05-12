/**
 * 
 */
package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author mkanakkanadar
 *
 */
public class Employee {
	String empId;
	String empName;
	public Employee()
	{
		
	}
	public Employee(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	

	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String toString() {
		return "[empid = "+empId+",empname="+empName+"]";
	}


	public static void main(String args[]) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		
		arrayList.add(new Employee("1","murugan"));
		arrayList.add(new Employee("2","Manojh"));
		//System.out.println(arrayList);
		Iterator<Employee> itr = arrayList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
