package com.amarjeet.file.handling;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Pc\\Desktop\\Rafia1");
        if (f.mkdirs()) {
            System.out.println("Directory created successfully: " + f);
        } else {
            System.out.println("Failed to create directory.");
        }
    }
}
