// Search in rotated sorted array
package com.programs;

public class RotatedSortedArrayBS {

	public static void main(String[] args) {
	
		int[] arr= {4,5,6,7,0,1,2};
		System.out.println(findPivot(arr));
	}
	  static int Search(int [] nums,int target) {
		  int pivot=findPivot(nums);
		  
		  
		  //if you did not find the pivot ,it means the array is not rotated
		  if(pivot==-1) {
			  //just do normal binary search
			  return binarySearch(nums,target,0,nums.length-1);
		  }
		  
		  
		  // if pivot is found ,you have found 2 asc arrays
		  if(nums[pivot]==target) {
			  return pivot;
		  }
		  return -1;
  }
	  static int binarySearch(int[] arr,int target ,int start ,int end) {
			
			while(start<=end) {
				int mid=start+(end-start)/2;
				if(target<arr[mid]) {
					end=mid-1;
				}
				
				else if(target>arr[mid]) {
					start=mid+1;
				}
				else {
					return mid;
				}
			}
			return -1;
		}
	static int findPivot(int[] arr ) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			//4 cases over here
			if( mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid]<=arr[start]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
}


