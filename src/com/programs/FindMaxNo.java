package com.programs;

public class FindMaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr= {3,5,2,5,23,56};
		     System.out.println(max(arr));
			}
			
			//reuturn the minimum value in the  array
			static int max(int[] arr) {
				if(arr.length==0) {
					return -1;
				}
				// also write arr[0] in the place of Integer.MIN_VALUE and starting the i=1
			    int max=Integer.MIN_VALUE;
				for(int i=0;i<arr.length;i++) {
					if(arr[i]>max) {
						max=arr[i];
					}
				}
				return max;
	}

}
