package com.Core.Java.Collectoin.MapDemo1;
import com.Core.Java.Collectoin.List.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ExtractMapKey {
	public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<>();
	hm.put(104, "sunny");
	hm.put(103, "ranjeet");
	hm.put(101, "deepak");
	hm.put(102, "lalu");
	hm.put(100, "vimal");
	
	System.out.println(hm);
	
	for (Object obj : hm.keySet()) {
		System.out.println(obj);
	}
	
	for (Object obj1 : hm.values()) {
		System.out.println(obj1);
	}
	
    for(Entry<Integer, String> entry:hm.entrySet())
    {
    	System.out.println(entry.getKey());
    }
	
    for(Entry<Integer,String> en:hm.entrySet())
    {
    	System.out.println(en.getValue());
    }
	
	}
}
