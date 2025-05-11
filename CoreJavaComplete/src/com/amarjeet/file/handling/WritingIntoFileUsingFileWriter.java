package com.amarjeet.file.handling;

import java.io.FileWriter;

public class WritingIntoFileUsingFileWriter {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("C:\\Users\\Pc\\Desktop\\amarjeetJavaIO-rafia\\amarjeet.txt");
		fw.write("Hello Dear Java Learners welcome to world of Java Programming");
		fw.close();
		System.out.println("data written successfully" + fw);

	}

}
