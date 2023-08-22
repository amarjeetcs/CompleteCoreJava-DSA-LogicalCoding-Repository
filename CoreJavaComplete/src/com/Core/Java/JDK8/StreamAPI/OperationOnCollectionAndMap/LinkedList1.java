package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;
import java.util.*;
public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList<>();
		ll.add(1);
		ll.add(1);
		ll.add("Neha");
		ll.add(1.5);
		ll.add(true);
		ll.add(null);
		System.out.println("using for basic loop:");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("------------------------");
		System.out.println("using for loop inhance:");
		for(Object obj:ll)
		{
			System.out.println(obj);
		}
		System.out.println("using forEach loop:");
		ll.forEach(e->System.out.println(e));
		System.out.println("using iterator:");
		Iterator<Object> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("using listIterator:");
		ListIterator<Object> listItr=ll.listIterator();
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
		System.out.println("using stream api:");
		ll.stream().forEach(e->System.out.println(e));
		System.out.println(ll);
		
		//add(),add(index,value),set(),get(),remove(),
		ll.addFirst("amarjeet");
		System.out.println(ll);
		ll.addLast("hira");
		System.out.println(ll);
		ll.add(1, "ramesh");
		System.out.println(ll);
		ll.set(3, "radhe");
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.remove(3));
		System.out.println(ll.peek());
		ll.push("dr");
		System.out.println(ll);
		//LinkedList uses doubly linkedlist data structe to store data
		//LinkedList implements list and dequeue interface so we can use method of both interface.
		//LinkedList insertion order is preserved and duplicates are allowed and null insertion is also possible.
		//it is better option when our operation is delete/update the list
	}

}
