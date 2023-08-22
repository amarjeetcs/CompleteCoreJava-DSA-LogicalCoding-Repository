package com.Core.Java.OPPS.Encapsulation;

public class DemoSetterGetter {
	private int price;
	private String name;
	private String city;
	private String college;

	public void setId(int price) {
		this.price = price;
	}

	public int getPrice() {
		if(price<=0)
		{
			System.out.println("price is below negative");
		}
		else {
			System.out.println("you are right");
		}
		return price;
	}
	
	public static void main(String[] args) {
		DemoSetterGetter d = new DemoSetterGetter();
		d.setId(-3000); //if we are passing negative then we can use if condition inside the getter method this is the main features in encapsulation
		//System.out.println(d.price);// without using getter
		System.out.println(d.getPrice()); // with using getter

	}
}

