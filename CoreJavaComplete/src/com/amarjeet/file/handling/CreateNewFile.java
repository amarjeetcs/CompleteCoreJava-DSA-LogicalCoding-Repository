package com.amarjeet.file.handling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Pc\\Desktop\\abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println("File is created:" + f);
	}

}
