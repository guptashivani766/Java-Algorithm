package com.programs;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(7);
		list.add(2);
		list.add(6);
		list.add(4);
		list.add(5);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		

	}

}
