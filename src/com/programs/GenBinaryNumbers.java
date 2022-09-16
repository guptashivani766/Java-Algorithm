package com.programs;
import java.util.*;

public class GenBinaryNumbers {
	public static void generatePrintBinary(int n) {
		Queue<String> q=new LinkedList<>();
		q.add("1");
		while(n-->0) {
			String s1=q.peek();
			q.remove();
			System.out.println(s1);
			String s2=s1;
			q.add(s1+"0");
			q.add(s2+"1");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		generatePrintBinary(n);

	}

}
