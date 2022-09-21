package com.programs;

public class SumOfSubArray {
	public static int SumOfSubArray(int [] numbers) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					
					sum+=numbers[k];
				}
				 max=Math.max(max, sum);
				
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		int numbers[]= {4,6,8,10};
		System.out.println(SumOfSubArray(numbers));

	}

}
