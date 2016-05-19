package com.collections;

import java.util.Iterator;
import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		Queue<String> queue = new java.util.PriorityQueue<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		System.out.println(queue.peek());
		Iterator<String> li=queue.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
	}

}
