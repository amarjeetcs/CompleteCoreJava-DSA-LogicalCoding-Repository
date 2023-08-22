package com.java.logical.coding.String;
/*
public class CountCharacterOccurence {

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
*/

class CountCharacterOccurence{
	public static void main(String[] args) {
		String str="serosoft";
		int count1=0;
		int count2=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='s')
			{
				count1++;
			}
			if(str.charAt(i)=='o')
			{
				count2++;
			}
		}
		System.out.println("s="+count1);
		System.out.println("o="+count2);
	}
}