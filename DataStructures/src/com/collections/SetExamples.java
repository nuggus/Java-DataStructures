package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	public static void main(String[] args) {
		Set<String> s1=new HashSet<String>();
		s1.add("Viswanath");
		s1.add("Nuggu");
		s1.add("Viswanath");
		s1.add("A");
		System.out.println(s1);

		Set<String> s2=new LinkedHashSet<String>();
		s2.add("Viswanath");
		s2.add("Nuggu");
		s2.add("Viswanath");
		s2.add("A");
		System.out.println(s2);//unique and maintains insertion order
		
		Set<String> s3=new TreeSet<String>();
		s3.add("Viswanath");
		s3.add("Nuggu");
		s3.add("Viswanath");
		s3.add("A");
		System.out.println(s3);// unique and maintains ascending order
	}
}
