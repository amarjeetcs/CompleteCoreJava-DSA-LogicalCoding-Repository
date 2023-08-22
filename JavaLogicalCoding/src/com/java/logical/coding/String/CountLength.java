package com.java.logical.coding.String;
//(1)way to print
/*public class CountLength {
	public static void main(String[] args) {
		String str="amarjeet kumar singh";
		System.out.println(str.length());
	}
}
*/
/*
public class CountLength
{
	public static void main(String[] args) {
		String str="amarjeet kumar singh";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			count++;
		}
		System.out.println(count);
	}
}
*/

class CountLength{
	/*
	 * public static void main(String[] args) { String str="amarjeet kumar singh";//
	 * amarjeet kumar singh int count=0; for(int i=0;i<str.length();i++) { count++;
	 * } System.out.println(count); }
	 */
	
	
		  public static void main(String[] args) {
		    String str = "Hello";
		    str.concat(" World");
		    System.out.println(str);
		  }
		
}


