package com.programs;

public class TotalSubarray {
	public static void printSubArray(int []numbers) {
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.println(numbers[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int numbers[]= {4,6,8,10};
		printSubArray(numbers);
	}

}
