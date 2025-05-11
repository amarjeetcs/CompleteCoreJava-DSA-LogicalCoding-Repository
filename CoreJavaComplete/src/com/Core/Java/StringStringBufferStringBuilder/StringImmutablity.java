package com.Core.Java.StringStringBufferStringBuilder;

class StringImmutablity {
	public static void main(String[] args) {

		String str1 = new String("rama");
		System.out.println("Original String: " + str1);
		// System.out.println("Original Hash Code: " + System.identityHashCode(str1));
		//System.out.println(str1);
		System.out.println(str1.hashCode());

		str1=str1.concat("kumar");

		System.out.println("New String: " + str1);
		System.out.println(str1);//
		System.out.println(str1.hashCode());
		// System.out.println("New Hash Code: " + System.identityHashCode(str1));
	}
}
//In Java, String.hashCode() and System.identityHashCode() serve different purposes:

//String.hashCode(): This method calculates and returns the hash code of the String object based on its content. It’s used for hashing purposes in hash-based collections like HashMap, HashSet, etc. The hash code of a String is computed based on the characters in the String.

//System.identityHashCode(Object obj): This method returns the hash code of the object as provided by Object.hashCode(), which is typically based on the object's memory address. It’s useful for distinguishing between different objects regardless of their content.

//In your case, using str1.hashCode() will give you the hash code of the String content, which will change if the content of the String changes. When you perform concatenation with str1.concat("singh"), it creates a new String object, so the hash code will change according to the new content.