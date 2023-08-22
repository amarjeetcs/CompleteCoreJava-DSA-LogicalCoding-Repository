package com.java.logical.coding.Miscellaneous;

/*import java.util.Scanner;
public class SumOfDigit 
{
	
	static void sum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("sum of number"+sum);
	}
	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	sum(num);
	sc.close();
	
	}


}
*/

class SumOfDigit
{
	public static void main(String[] args)
	{
		int x=112233;
		
		int sum=0;
		while(x>0)
		{
			sum=sum+x%10;
			x=x/10;
		}
		System.out.println(sum);
	}
}