package com.Core.Java.StringStringBufferStringBuilder;

public class StringBuilderMethods {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Amarjeet Kumar Singh");

		// 1. append() --> Used to add value at last of the index it is like concat().
		System.out.println(sb.append("From Bihar"));

		// 2. insert() --> Used to insert the element at given position.
		System.out.println(sb.insert(20, "Working at Edifecs Technologies"));

		// 3. replace() -->
		System.out.println(sb.replace(20, 62, "Working at UpWork India"));

		// 4. delete() --> Used to delete element from position.
		System.out.println(sb.delete(20, 62));

		// 5. reverse() --> Used to reverse the element
		System.out.println(sb.reverse());
		
	}

}
