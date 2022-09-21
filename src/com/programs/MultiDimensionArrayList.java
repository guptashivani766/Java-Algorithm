package com.programs;

import java.util.ArrayList;

public class MultiDimensionArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		mainList.add(list);
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(4);
		list1.add(5);
		list1.add(6);
		mainList.add(list1);
		for(int i=0;i<mainList.size();i++) {
			ArrayList<Integer> currList=mainList.get(i);
			for(int j=0;j<currList.size();j++) {
				System.out.print(currList.get(j));
			}
		}

	}

}
