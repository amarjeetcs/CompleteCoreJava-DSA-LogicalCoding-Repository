package com.java.logical.coding.String;
public class CountCharacterOccurence{
	public static void main(String[] args) {
		String str="serosoft";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='s')
			{
				 count++;
			}
		}
		System.out.println(count);
	}
}