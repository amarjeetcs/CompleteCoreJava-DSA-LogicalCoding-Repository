package com.Core.Java.ExceptionHandling.checkedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) throws Exception{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/invalid_db", "user", "password"); // Throws SQLException
    }
}