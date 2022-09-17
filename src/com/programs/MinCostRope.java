package com.programs;
import java.util.*;

public class MinCostRope {
	
	public static int minCost(int arr[],int n) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			pq.add(arr[i]);
		}
		int res=0;
		while(pq.size()>1) {
			int first=pq.poll();
			int second=pq.poll();
			res+=first+second;
			pq.add(first+second);
        }
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len[]= {4,3,2,6};
		int size=len.length;
		System.out.println("Total cost for connectiong"+"ropes is"+minCost(len,size));
	}

}
