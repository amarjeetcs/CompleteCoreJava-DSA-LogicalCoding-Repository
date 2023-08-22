package com.java.logical.coding.String;
public class ReverseString {

	public static void main(String[] args) {
		String str="AMARJEET";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		//System.out.println(str.length());
		System.out.println(rev);

	}

}
