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
		list.add(8);//initially adding at head
		list.add(9,2);
		list.add(4,3);
		list.add(13,0);
		list.add(12,1);
		list.add(99);//adding at tail
		list.printLL();
	}

}
