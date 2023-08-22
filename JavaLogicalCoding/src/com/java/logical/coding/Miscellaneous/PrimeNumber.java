package com.java.logical.coding.Miscellaneous;

/*import java.util.Scanner;
class PrimeNumber
{
	static void isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)//i=1 and i=5
		{
			if(n%i==0)
			count=count+1;
		}
		if(count==2)
		{
			System.out.println("prime: "+n);
		}
		else
			
		{
			System.out.println("not prime: "+n);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the nunber");
		int n=sc.nextInt();
		isPrime(n);
		sc.close();
		
		
	}
}
*/
import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	
	int count=0;
	
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		count=count+1;
	}
	if(count==2)
		System.out.println("prime: "+n);
	else
		System.out.println("not prime: "+n);
}
}
