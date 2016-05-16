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
	 * position in simple language: this method is used to add a node to the
	 * linked list. For this in:
	 * STEP1: a temporary node is created with the data to be stored in that node. 
	 * STEP2: another node (current) pointing to head node is assigned. 
	 * STEP3: traverse till the position where we need to insert new node. 
	 * STEP4: now for the temporary node assign its next node as the current node's next node (so that we will cut the connection of the list and assign new link here). 
	 * STEP5: assign the created temp node as current node's next node and it is done.
	 */
	public void add(int data, int position) {
		// STEP1:
		Node temp = new Node(data, null);
		// STEP2:
		Node current = head;
		// STEP3:
		for (int i = 0; i < position && current.getNext() != null; i++) {
			current = current.getNext();// traversing to next node
		}
		// STEP4:
		temp.setNext(current.getNext());
		// STEP4:
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
			pos = i;
			return pos;
		} else
			return pos;
	}

	// printLL() is used to traverse and print the nodes in LList
	public void printLL() {
		Node ll = new Node(null);
		ll = head.getNext();
		while (ll.getNext() != null) {
			System.out.print(ll.getData());
			System.out.print("->");
			ll = ll.getNext();
		}
		System.out.println(ll.getData());
	}

	public void removeHead(Node ll) {
		@SuppressWarnings("unused")
		Node temp = ll;
		head = head.getNext();
		temp = null;
	}

	/*
	 * remove() is used to remove the nodes with the key value
	 * 
	 */
	public void remove(int key) {

		Node ll = new Node(null);
		ll = head.getNext();
		Node previous = new Node(null);
		boolean flag = true;
		while (flag) {
			if (ll.getData() == key) {
				removeHead(ll);
				ll=ll.getNext();
			} else {
				flag = false;
			}
		}

		while (ll.getNext() != null) {

			if (ll.getData() == key) {
				previous.setNext(ll.getNext());
				ll = previous.getNext();
			} else {
				previous = ll;
				ll = ll.getNext();
			}
		}
		if (ll.getData() == key) {
			previous.setNext(null);
		}
	}

}
