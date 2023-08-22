package com.java.logical.coding.String;
public class RemoveVowel {

	public static void main(String[] args) {
		String str="amarjeet";
		String remove="";
		
	    remove=str.replaceAll("[aeiou]", "");

		System.out.println(remove);

	}

	
}
