package com.programs;

public class FindMaxNO2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,3,4,5},
		{6,7,8},
		{10,33,55}
		};
		System.out.println(max(arr));
		
	}
	static int max(int[][] arr) {
		int maxi=Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>maxi) {
					maxi=arr[row][col];
				}
			}
			
		}
		return maxi;
	}

}
