package com.programs;
//leetcode/find number with even number of digit nums=[12,345,2,6,7896]
public class FindEvenDigitNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
		System.out.println(digits(-3456));
		
	}
	static int findNumbers(int[] nums) {
		int count=0;
		for(int num: nums) {
			if(even(num)) {
				count++;
			}
			
		}
		return count;
	}
	
	//function to check whether a number contains even number of digit
	private static boolean even(int num) {
		// TODO Auto-generated method stub
		int numOfDigit=digits(num);
		if(numOfDigit%2==0) {
			return true;
		}
		return false;
	}
	//function to find the number of digits the number contains
	static int digits(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
}
