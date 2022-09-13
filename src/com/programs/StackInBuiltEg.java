package com.programs;
import java.util.Stack;;

public class StackInBuiltEg {

	public static void main(String[] args) {
	   Stack<Integer> stack=new Stack<>();
	   System.out.println(stack.push(5));
		  System.out.println(stack.push(4));
		  System.out.println(stack.push(3));
		  System.out.println(stack.pop());
		  System.out.println(stack.pop());
		 
		 
		  
	  
	  try {
//		 if(stack.empty()==true) {
//			 stack.pop();
//		 }
		  //or 
		  stack.pop();
		  
	} catch (Exception e) {
		System.out.println("stack is empty i.e no any element present in the stack right now");
	}
	  
	   

	}

}
