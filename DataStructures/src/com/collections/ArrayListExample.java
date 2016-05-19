/**
 * 
 */
package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author nuggu
 *
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creating ArrayList
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> age = new ArrayList<Integer>();
		list.add("Viswanath Nuggu");
		list.add("Naveen Nuggu");
		// printing using for each loop
		for (String o : list) {
			System.out.println(o);
		}
		// print by iterator interface
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		age.add(26);
		age.add(23);
		Object[] a = new String[list.size()];
		a = list.toArray();
		for (int i1 = 0; i1 < a.length; i1++)
			System.out.println(a[i1]);
	}
	

}
