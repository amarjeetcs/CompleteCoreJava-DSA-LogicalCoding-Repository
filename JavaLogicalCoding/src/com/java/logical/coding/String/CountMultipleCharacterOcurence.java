package com.java.logical.coding.String;

import java.util.HashMap;
import java.util.Map;

public class CountMultipleCharacterOcurence {
    public static void main(String[] args) {
        String str = "amarjeet kumar";
        HashMap <Character, Integer> charCount = new HashMap<>();  
        for (int i = str.length() - 1; i >= 0; i--)   
        {  
        if(charCount.containsKey(str.charAt(i)))   
        {  
        int count = charCount.get(str.charAt(i));  
        charCount.put(str.charAt(i), ++count);  
        }   
        else   
        {  
        charCount.put(str.charAt(i),0);  
        }  
        }  
        System.out.println(charCount);  
    }
}
