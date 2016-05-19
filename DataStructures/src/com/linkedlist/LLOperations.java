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
	 * STEP1: CREATE ll and assign head to it, create a boolean flag and previous node
	 * STEP2: check if the node to be removed is head node and remove head if it is matched and 
	 * also recursively check if after removal of head new head node also contains same node value 
	 * or not if so continue removal of head.
	 * STEP3: check if the node to be removed is internal node by traversing each node and compare with key, 
	 * if so then use previous node and set previous node's next link as current node's next link
	 * STEP4: check if the node is the tail node to be removed and assign previous node's next link to null
	 */
	public void remove(int key) {
		// STEP1:
		Node current = new Node(null);
		current = head.getNext();
		Node previous = new Node(null);
		boolean flag = true;
		// STEP2:
		while (flag) {
			if (current.getData() == key) {
				removeHead(current);
				current = current.getNext();
			} else {
				flag = false;
			}
		}
		// STEP3:
		while (current.getNext() != null) {

			if (current.getData() == key) {
				previous.setNext(current.getNext());
				current = previous.getNext();
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		// STEP4:
		if (current.getData() == key) {
			previous.setNext(null);
		}
	}
	/*
	 * llsort() is used to sort the LL in ascending order
	 */
	
	public void llsort(Node current){
		current=head;
		while(current.getNext()!=null){
			
		}
		
		
	}
	
	/*
	 * replaceNodeValue(int key,int newKey)
	 */
	public void replaceNodeValue(int key, int newKey){
		Node current=new Node(null);
		current=head;
		while(current.getNext()!=null){
			if(current.getData()==key){
				current.setData(newKey);
			}
			current=current.getNext();
		}
		if(current.getData()==key){
			current.setData(newKey);
		}
	}
	/*
	 * interchange simultaneous nodes 
	 */
	public void interChangeSimultaneousNodes() {
		Node even;
		Node odd,current;
		int i=0;
		LLOperations newList = new LLOperations();
		current = head.getNext();
		odd=head.getNext();
		even=head.getNext().getNext();
		while (current.getNext() != null) {
			if(i%2==0){
				newList.add(even.getData());
				if(even.getNext()!=null)
				even=even.getNext().getNext();
			}else{
				newList.add(odd.getData());
				odd=odd.getNext().getNext();
			}

			current = current.getNext();
			i++;
		}
		newList.add(odd.getData());
		System.out.println("New List");
		head=newList.head;
	}
	/*
	 * remove the nodes which are greater than a specific value
	 */
	
	public void removeSpecificNodes(int key){
		Node current;
		current=head.getNext();
		while(current.getNext()!=null){
			if(current.getData()>key){
				remove(current.getData());
			}
			current=current.getNext();
		}
	}
	
	public void reverseLList(){
		
	}
	
	
	
}
