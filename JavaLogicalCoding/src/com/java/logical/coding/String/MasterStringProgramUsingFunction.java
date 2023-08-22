package com.java.logical.coding.String;

import java.util.Scanner;

public class MasterStringProgramUsingFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		// System.out.println(str);
		reverseString(str);
		traverseString(str);
		occuranceCountOfString(str);
		countVowelAndConsonent(str);
		countNumberOfWords(str);
		numnerOfCharacterInString(str);

	}

	public static void reverseString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed string is: ");
		System.out.println(rev);
	}

	public static void traverseString(String str) {
		for (int i = 0; i < str.length(); i++) {

		}
		System.out.println("Traversed string is: ");
		System.out.println(str);
	}

	public static void occuranceCountOfString(String str) {
		int Scount = 0;
		int Ecount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 's') {
				Scount++;
			}
			if (str.charAt(i) == 'e') {
				Ecount++;
			}
		}
		System.out.println("Total number of occurance of string is: ");
		System.out.println("Number of S count: " + Scount);
		System.out.println("Number of E count: " + Ecount);
	}

	public static void countVowelAndConsonent(String str) {
		int vowelCount = 0;
		int consonentCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowelCount++;

			} else {
				consonentCount++;

			}
		}
		System.out.println("Vowel: " + vowelCount);
		System.out.println("Consonent: " + consonentCount);
	}

	public static void countNumberOfWords(String str) {
		System.out.println("Length number of words in string is: " + str.split("\\s+").length);
	}

	public static void numnerOfCharacterInString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
}
}
