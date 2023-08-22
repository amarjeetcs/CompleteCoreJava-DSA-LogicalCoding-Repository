package com.Core.Java.Collectoin.Set;
import java.util.*;
public class HashSet1 {
	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();

        // Adding elements to the HashSet
//        set.add("Apple");
//        set.add("Banana");
//        set.add("Orange");
//        set.add("Mango");
//        set.add("Apple"); 
        //Collections.sort(set, Collections.reverseOrder());
        // Printing the HashSet
//        System.out.println("HashSet: " + set);
//        set.add("amarjeet");
//        System.out.println(set);
		//insertion order not preserved and duplicates are not allowed
        //null insertion allowed
        //default capacity is 16 and load factor is 0.75%
        //it does not have any own method uses collection methods
        //best approach for searching operation
        //it is store data in hashing technique
        //hashset is not synchronized.
//        HashSet<Integer> hs=new HashSet<Integer>();
//        hs.add(1);
//        hs.add(2);
//        hs.add(3);
//        hs.add(4);
//        hs.add(3);
//        hs.add(3);
//        hs.add(null);
//        hs.add(null);
//      
//        HashSet<Integer> h=new HashSet<>();
//        h.add(23);
//        h.add(43);
//        h.add(10);
//        h.add(12);
//        h.add(13);
//        System.out.println("Integer HashSet: "+h);
//        for(Object o:h)
//        {
//        	System.out.println("Display: "+o);
//        }
//        
//        Iterator it=h.iterator();
//        while(it.hasNext())
//        {
//        	System.out.println("Display data: "+it.next());
//        }
//        
        
        
        
       // System.out.println("Hashset:"+hs);
//        Iterator it=hs.iterator();
//        while(it.hasNext())
//        {
//        	System.out.println(it.next());
//        }
//        
//        for(Object i:hs)
//        {
//        	System.out.println(i);
//        }
       
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		System.out.println("Hs1: "+hs1);
		
		HashSet<Integer> hs2=new HashSet<>();
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		System.out.println("Hs2: "+hs2);
		

		//difference
		hs1.removeAll(hs2);
		System.out.println("Difference of the set: "+hs1);
		
		//Union
		hs1.addAll(hs2);
		System.out.println("Union of the set: "+hs1);//unique element which matching in both the set
		
		//Intersection
		hs1.retainAll(hs2);
		System.out.println("Intersection of the set: "+hs1);//common element from both the set
		
		HashSet h=new HashSet<>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(3);
		h.add(null);
		h.add(null);
		h.add(0);
		h.add(8);
		h.add(9);
		h.add(12);
		h.add(13);
		h.add("amarjeet");
		
		System.out.println(h.size());
		System.out.println(h);
		
		
		
		
		
	}

}
