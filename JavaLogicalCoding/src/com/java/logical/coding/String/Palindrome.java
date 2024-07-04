package com.java.logical.coding.String;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		String org_rev = str;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println("Reversed string: " + rev);

		if (org_rev.equals(rev)) {
			System.out.println("It is a palindrome: " + rev);
		} else {
			System.out.println("It is not a palindrome: " + rev);
		}
	}

	/*
	 * public static void main(String[] args) { String str="serosoft"; int count=0;
	 * for(int i=0;i<str.length();i++) { if(str.charAt(i)=='o') { count++; } }
	 * System.out.println(count); }
	 */
	/*
	 * public static void main(String[] args) { String
	 * str="amarjeet kumar singh from bihar "; int count=0; for(int
	 * i=0;i<str.length();i++) { count++; } System.out.println(count); }
	 */

}
