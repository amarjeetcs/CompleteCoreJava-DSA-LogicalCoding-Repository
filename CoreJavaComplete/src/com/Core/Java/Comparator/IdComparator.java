package com.Core.Java.Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp>{

	public int compare(Emp o1, Emp o2) {
		return o1.getId()-o2.getId();
	}
	

}
