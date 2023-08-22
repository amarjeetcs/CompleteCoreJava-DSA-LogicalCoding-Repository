package com.Core.Java.Variables;

public class InstanceVariable {
	//instance variable-> creating inside the class and outside the main method
	static String str="Amarjeet";
	int x=10;
	Integer i=23;
	Float f1=10f;
	float f2=11f;
	public static void main(String[] args) {
		
		InstanceVariable i=new InstanceVariable();
		System.out.println(i.str);
		System.out.println(i.x);
		System.out.println(i.i);
		System.out.println(i.f1);
		System.out.println(i.f2);
		
		//Float vs float--> Float --wrapper 
		
		
	}

}
