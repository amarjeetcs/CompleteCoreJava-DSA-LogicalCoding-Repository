package com.Core.Java.Collectoin.List;
import java.util.*;
public class ArrayListPractica {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("apple");
		al.add("coco");
		al.add("banana");
		al.add("amarjeet");
		al.add("sanjeet");
		
		
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(2);
		al1.add(4);
		al1.add(null);
		
		
		ArrayList addAllDemo=new ArrayList<>();
		addAllDemo.addAll(al);
		addAllDemo.addAll(al1);
		
		System.out.println(addAllDemo);
		
		System.out.println("remove all: ");
		addAllDemo.removeAll(al1);
		System.out.println(addAllDemo);
		Collections.sort(al);
		System.out.println("sorting collection: "+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("sorting in reversed order: "+al);
		Collections.shuffle(al);
		System.out.println("suffel element:"+al);//random order
	}

}
