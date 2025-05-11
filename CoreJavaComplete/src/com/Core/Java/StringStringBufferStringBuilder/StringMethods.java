package com.Core.Java.StringStringBufferStringBuilder;

public class StringMethods {
	public static void main(String[] args) {
		String str1 = "AMARJEET KUMAR SINGH";
		String str2 = "amarjeet amarjeet kumar singh";

		// 1. length() --> Used to find the length of the string.
		System.out.println(str1.length());

		// 2. concat() --> Used to combine two string.
		String str = str1.concat("From Bihar");
		System.out.println(str);

		// 3. indexOf() --> Used to find index of value.
		int index1 = str1.indexOf("KUMAR");
		System.out.println("first index: " + index1);

		// 4.lastIndexOf()--> Used to find last index of the element.
		int lastIndexOf = str1.lastIndexOf("A");
		System.out.println("last index: " + lastIndexOf);

		// 5. charAt() --> Used to find character at index.
		char charAt = str1.charAt(5);
		System.out.println(charAt);

		// 6. trim() --> Used to remove whitespace from begging and end.
		System.out.println(str1.trim());

		// 7. isEmpty() --> Used to checks whether a String is empty or not
		System.out.println("isEmpty check: " + str1.isEmpty());
		// 8. equals() --> Used to check if two object content is same or not if same
		// then return true or if not same then return false.
		System.out.println("cheching content:" + str1.equals(str2));

		// 9. equalsToIgnoreCase() --> Used to check content of two object by ignoring
		// case if content is same then return true if not same then reurn false..
		System.out.println(str1.equalsIgnoreCase(str2));

		// 10. startWith() --> Used to check string is start with given value or not.
		System.out.println("startWith check: " + str1.startsWith("A"));

		// 11. endsWith() --> Used to check string is ends with given string or not.
		System.out.println("endsWith check:" + str1.endsWith("H"));

		// 12. contains() --> Used to check value present in string or not.
		System.out.println(str1.contains("ram"));

		// 13. replace(old,new) --> Used to replace old value to new value.
		System.out.println("Replacing old value with new value: " + str1.replace("AMARJEET", "Sanjeet"));

		// 13. replace(old,new) --> Used to replace old value to new value.
		System.out.println("Replacing old value with new value: " + str.replace("Amarjeet", "Sanjeet"));

		// 14. replaceFirst(old,new) --> Used to replace first value
		System.out.println(str2.replaceFirst("amarjeet", "Rajnish"));

		// 15. replaceAll(old,new) --> Used to replace all value
		System.out.println(str1.replaceAll("AMARJEET KUMAR SINGH", "Rajnish Kumar Singh"));

		// 16. toLowerCase() --> Used to convert upper case to lower case.
		System.out.println(str1.toLowerCase());

		// 17. toUpperCase() --> Used to convert lower into upper case.
		System.out.println(str1.toUpperCase());

		// 18. join() --> Used to join two element with given delimeters.
		System.out.println(String.join("__", str1, str2));

		// 19. subSequence() --> Used to find the element between given index
		System.out.println(str1.subSequence(3, 6));

		// 20 substring() --> Used to find the element betwen given index.
		System.out.println(str1.substring(3, 6));

		// Note: substring() and subSequence() is working but syntax wise different.

//		String str1 = new String("John"); //2
//		String str2 = new String("Doe");//2
//		
//		String str3="John";//1
//		String str5="John";//0
//		String str4="Doe";//0
//		
//		
//		System.out.println(str1.equals(str2));//false
//		
//		System.out.println(str1==str2);//false
//		
//		System.out.println(str3.equals(str4));//false
//		System.out.println(str3==str4);//false
//		
//		System.out.println(str3==str5);//true
//		System.out.println(str3.equals(str5));//true
//		

	}

}
