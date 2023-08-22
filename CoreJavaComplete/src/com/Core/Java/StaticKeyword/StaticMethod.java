package com.Core.Java.StaticKeyword;

public class StaticMethod {
	
	int id=101;
	String name="Sanjeet";
	String city="Bangalore";
	
	
	
	
	void changeCity() {
		city="Pune";
		System.out.println("city name changed using static method: "+city);
	}
	void display() {
		System.out.println(id+" "+name+" "+city);
	}
	public static void main(String[] args) {
		StaticMethod s=new StaticMethod();
		
		s.display();
		
		s.changeCity();
	}

}
