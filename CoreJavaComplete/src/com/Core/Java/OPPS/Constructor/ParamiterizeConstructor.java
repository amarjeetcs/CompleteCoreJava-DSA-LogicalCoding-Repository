package com.Core.Java.OPPS.Constructor;

public class ParamiterizeConstructor {
	int i;
	String str;
	
	public ParamiterizeConstructor(int i, String str)
	{
		this.i=i;
		this.str=str;
	}
	public void displayData()
	{
		System.out.println(i+" "+str);
	}
	public static void main(String[] args) {
		ParamiterizeConstructor pc=new ParamiterizeConstructor(171015, "Amarjeet");
		pc.displayData();
	}

}
//in parameterize constructor we are passing parameter to the construtor
