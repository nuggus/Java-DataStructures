/**
 * 
 */
package com.linkedlist;

/**
 * @author nuggu
 *
 */
public class Node {
	int data;
	Node next;

	// below constructor is used to create node for adding node at the end
	public Node(int data) {
		this.data = data;
	}

	// below constructor is used to create node after particular position
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Node(Object object) {
		this.data = 0;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
