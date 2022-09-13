package com.programs;

public class FindMaxNo2DArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,3,4,5},
				{6,7,8},
				{10,33,55}
				};
				System.out.println(max(arr));
	}
	static int max(int[][] arr) {
		int max=Integer.MIN_VALUE;
		for(int[] ints:arr) {
			for(int element :ints) {
				if(element>max) {
					max=element;
				}
			}
		}
		return max;
	}

}
