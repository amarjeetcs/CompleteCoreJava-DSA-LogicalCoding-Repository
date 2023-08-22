package com.java.logical.coding.Miscellaneous;

class Serosoft
{
	public static void main(String[] args) {
		String str="serosoft";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
		