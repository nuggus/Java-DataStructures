/**
 * 
 */
package com.linkedlist;

/**
 * @author nuggu
 *
 */
public class LLOperations {
	Node head;

	public LLOperations() {
		head = new Node(null);
	}

	// below add method is used to insert node at the end of the LList
	public void add(int data) {
		Node temp = new Node(data, null);
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();// traversing to next node
		}
		/*
		 * for the new node we are setting its next node as current nodes next
		 * node
		 */

		temp.setNext(current.getNext());
		// now we will add our new node (temp) to the linked list
		current.setNext(temp);
	}

	/*
	 * below add() is an overloaded method, used to insert new node at specified
	 * position
	 */
	public void add(int data, int position) {
		Node temp = new Node(data, null);
		Node current = head;
		for (int i = 0; i < position && current.getNext() != null; i++) {
			current = current.getNext();// traversing to next node
		}
		/*
		 * for the new node we are setting its next node as current nodes next
		 * node
		 */

		temp.setNext(current.getNext());
		// now we will add our new node (temp) to the linked list
		current.setNext(temp);
	}

	public void printLL() {
		Node ll = new Node(null);
		// System.out.print(head.getData());
		ll = head.getNext();
		while (ll.next != null) {
			System.out.print(ll.getData());
			ll = ll.getNext();

		}
		System.out.println(ll.getData());
	}

}
