package com.programs;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] arr= {
    		      {1,35,45,62,5},
    		       {67,12,},
    		       {56,37,1,6,3},
    		       {46,28,8,2}
          };
     int target=6;
     int [] ans= search(arr,target);//format of return value {row,col}
     System.out.println(Arrays.toString(ans));
     
	}
	
	static int[] search(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[]{row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}

}
