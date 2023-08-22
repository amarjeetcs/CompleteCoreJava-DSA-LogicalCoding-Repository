package com.Core.Java.SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class StudentDeserialization {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("amarjeet.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			StudentSerialization student=(StudentSerialization) ois.readObject();
			student.readStudent();
			System.out.println(student.getName());
			System.out.println(student.getEmail());
			System.out.println(student.getAge());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
