package com.java.logical.coding.String;
//(1) way to print
/*
public class CountWord{
    public static void main (String[] args) {
        String str="amarjeet    kumar   singh";
        //String[] s=str.split("\\s+");
        System.out.println(str.split("\\s+").length);
        
    }
}
*/

//(2)way to print 
/*
public class CountWord
{
	public static void main(String[] args) {
		String str="Amarjeet    kumar     singh";
		System.out.println(count(str));
	}
	
	private static int count(String str)
	{
		int c=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && i<str.length()-1 && str.charAt(i+1)!=' ')
			{
				c++;
			}
		}
		return c;
	}
}


*/

class CountWord{
	public static void main(String[] args) {
		String str="amarjeet  kumar  singh";
		System.out.println(str.split("\\s+").length);
	}
}