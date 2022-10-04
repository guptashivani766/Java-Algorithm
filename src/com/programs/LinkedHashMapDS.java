package com.programs;
import java.util.*;

public class LinkedHashMapDS {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
		lhm.put("India", 100);
		lhm.put("US", 50);
	    lhm.put("China", 150);
	    
	    System.out.println(lhm);
	    
	    System.out.println(lhm.get("India"));
	    System.out.println(lhm.remove("India"));
	    System.out.println(lhm.get("India"));
	    System.out.println(lhm);

	}

}
