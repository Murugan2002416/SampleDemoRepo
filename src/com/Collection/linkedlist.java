/**
 * 
 */
package com.Collection;

/**
 * @author mkanakkanadar
 *
 */
import java.util.*;
class student
{
	String stuName;
	String stuRollNo;
	public student()
	{
		
	}
	public student(String stuName, String stuRollNo) {
		super();
		this.stuName = stuName;
		this.stuRollNo = stuRollNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuRollNo() {
		return stuRollNo;
	}
	public void setStuRollNo(String stuRollNo) {
		this.stuRollNo = stuRollNo;
	}
	@Override
	public String toString() {
		return "student [stuName=" + stuName + ", stuRollNo=" + stuRollNo + "]";
	}
	
}
public class linkedlist {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		LinkedList<student> list = new LinkedList<student>();
//		list.add(new student("Sivaram","19L227"));
//		list.add(new student("Murugan","19L226"));
		for(int i=0; i<1; i++)
		{
			System.out.println("Enter the Student ID: ");
			String id = scan.next();
			System.out.println("Enter the Student Name: ");
			String name = scan.next();
			list.add(new student(id,name));
		}
		Iterator<student> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collection.;
		
		
		LinkedList<String> List = new LinkedList<String>();
		List.add("Murugan");
		List.add("Sivaram");
		List.add("Manojh");
		List.add("Madesh");
		
		System.out.println(List);
		
}

}
