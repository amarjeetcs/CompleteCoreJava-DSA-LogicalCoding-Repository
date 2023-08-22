package com.java.logical.coding.Miscellaneous;

public class SwapTwoNumber {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	/*System.out.println("before swapping"+a+" "+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping:"+a+" "+b);
	*/
	
	//with using temp variable
	
	System.out.println("before swapping"+a+" "+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping:"+a+" "+b);
	
	
	}

}
