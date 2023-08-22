package com.java.logical.coding.Miscellaneous;

/*import java.util.Scanner;
public class CountNumberOfDigit
{
	static void countDigit(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;

		}
		System.out.println("Count Number of digit: "+count);
		

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		countDigit(num);
		sc.close();
	}

}
*/

import java.util.Scanner;
class CountNumber
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	{
		System.out.println("enter the number: ");
		int x=sc.nextInt();
		int count=0;
		while(x>0)
		{
			x=x/10;
			count++;
		}
		System.out.println(count);
	}

}
}