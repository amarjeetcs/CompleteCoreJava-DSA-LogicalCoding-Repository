package com.Core.Java.JDK8.StreamAPI.Methods;
import java.util.*;
import java.util.stream.Collectors;
public class FlatMapUses2 {
	
	int id;
	String name;
	String emil;
	String city;
	String college;
	
	public FlatMapUses2(int id, String name, String email, String city, String college) {
		this.id=id;
		this.name=name;
		this.emil=email;
		this.city=city;
		this.college=college;
	}	
	
	public static void main(String[] args) {
		List<FlatMapUses2> student1=new ArrayList<FlatMapUses2>();
		student1.add(new FlatMapUses2(101,"Amarjeet","amarjeetcs79@gmail.com","Bangalore","Ies college Bhopal"));
		student1.add(new FlatMapUses2(102,"Sanjeet","sanjeet79@gmail.com","Bihar","Ies college Bhopal"));
		student1.add(new FlatMapUses2(103,"Ranjit","ranjit79@gmail.com","Bihar","Ies college Bhopal"));
		student1.add(new FlatMapUses2(104,"Deepesh","deepesh79@gmail.com","Punjab","Ies college Bhopal"));
		student1.add(new FlatMapUses2(105,"Hira","hira79@gmail.com","Pune","Ies college Bhopal"));
		
		
		List<FlatMapUses2> student2=new ArrayList<FlatMapUses2>();
		student1.add(new FlatMapUses2(106,"Neha","neha79@gmail.com","Ranci","Ies college Bhopal"));
		student1.add(new FlatMapUses2(107,"Suman","suman79@gmail.com","Bihar","Ies college Bhopal"));
		student1.add(new FlatMapUses2(108,"Deepa","deepa79@gmail.com","Haryana","Ies college Bhopal"));
		student1.add(new FlatMapUses2(109,"Kittu","kittu79@gmail.com","Andhrapredesh","Ies college Bhopal"));
		student1.add(new FlatMapUses2(110,"Ramya","ramya79@gmail.com","Bhopal","Ies college Bhopal"));
		
		List<FlatMapUses2> student3=new ArrayList<FlatMapUses2>();
		student1.add(new FlatMapUses2(111,"Shiva","shiva79@gmail.com","Bangalore","Ies college Bhopal"));
		student1.add(new FlatMapUses2(112,"Lalu","lalu79@gmail.com","Bihar","Ies college Bhopal"));
		student1.add(new FlatMapUses2(113,"Renu","renu79@gmail.com","Bihar","Ies college Bhopal"));
		student1.add(new FlatMapUses2(114,"Priya","priya79@gmail.com","Punjab","Ies college Bhopal"));
		student1.add(new FlatMapUses2(115,"Nikki","nikki79@gmail.com","Pune","Ies college Bhopal"));
		

		List<List<FlatMapUses2>> finalList=Arrays.asList(student1,student2,student3);
		List<Integer> ls1= finalList.stream().flatMap(e->e.stream().map(e1->e1.id)).collect(Collectors.toList());
		List<String> ls2= finalList.stream().flatMap(e->e.stream().map(e1->e1.name)).collect(Collectors.toList());
		System.out.println(ls1);
		System.out.println(ls2);
	}
}
