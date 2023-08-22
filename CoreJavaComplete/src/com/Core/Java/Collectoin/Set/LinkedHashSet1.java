package com.Core.Java.Collectoin.Set;
import java.util.*;
public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet ls=new LinkedHashSet<>();
		ls.add(1);
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(0);
		ls.add(null);		
		ls.add("amarjeet");
		System.out.println(ls);
		
		
		//both hashset and linkedhashset is same but  only difference in linkedhashset insertion order is preserved.
	}

}
