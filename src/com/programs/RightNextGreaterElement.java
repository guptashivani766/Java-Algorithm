package com.programs;

import java.util.Stack;

public class RightNextGreaterElement {

	public static void main(String[] args) {
		int arr[]= {6,8,0,1,3};
		Stack<Integer> s=new Stack<>();
		int nextGreater[]=new int[arr.length];
		
		//for loop
		for(int i=arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[s.peek()]< arr[i] ) {
				s.pop();
			}
	    // if-else
			if(s.isEmpty()) {
				nextGreater[i]=-1;
			}
			else {
				nextGreater[i]=arr[s.peek()];
			}
		//s.push
			s.push(i);
			
		}
		
		for(int i=0;i<nextGreater.length;i++) {
			System.out.print(nextGreater[i]);
		}
		

	}

}
