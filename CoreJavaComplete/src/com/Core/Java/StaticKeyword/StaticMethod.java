package com.Core.Java.StaticKeyword;

public class StaticMethod {

	int id;
	static String name = "Sanjeet";
	static String city = "Bangalore";

	static void changeValue() {
		name = "aviraj";
		city = "pune";
	}

	StaticMethod(int id) {
		this.id = id;
	}

	void disp() {
		System.out.println(id + ":" + name + ":" + city);
	}

	public static void main(String[] args) {
		StaticMethod s = new StaticMethod(101);
		s.disp();

	}

//	void changeCity() {
//		city = "Pune";
//		System.out.println("city name changed using static method: " + city);
//	}
//
//	void AfterChangedCity() {
//		System.out.println(id + " " + name + " " + city);
//	}
//
//	void display() {
//		System.out.println(id + " " + name + " " + city);
//	}
//
//	public static void main(String[] args) {
//		StaticMethod s = new StaticMethod();
//
//		s.display();
//
//		s.changeCity();
//		s.AfterChangedCity();
//	}

}
