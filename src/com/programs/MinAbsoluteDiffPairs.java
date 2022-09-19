package com.programs;
import java.util.*;

public class MinAbsoluteDiffPairs {

	public static void main(String[] args) {
		int a[]= {5,2,3};
		int b[]= {2,1,3};
		
		// sort the array in increasing order
		Arrays.sort(a);
		Arrays.sort(b);
		
		int minAbsDiff=0;
		for(int i=0;i<a.length;i++) {
			minAbsDiff+=Math.abs(a[i]-b[i]);
		}
		
		System.out.println("the minimum absolute difference is="+minAbsDiff);

	}

}
