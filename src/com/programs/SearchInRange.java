// arr{1,34,-5,46,49}
//send for -5 in range of index [1,3]
package com.programs;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,34,-5,46,49};
		int target=-6;
		System.out.println(searchInRange(arr,target,1,3));
	}
	static int searchInRange(int[] arr, int target,int start,int end) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=start;index<end;index++) {
			if(target==arr[index]) {
				return index;
			}
		}
		return -1;
	}

}
