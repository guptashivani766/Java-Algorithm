package com.programs;
import java.util.*;

public class TreeMapDS {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("India", 100);
		tm.put("US", 50);
	    tm.put("China", 150);
	    
	    System.out.println(tm);
	    
	    System.out.println(tm.get("India"));
	    System.out.println(tm.remove("India"));
	    System.out.println(tm.get("India"));
	    System.out.println(tm);

	}

}
