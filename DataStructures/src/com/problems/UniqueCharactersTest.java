package com.problems;

/*
 * program to identify if all the characters in a string are unique or not
 */
import java.util.HashSet;

public class UniqueCharactersTest {

	public static void main(String[] args) {
		String s1 = "abcdefghtiy";
		String s2 = "abcdeffght";
		System.out.println(uniqueTest(s1));
		System.out.println(uniqueTest(s2));
	}

	public static boolean uniqueTest(String s) {
		char[] charArray = s.toCharArray();
		HashSet<Character> h = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			h.add(charArray[i]);
		}
		if (h.size() != charArray.length) {
			return false;
		} else {
			return true;
		}
	}
}
