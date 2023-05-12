/**
 * 
 */
package com.Collection;

/**
 * @author mkanakkanadar
 *
 */
interface Emp {
	public abstract String name(String n,String m);
}
public class AnonymousClassInterfsce implements Emp  {
	public static void main(String args[]) {
		Emp  obj = (n,m)->(n.concat(m));
		System.out.println(obj.name("bye","hi"));
		
	}

}
