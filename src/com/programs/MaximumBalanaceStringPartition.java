package com.programs;
import java.util.*;

public class MaximumBalanaceStringPartition {

	public static int BalancedPartion(String str,int n) {
		if(n==0) {
			return 0;
		}
		int l=0,r=0;
		int ans=0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='L') {
				l++;
			}
			else if(str.charAt(i)=='R') {
				r++;
			}
			if(r==l) {
				ans++;
			}
			
		}
		return ans;
		
	}
	public static void main(String[] args) {
		String str="LRRRRLLRLLRL";
		int n=str.length();
		System.out.println(BalancedPartion(str,n)+"\n");

	}

}
