package com.Core.Java.StaticKeyword;

public class StaticBlock {
	
	{
		System.out.println("this is simple block");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
		StaticBlock sb=new StaticBlock();   //instance is created to invoke block
	}
	
	static {
		System.out.println("This is static block");
	}
	
	
	
}
