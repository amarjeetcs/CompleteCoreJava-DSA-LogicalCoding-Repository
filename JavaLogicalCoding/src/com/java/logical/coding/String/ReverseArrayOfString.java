package com.java.logical.coding.String;
public class ReverseArrayOfString{

    public static void main(String[] args) {
        String str="amarjeet kumar singh";
        String str1[]=str.split("\\s");
        for(int i=str1.length-1;i>=0;i--)
        {
            System.out.println(str1[i]);
        }

    }

}