package com.programs;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//int[] arr= {2,4,8,9,12,34};
			int[] arr= {34,24,5,6,7,3};
			int target=24;
			int ans=binarySearch(arr,target);
			System.out.println(ans);
		}
		
		static int binarySearch(int[] arr,int target) {
			int start=0;
			int end=arr.length-1;
			boolean isacs=arr[start]<arr[end];
			while(start<=end) {
				int mid=start+(end-start)/2;
		    if(target==arr[mid]) {
		    	
		    	return mid;
		    }
			
			if(isacs) {
			   if(target<arr[mid]) {
					end=mid-1;
				}
				
				else {
					start=mid+1;
				}
			}
			
			else {
				if(target>arr[mid]) {
						end=mid-1;
					}
					
					else {
						start=mid+1;
					}
				}
			}
					
				
			return -1;
	}

}
