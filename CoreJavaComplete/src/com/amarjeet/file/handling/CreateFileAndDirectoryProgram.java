package com.amarjeet.file.handling;

import java.io.File;

public class CreateFileAndDirectoryProgram {

	// mkdir(), createNewFile(),exists(),isFile(),
	// isDirectory(),list(),length(),delete()
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\Pc\\Desktop\\amarjeetJavaIO-rafia");
		f.mkdir();
		System.out.println(f.exists());
		System.out.println("directory created:" + f);
		File f1 = new File(f, "amarjeet.txt");
		f1.createNewFile();
		System.out.println("create file into directory:" + f1);

	}

}