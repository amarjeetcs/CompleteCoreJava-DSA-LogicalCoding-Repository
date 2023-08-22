package com.Core.Java.ThisKeyword;

public class ThisKeywordDemo {
	String str;
	
	public void insrtData(String str)
	{
		this.str=str;
	}
	
	public void showData() {
		System.out.println(str);
	}
	
	public ThisKeywordDemo(int a) {
		System.out.println("no args constructor calling using this");
	}
	public ThisKeywordDemo() {
		this(10);
		System.out.println("this is constructor calling using this");
	}
	
	public void run1(ThisKeywordDemo td) {
		System.out.println("this is method calling using this");
	}
	
	public void run2() {
		run1(this);
		
	}
	public static void main(String[] args) {
		ThisKeywordDemo t=new ThisKeywordDemo();
		t.insrtData("Amarjeet");
		t.showData();
		t.run2();
	}

}
