package com.java.logical.coding.String;
public class RemoveNumericaCharacterSpace {

	public static void main(String[] args) {
		String str="amarjeet!@#$%^&*()_+?<>}{|";
		String s="";
		s=str.replaceAll("[!@#$%^&*()_+?<>}{|]", "");
		System.out.println(s);
	}

}
