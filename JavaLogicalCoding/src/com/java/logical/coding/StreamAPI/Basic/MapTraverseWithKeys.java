package com.java.logical.coding.StreamAPI.Basic;
import java.util.*;
public class MapTraverseWithKeys {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "Amarjeet");
		m.put(2, "Rajnish");
		m.put(3, "Hira");
		
		m.keySet().stream().forEach(e->{
			System.out.println(e);
		});
	}

}
