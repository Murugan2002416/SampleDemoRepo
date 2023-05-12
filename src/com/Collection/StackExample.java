/**
 * 
 */
package com.Collection;

import java.util.Stack;
import java.util.Iterator;
import java.util.Collection;
/**
 * @author mkanakkanadar
 *
 */
import java.util.Scanner;
class Staff {
	String staffName;
	String staffId;
	int empMobile;
	public Staff()
	{
		
	}
	public Staff(String staffName, String staffId, int empMobile ) {
		super();
		this.staffName = staffName;
		this.staffId = staffId;
		this.empMobile = empMobile;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public int getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(int empMobile) {
		this.empMobile = empMobile;
	}
	@Override
	public String toString() {
		return "Staff [staffName=" + staffName + ", staffId=" + staffId + "]";
	}
	
}
public class StackExample {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Stack<Staff> input = new Stack<Staff>();
		Staff obj = new Staff();
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter Staff name");
			String name = scan.next();
			System.out.println("Enter staffID");
			String staffId = scan.next();
			System.out.println("Enter mobile NO");
			int staffMobile = scan.nextInt();
			//scan.close();
			input.add(new Staff(name,staffId,staffMobile));
		}
		Iterator<Staff> itr = input.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 input.push(new Staff("MUrUds","19jd",9383248));
		 System.out.println(input);
	}

}
