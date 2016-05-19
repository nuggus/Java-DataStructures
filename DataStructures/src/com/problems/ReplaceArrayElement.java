package com.problems;

/*
 * Replace every element in the given array with the nearest greatest element in the right side of the element 
 */
public class ReplaceArrayElement {

	public static void main(String[] args) {
		int[] numbers = { 7, 5, 8, 6, 9, 10, 1 }; // output: {8,8,9,9,10,10,1}
		numbers = replaceArrayElement(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	}

	// O(n*2) approach
	public static int[] replaceArrayElement(int A[]) {

		for (int i = 0; i < A.length; i++) {
			for (int j = (i + 1); j < A.length; j++) {
				if (A[i] < A[j]) {
					A[i] = A[j];
					break;
				}
			}
		}
		return A;

	}

}
