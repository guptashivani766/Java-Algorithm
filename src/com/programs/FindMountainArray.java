package com.programs;

public class FindMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,3,1};
		System.out.println(search(arr,3));
	}
	static int search(int[]arr,int target) {
		int peak=peakIndexInMountainArray(arr);
		int firstTry=orderAgnosticBS(arr,target,0,peak);
		if(firstTry!=-1) {
			return firstTry;
	}
		return orderAgnosticBS(arr,target,peak+1,arr.length-1);
	}
	public static int peakIndexInMountainArray(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
		int mid=start+(end-start)/2;
		if(arr[mid]>arr[mid+1]) {
			//you are in descending part of array
			//this may be the answer but look at left
			//this is why end!=mid-1
			end=mid;
		}
		else {
			//you are in ascending part of array
			start=mid+1;//because we know that mid+1 element>mid element
		}
		}
		// In the end ,start==end and pointing to the largest number because of the two checks above
		//start and end are always trying to find max element in the above 2 checks
		//hence ,when they are pointing to just one element that is the max one because that is check say
		//more elaboration at every point of time for start and end ,they have the best possible answer till that time
		//and if we are saying that only one item is remaining,hence because of above line that is the best possible answer
		return start;//or return end as both are equal
	}
	static int orderAgnosticBS(int[] arr,int target,int start,int end) {
		
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


