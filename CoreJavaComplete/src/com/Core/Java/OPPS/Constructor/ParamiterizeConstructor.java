package com.Core.Java.OPPS.Constructor;

public class ParamiterizeConstructor {
	int i;
	String str;
	String city;
	
	
	public ParamiterizeConstructor(int i1, String str1, String city)
	{
		this.i=i1;
		this.str=str1;
		this.city=city;
	}
	public void displayData()
	{
		System.out.println(i+" "+str+" "+city);
	}
	public static void main(String[] args) {
		ParamiterizeConstructor pc=new ParamiterizeConstructor(101, "Amarjeet","bpl");
		pc.displayData();
	}

}
//in parameterize constructor we are passing parameter to the construtor
