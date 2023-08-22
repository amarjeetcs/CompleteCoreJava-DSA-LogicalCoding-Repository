package com.Core.Java.OPPS.Encapsulation;
class Encapsulation
{
	private int id;
	private String name;
	private String city;
	
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCity()
	{
		return city;
	}
	
	
	public void setId(int newId)
	{
		id=newId;
	}
	
	public void setName(String newName)
	{
		name=newName;
	}
	
	public void setCity(String newCity)
	{
		city=newCity;
	}
	
	public static void main(String[] args)
	{
		Encapsulation m=new Encapsulation(); //object creation of encapsulation class
		m.setId(1); //setting values in setter method
		m.setName("amarjeet"); //setting values in setter method
		m.setCity("Bhopal"); //setting values in setter method
		
		System.out.println(m.getId());   //getting values from getter method
		System.out.println(m.getName()); //getting values from getter method
		System.out.println(m.getCity()); //getting values from getter method
	}
	
}