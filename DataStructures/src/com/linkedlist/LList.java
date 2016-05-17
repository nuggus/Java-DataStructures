/**
 * 
 */
package com.linkedlist;

/**
 * @author nuggu
 *
 */
public class LList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LLOperations list = new LLOperations();
		System.out.println(list.lookup(8));
		list.add(8);// initially adding at head
		list.add(9, 2);
		list.add(4, 3);
		list.add(13, 0);
		list.add(12, 1);
		list.add(12, 1);
		list.add(99);
		list.add(99);// adding at tail
		list.printLL();

		int position = list.lookupPos(99);
		if (position != 777) {
			System.out.println("Element Found at node:" + position + " starting from 0 node");
		} else {
			System.out.println("Element not found in Linked List");
		}
		list.add(13, 0);
		list.remove(13);
		list.remove(12);
		list.printLL();
		System.out.println(list.lookup(4));
		list.replaceNodeValue(99, 100);
		list.add(77);
		list.add(77);
		list.add(77);
		list.printLL();
		list.interChangeSimultaneousNodes();
		list.printLL();
		list.removeSpecificNodes(8);
		list.printLL();
	}

}
