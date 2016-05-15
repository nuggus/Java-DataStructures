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

	// constructor
	public LLOperations() {
		head = new Node(null);
	}

	/*
	 * below add() is used to insert node at the end of the LList, nothing but
	 * an append operation
	 */
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

	/*
	 * below lookup() is used to search for a key value in LList and return
	 * boolean value
	 */

	public boolean lookup(int key) {
		boolean found = false;
		Node llist = new Node(null);
		llist = head.getNext();
		// condition to check if LList is empty or not
		if (llist == null) {
			return found;
		} else {
			while (llist.getNext() != null) {
				// condition to check if node contains key value
				if (llist.getData() == key) {
					found = true;
				}
				llist = llist.getNext();
			}
			// condition to check if key is found in the last node
			if (llist.getData() == key) {
				found = true;
			}
			return found;
		}
	}

	/*
	 * below lookupPos() is used to search for a key value in LList and return
	 * node position
	 */

	public int lookupPos(int key) {
		boolean found = false;
		Node llist = new Node(null);
		llist = head.getNext();
		int i = 0, pos = 777;
		// condition to check if LList is empty or not

		while (llist.getNext() != null) {
			// condition to check if node contains key value
			if (llist.getData() == key) {
				pos = i;
				return pos;
			}
			i++;
			llist = llist.getNext();
		}
		// condition to check if key is found in the last node
		if (llist.getData() == key) {
			found = true;
			pos=i;
			return pos;
		}else return pos;
	}

	// printLL() is used to traverse and print the nodes ini LList
	public void printLL() {
		Node ll = new Node(null);
		// System.out.print(head.getData());
		ll = head.getNext();
		while (ll.getNext() != null) {
			System.out.print(ll.getData());
			ll = ll.getNext();
		}
		System.out.println(ll.getData());
	}

}
