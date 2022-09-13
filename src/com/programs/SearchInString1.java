package com.programs;

import java.util.Arrays;

public class SearchInString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="shivani";
        char target='v';
        System.out.println(search(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));
	}
	static boolean search(String str,char target) {
		 if(str.length()==0) {
			 return false;
		 }
		 //toCharArray is used to convert string into character
		 for(char ch: str.toCharArray()) {
			 if(ch==target) {
				 return true;
			 }
		 }
		 return false;
	}

}
