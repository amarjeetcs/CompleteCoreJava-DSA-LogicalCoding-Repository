package com.amarjeet.file.handling;

import java.io.FileReader;

public class ReadingDataUsingFileReader {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\Pc\\Desktop\\amarjeetJavaIO-rafia\\amarjeet.txt");

        // Reading character by character
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch); // Prints each character
        }
        //System.out.println("\nFinished reading with FileReader.");
        fr.close();
    }
}
