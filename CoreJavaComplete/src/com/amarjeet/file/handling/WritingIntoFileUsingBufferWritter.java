package com.amarjeet.file.handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingIntoFileUsingBufferWritter {
	public static void main(String[] args) throws Exception {
		BufferedWriter boyFriend = new BufferedWriter(new FileWriter("C:\\Users\\Pc\\Desktop\\amarjeetJavaIO-rafia\\amarjeet.txt"));
		String str="Hello Java Learners";
		boyFriend.write(str);
		boyFriend.newLine();
		boyFriend.write("this is new line");
		boyFriend.close();
		System.out.println("data written successfully");
		
		
	}
}
