package com.Core.Java.StaticKeyword;

public class Statickeyword {
	int id;
	String name;
	String city;
	static String company="Edifecs";
	
	public Statickeyword(int id, String name, String city) {
		this.id=id;
		this.name=name;
		this.city=city;
		
	}
	
	void displayData()
	{
		System.out.println(id+" "+name+" "+city+" "+company);
	}
	
	public static void main(String[] args) {
	Statickeyword s1=new Statickeyword(101,"Amarjeet", "Bihar");
	Statickeyword s2=new Statickeyword(102,"Amol", "Pune");
	Statickeyword s3=new Statickeyword(103,"Neha", "Ranci");
	Statickeyword s4=new Statickeyword(104,"Anmol", "Punjab");
	
	s1.displayData();
	s2.displayData();
	s3.displayData();
	s4.displayData();
	}
}
