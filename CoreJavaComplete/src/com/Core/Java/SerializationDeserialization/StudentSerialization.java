package com.Core.Java.SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentSerialization implements Serializable{
	
	transient private String name;
	private String email;
	private int age;
	private String address;

	public StudentSerialization(String name, String email, int age, String address) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	
	public StudentSerialization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void readStudent()
	{
		System.out.println("My Name is "+name);
	}

}

class Serial {
	public static void main(String[] args) {
		StudentSerialization student = new StudentSerialization("Amarjeet", "amarjeetcs79@gmail.com", 23, "Kundahalli Gate Bangalore");

		try {
			FileOutputStream fos = new FileOutputStream("amarjeet.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			fos.close();
			oos.close();
			System.out.println("Data Serilized successfully");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
