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

class Hirarical {
	void show_h(int a, int b) {
		System.out.println("i am amarjeet...");
	}
}

class B extends Hirarical {
	void show_b(int a, int b) {
		System.out.println("i am empty...");
	}
}

class C extends Hirarical {
	void show_c(int a, int b) {
		System.out.println("i am hira singh...");
	}

	public static void main(String[] args) {

		B b = new B();
		b.show_b(1,3);
		b.show_h(1,5);
		
		C c=new C();
		c.show_c(2,5);
		c.show_h(3,5);
		
		Hirarical h=new Hirarical();
		h.show_h(3, 5);
		
		
		
		
	}
}
