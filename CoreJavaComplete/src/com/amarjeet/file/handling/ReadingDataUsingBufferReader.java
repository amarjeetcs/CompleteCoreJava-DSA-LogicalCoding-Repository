package com.amarjeet.file.handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingDataUsingBufferReader {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C:\\Users\\Pc\\Desktop\\amarjeetJavaIO-rafia\\amarjeet.txt");
        BufferedReader br = new BufferedReader(fr);

        // Reading line by line
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line); // Prints each line
        }
        //System.out.println("Finished reading with BufferedReader.");
        br.close();
        fr.close();

		
	}

}
