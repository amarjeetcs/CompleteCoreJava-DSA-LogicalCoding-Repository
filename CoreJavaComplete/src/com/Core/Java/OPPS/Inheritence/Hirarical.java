package com.Core.Java.OPPS.Inheritence;
/*

public class Hirarical {
	void eat()
	{	System.out.println("i am eating...in the morning....");
	}
}
class B extends Hirarical
{
	void run()
	{
		System.out.println("i am running in the morning...with dad...");
	}
}
class C extends Hirarical
{
	void bark()
	{
		System.out.println("i am barking...with cat...");
	}
}
class Amarjeet
{
	public static void main(String[] args) {
		C c=new C();
		c.eat();
		c.bark();
		
		B b=new B();
		b.eat();
		b.run(); 
	}
}


*/
/*
class Hirarical
{
	void show(String a,int b)
	{
		System.out.println("i am amarjeet...");
	}
	
	void show(int a,String b)
	{
		System.out.println("i am rajnish...");
	}
	
	void show()
	{
		System.out.println("i am empty...");
	}
	
	public static void main(String[] args) {
		Hirarical h=new Hirarical();
		h.show();
		h.show("amarjeet",10);
		h.show(10,"amarjeet");
	}
}

*/

class Hirarical
{
	void show(int a,int b)
	{
		System.out.println("i am amarjeet...");
	}
}
class B extends Hirarical
{
	void show(int a,int b)
	{
		System.out.println("i am empty...");
	}
}
class C extends B
{
	void show(int a,int b)
	{
		System.out.println("i am hira singh...");
	}
}
class Hira
{
	public static void main(String[] args) {
		//Hirarical h=new Hirarical();
		//h.show(10,20);
		
		B b=new B();
		b.show(10,20);
		b.show(10,20);
		
		C c=new C();
		c.show(10,20);
		//c.show();
	}
	
}