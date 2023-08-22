package com.java.logical.coding.Miscellaneous;

public class GraterBetweenThree {

	public static void main(String[] args) {
		int x=12;
		int y=43;
		int z=34;
		
		if(x>y && x>z)
		{
			System.out.println(x);
		}
		else if(y>x && y>z)
		{
			System.out.println(y);
		}
		else if(z>x && z>y)
		{
			System.out.println(z);
		}
		
	}

}
