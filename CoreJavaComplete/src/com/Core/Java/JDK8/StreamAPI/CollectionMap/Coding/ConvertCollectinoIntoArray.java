package com.Core.Java.JDK8.StreamAPI.CollectionMap.Coding;
import java.util.*;
public class ConvertCollectinoIntoArray {
public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	
	Integer[] arr=(Integer[]) al.toArray(new Integer[0]);
	for(Object o:arr)
	{
		System.out.println(o.getClass());
	}

}
}
