package com.programs;

public class MaxSumOfSubArray1 {
	public static int maxSumOfSubArray(int [] number) {
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<number.length;i++) {
			currSum+=number[i];
			if(currSum<0) {
				currSum=0;
			}
			maxSum=Math.max(currSum, maxSum);
		}
		return maxSum;

	}

	public static void main(String[] args) {
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(maxSumOfSubArray(arr));
	}

}
