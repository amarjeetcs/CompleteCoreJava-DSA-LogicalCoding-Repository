package com.Core.Java.JDK8.StreamAPI.OperationOnCollectionAndMap;
import java.util.*;
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList<>();
		al1.add("Amarjeet");
		al1.add("Rajnish");
		al1.add("Rajnish");
		al1.add("Hira");
		al1.add("Nikki");
		al1.add(1);
		al1.add(1.5);
		al1.add(true);
		al1.add(null);
		al1.add(null);
		
		
		
		ArrayList al2=new ArrayList<>();
		al2.add("rakesh");
		al2.add("dipu");
		al2.add("ram");
		al2.add("shyam");
		al2.add("Nikki");
		al2.add(1);
		al2.add(1.5);
		al2.add(true);
		al2.add(null);
		al2.add(null);
		
		ArrayList al3=new ArrayList<>();
		al3.add("deelep");
		al3.add("Rajnish");
		al3.add("lalit");
		al3.add("Hira");
		al3.add("sunny");
		al3.add(1);
		al3.add(1.5);
		al3.add(true);
		al3.add(null);
		al3.add(null);
		
		
		ArrayList al4=new ArrayList<>();
		al4.add(1);
		al4.add(2);
		al4.add(3);
		al4.add(4);
		al4.add(5);
		al4.add(6);
		al4.add(1.5);
		al4.add(true);
		al4.add(null);
		al4.add(null);
		//arrayList allow duplicate elements
		//insertion order is preserved
		//null insertion is possible
		//uses danamic array data structure to store data
		//default intinital capacity is 10
		//it is increases its size by 50%
		//arraylist is better option when our operation is to retrive data from list
		//array list implement randomAccess interface
		
		
		
		System.out.println(al1);//hetrogenious data strored
		//we can iterate list using 1.basic for loop 2.inhance for loop 3.forEach loop 4.iterator 5.ListIterator
		System.out.println("------------------------------------");
		System.out.println("print using basic for loop: ");
		System.out.println("------------------------------------");
		
		for(int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
		System.out.println("------------------------------------");
		System.out.println("print using inhanced for loop: ");
		System.out.println("------------------------------------");
		
		for(Object obj:al1)
		{
			System.out.println(obj);
		}
		
		System.out.println("------------------------------------");
		System.out.println("print using iterator");
		System.out.println("------------------------------------");
		Iterator<Object> itr=al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------");
		System.out.println("print using ListIterator: ");
		System.out.println("------------------------------------");
		ListIterator<Object> listItr=al1.listIterator();
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
		System.out.println("------------------------------------");
		System.out.println("print using forEach loop: ");
		System.out.println("------------------------------------");
		al1.forEach(e->System.out.println(e));
		
		System.out.println("------------------------------------");
		al1.stream().forEach(e->System.out.println("using stream api: "+e));
		System.out.println("usecase of all the methods of list and collection:");
		System.out.println("------------------------------------");
		al1.add(2, "amarjeet singh");
		System.out.println("add value at particular index: "+al1);
		
		System.out.println("size of list: "+al1.size());  //add(value),add(index,value),size(),get(),
														//remove(index),set(index,value),contains(value),
														//indexOf(),addAll(),removeAll()
		System.out.println("getting value: "+al1.get(7));
		System.out.println(al1.remove(5));
		System.out.println(al1);
		System.out.println(al1.set(1, "Rajnish Singh"));
		System.out.println(al1);
		System.out.println(al1.contains("Amarjeet"));
		System.out.println(al1.lastIndexOf("Hira"));
		
		ArrayList addAllInSingle=new ArrayList<>();
		addAllInSingle.addAll(al1);
		addAllInSingle.addAll(al2);
		addAllInSingle.add(al3);
		System.out.println(addAllInSingle);
		
		addAllInSingle.addAll(1, al4);
		System.out.println(addAllInSingle);
		
		addAllInSingle.removeAll(al1);
		System.out.println(addAllInSingle);
		addAllInSingle.removeAll(al4);
		System.out.println(addAllInSingle);
		addAllInSingle.removeAll(al3);
		System.out.println(addAllInSingle);
		
	}

}
