/**
 * 
 */
package com.Assignment6;

/**
 * program perform operations of a bank system like 
 * @author mkanakkanadar
 * 28/04/2023
 */
public class Account {
    private String name;
    private String id;
    int balance = 0;
    public Account(String id,String name)
    {
    	this.id =id;
    	this.name = name;
    }
    public Account(String id,String name,int balance)
    {
    	this.id = id;
    	this.name = name;
    	this.balance = balance;
    }
    public String getID()
    {
    	return id;
    }
    public String getName()
    {
    	return name;
    }
    public int balance()
    {
    	return balance;
    }
    public int credit(int amount)
    {
    	balance = amount+balance;
    	return balance;
    }
    public int debit(int amount)
    {
    	if(amount<=balance)
    		balance = balance-amount;
    	else
    		System.out.println("Amount exceeded balance");
    	return balance;
    }
    public int transferTo(Account another,int amount)
    {
    	if(amount<=balance)
    	{
    		balance = balance-amount;
    	    another.balance = balance+amount;
    	}
    	else
    		System.out.println("Amount exceeded balance");
    	return balance;
    }
    public String toString()
    {
    	return "Account[id="+id+", name="+name+", balance="+balance+"]";
    }
    public static void main(String args[]) {
    	Account another;
    	another obj = new Account();
    	another = new Account();
    	
    }

}
