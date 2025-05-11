package com.Core.Java.Collectoin.List;

import java.util.*;
import java.util.HashMap;

public class ArrayListPractica {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
//		HashMap hm=new HashMap();
//		hm.put(101, "sanjeet");
		al.add("apple");
		al.add("coco");
		al.add("banana");
		al.add("amarjeet");
		al.add("sanjeet");
		al.add(null);
//		
		int x=10;
		System.out.println("this is variable: "+x);
//		System.out.println("before sorting:"+al);
//		Collections.sort(al);
//		System.out.println("after soerting:" + al);
		System.out.println("-------------------------------");
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(2);
		al1.add(4);
		al1.add(null);

		ArrayList addAllDemo = new ArrayList<>();
		addAllDemo.addAll(al);
		addAllDemo.addAll(al1);

		System.out.println("All all Adding:" + addAllDemo);
		System.out.println("before removing: ");
		addAllDemo.removeAll(al1);
		System.out.println(addAllDemo);
//		System.out.println("before sorting" + al1);
//		Collections.sort(al1);
//		System.out.println("after soerting:" + al1);
//		System.out.println("-------------------------------");
//		System.out.println("contains:" + al1.contains(8));
//		System.out.println("size" + al1.size());
//		System.out.println("isEmpty" + al1.isEmpty());

//		int[] arr = new int[6];
//		arr[0] = 1;
//		arr[1] = 1;
//		arr[2] = 1;
//		arr[3] = 1;
//		arr[4] = 1;
//		arr[5] = 1;
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("array" + arr[i]);
//		}
//
//		ArrayList<Integer> al12 = new ArrayList<>(5);// 10
//
//		// Add elements to the ArrayList
//		al12.add(1);
//		al12.add(2);
//		al12.add(3);
//
//		// Ensure that the ArrayList can hold at least 12 elements
//		al12.ensureCapacity(10);
//
//		// Add more elements to the ArrayList (it won't resize immediately)
//		al12.add(4);
//		al12.add(5);
//		al12.add(5);
//		al12.add(5);
//		al12.add(5);
//		al12.add(4);
//		al12.add(5);
//		al12.add(5);
//		al12.add(5);
//		al12.add(5);
//		System.out.println(al12.size());

		// Print the ArrayList
		// System.out.println("ArrayList elements: " + al12);

		// System.out.println("remove all: ");
		// addAllDemo.removeAll(al1);
//		System.out.println(addAllDemo);
//		Collections.sort(al);
//		System.out.println("sorting collection: "+al);
//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println("sorting in reversed order: "+al);
//		Collections.shuffle(al);
//		System.out.println("suffel element:"+al);//random order
	}

}
