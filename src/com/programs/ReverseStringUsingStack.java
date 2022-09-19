package com.programs;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static String reverseString(String str) {
		Stack<Character> s=new Stack<>();
		int idx=0;
		while(idx!=str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
//		StringBuilder result=new StringBuilder("");
		String result= new String();
		while(!s.empty()) {
			result+=s.pop();
		}
		// change into string
		return result;			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String result=reverseString(str);
		System.out.println(result);

	}

}
