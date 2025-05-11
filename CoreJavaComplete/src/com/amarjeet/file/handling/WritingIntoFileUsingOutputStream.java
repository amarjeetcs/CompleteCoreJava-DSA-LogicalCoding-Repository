package com.amarjeet.file.handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WritingIntoFileUsingOutputStream {
	public static void main(String[] args) throws Exception{
        String data = "FileOutputStream writes bytes to the file.";

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Pc\\Desktop\\IO\\amarjeetjava"); {
            fos.write(data.getBytes()); // Convert string to bytes
            System.out.println("Data written to the file successfully.");
        
    }
}
}
