package com.java.logical.coding.String;

public class FindFirstNonRepeatingChar {
	public static void main(String[] args) {
		String str="amarjeet";
		for(char c:str.toCharArray())
		{
			if(str.indexOf(c)==str.lastIndexOf(c))
			{
				System.out.println(c);
				break;
			}
		}
		
	}

}
