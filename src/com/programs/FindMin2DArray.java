package com.programs;

public class FindMin2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,56,23,22},
				{45,1,2},
				{78,45,33}
		      };
		
		System.out.println(minval(arr));
	 }
	static int minval(int[][] arr) {
		int min=Integer.MAX_VALUE;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]<min)
				{
					min=arr[row][col];
				}
			}
			
		}
		return min;
	}

}
