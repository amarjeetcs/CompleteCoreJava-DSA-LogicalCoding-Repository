package com.amarjeet.file.handling;
import java.io.File;
import java.util.Scanner;

public class UsingScannerRead {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Pc\\Desktop\\IO\\amarjeet.txt");
        Scanner scanner = new Scanner(file);

        // Reading line by line
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println("Finished reading with Scanner.");
        scanner.close();
    }
}
