package com.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		names.add("Viswanath");
		names.add("Nuggu");
		names.add("UTSA");
		ListIterator<String> l = names.listIterator(names.size());
		while (l.hasPrevious()) {
			System.out.println(l.previous());
		}
		
	}

}
