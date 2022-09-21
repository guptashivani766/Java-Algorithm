package com.programs;

import java.util.ArrayList;

public class SwappingArrayList1 {
	public static void swap(ArrayList<Integer> list) {
		int n=list.size()-1;
		for(int i=0;i<list.size()/2;i++) {
			int temp= list.get(i);
			list.set(i,list.get(n));
			list.set(n, temp);
			if(i==n)
			{
				return;
			}
			n--;
			
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		swap(list);
		System.out.println(list);
		
	}

}
