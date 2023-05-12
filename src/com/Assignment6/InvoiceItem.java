/**
 * 
 */
package com.Assignment6;

import java.util.Scanner;

/**
 * program to display the invoice items of uml diagram
 * @author mkanakkanadar
 * 27/04/2023
 */
public class InvoiceItem {
          private String id;
          private String desc;
          private int qty;
          private double unitPrice;
          
          //default constructor
          public InvoiceItem() {
        	  
          }
          //parameterized constructor
          public InvoiceItem(String id,String desc, int qty, double unitPrice) {
        	  this.id=id;
        	  this.desc=desc;
        	  this.qty=qty;
        	  this.unitPrice=unitPrice;
          }
          
          public void setQty(int qty) {
        	  this.qty=qty;
          }
          public void setUnitPrice(double unitPrice) {
        	  this.unitPrice=unitPrice;
          }
          public String getID() {
        	  return id;
          }
          public String getDesc() {
        	  return desc;
          }
          public int getQty() {
        	  return qty;
          }
          public double getUnitPrice() {
        	  return unitPrice;
          }
          public double getTotal()
          {
        	  return unitPrice*qty;
          }
          public String toString() {
        	  return "InvoiceItem[id="+id+",description ="+desc+",quantity="+qty+" ,unitPrice="+unitPrice+",Total = "+getTotal()+"]";
          
}
          public static void main(String args[]) {
        	  InvoiceItem invoiceItem1,invoiceItem2;
        	  
        	  invoiceItem1 = new InvoiceItem("A123","Powder",10,20.25);
        	  System.out.println("-------------Invoice--------------");
        	  System.out.println(invoiceItem1);
        	  System.out.println("----------------------------------");
        	  
        	  Scanner read = new Scanner(System.in);
        	  System.out.println("Quantity:  ");
        	  int qty = read.nextInt();
        	  System.out.print("Unit price :");
        	  double unitPrice = read.nextDouble();
        	  invoiceItem2 = new InvoiceItem("B123","Grocery",qty,unitPrice);
        	  System.out.println("-------------Invoice Items 2-------------");
        	  System.out.println(invoiceItem2);
        	  System.out.println("-----------------------------------------");
        	  read.close();
          }
}
