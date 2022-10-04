package com.programs;
import java.util.*;

public class HashMapDS {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India", 100);
		hm.put("US", 50);
	    hm.put("China", 150);
	    
	    System.out.println(hm);
	    
	    System.out.println(hm.get("India"));
	    System.out.println(hm.remove("India"));
	    System.out.println(hm.get("India"));
	    System.out.println(hm);

	}

}
