package com.programs;

public class FindMinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {3,5,2,5,23,56};
     System.out.println(min(arr));
	}
	
	//return the minimum value in the  array
	static int min(int[] arr) {
		if(arr.length==0) {
			return -1;
		}
		// also write arr[0] in the place of Integer.MAX_VALUE and starting the i=1
	    int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
