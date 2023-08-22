package com.java.logical.coding.String;
/*
public class SumOfDigitInString {

	public static void main(String[] args) {
		String str="1amar5je1et";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count=Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(count);

	}

}

*/



public class  SumOfDigitInString 
{
	public static void main(String[] args)
	{
		String str = "12abc2yc68";
		String temp = "0";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				temp += ch;
			else 
			{
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		
		System.out.println(sum);
	}
}
