package com.java.logical.coding.Miscellaneous;

public class Recursion {

	public static void main(String[] args) {
		String str="mamm";
		
		if (isPalimdrome(str))
		{
            System.out.println(str + " is a palindrome");
		}
        else
        {
            System.out.println(str + " is not a palindrome");
        }
	}
	
	public static boolean isPalimdrome(String s)
	{
		if(s.length()==0 || s.length()==1)
			return true;
		
		if(s.charAt(0)==s.charAt(s.length()-1))
			return isPalimdrome(s.substring(1,s.length()-1));
		
		return false;
	}

}


