package com.programs;

import java.util.Stack;

public class ImpleQueueUsing2Stack1 {
	static class Queue{
		static Stack<Integer> s1=new Stack<Integer>();
		static Stack<Integer> s2=new Stack<Integer>();
		
		//isempty
		public static boolean isEmpty() {
			return s2.isEmpty();
		}
		public static void add(int data) {
			s1.push(data);
		}
		public static int remove() {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			if(isEmpty()) {
				System.out.println("queue empty");
				return -1;
			}
			
			return (int) s2.pop();
		}
		public static int peek() {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			if(isEmpty()) {
				System.out.println("queue empty");
				return -1;
			}
			
			return s2.peek();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Queue q=new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());

	}

}
