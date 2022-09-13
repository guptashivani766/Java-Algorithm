package com.programs;

public class LinearSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {24,23,5,6,3};
		int target=25;
		int indval=LinearSearch(arr,target);
		System.out.println(indval);
	}
	static int LinearSearch(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int num:arr) {
			if(num==target) {
				return num;
			}
		}
		return -1;
	}

}
