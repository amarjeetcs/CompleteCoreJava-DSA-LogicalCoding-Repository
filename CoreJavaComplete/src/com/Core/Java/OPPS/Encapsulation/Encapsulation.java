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
		
		Math.pow(0, 0);
		Math.sin(0);
		Integer i=new Integer(3);
		System.out.println(i.getClass());
		
		int x=10;
		Integer j=Integer.valueOf(x);
		Integer i1=x;
		System.out.println("this is one "+i1.getClass());
		
		System.out.println(m.getId());   //getting values from getter method
		System.out.println(m.getName()); //getting values from getter method
		System.out.println(m.getCity()); //getting values from getter method
	}
	
}

