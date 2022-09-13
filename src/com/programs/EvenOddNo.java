package com.programs;

public class EvenOddNo {

	public static void main(String[] args) {
		int num=67;
		System.out.println(nodd(num));

	}  
	public static boolean nodd(int num) {
		return (num&1)==1;
	}


}
