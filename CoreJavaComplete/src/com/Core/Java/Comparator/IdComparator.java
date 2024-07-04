package com.Core.Java.Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp>{

	public int compare(Emp o1, Emp o2) {
		if(o1.getId()==o2.getId())
			return 0;
		else if(o1.getId()>o2.getId())
			return 1;
		else if(o1.getId()<o2.getId())
			return -1;
		return 0;
		
	}
	

}
