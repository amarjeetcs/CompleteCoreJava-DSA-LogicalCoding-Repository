package com.java.logical.coding.String;
/*
public class IncrementCharByone {

	public static void main(String[] args) {
		String str="amarjeet";
		String incre = "";
		for(int i=0;i<str.length();i++)
		{
			incre=incre+(char)(str.charAt(i)+1);
		}
		System.out.println(incre);

	}
}
*/

class IncrementCharByone {
	public static void main(String[] args) {
		String str="amarjeet";
		String inc="";
		for(int i=0;i<str.length();i++)
		{
			inc=inc+(char)(str.charAt(i)+1);
		}
		System.out.println(inc);
	}
}