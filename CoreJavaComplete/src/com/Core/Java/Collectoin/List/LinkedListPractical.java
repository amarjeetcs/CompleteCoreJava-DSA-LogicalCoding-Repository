package com.Core.Java.Collectoin.List;
import java.util.*;
public class LinkedListPractical {
	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(5);
		l.add(3);
		l.add(3);
		l.add(null);
		l.add(null);
		l.add("amarjeet");
		System.out.println(l.contains("5 is present in list or not: "+5));
		System.out.println("before removing: "+l);
		l.remove(3);
		System.out.println("after removing: "+l);
		l.set(5, "Amarjeet");
		System.out.println("value is updated at 5th position: "+l);
		l.add(null);
		
		System.out.println(l);
		l.set(1, "manish");
		System.out.println(l);
		
		//linkedlist uses doublylinked list data structure and store data in node which consist previous->data->next
		//linkedlist store element in random memory location
		//linkedlist implements dqueue and list interface so we can use method of both interface
		//deletion and update in middle is better in linkedlist becaue it not take shift operaiton like arraylist
		
		
		
	}

}
