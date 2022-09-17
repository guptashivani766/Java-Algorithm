package com.programs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversalQueue {
	public static void reverse(Queue<Integer> q) {
		
		Stack s=new Stack();
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		while(!s.isEmpty()) {
			q.add((Integer) s.pop());
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		reverse(q);
		while(!q.isEmpty()) {
			System.out.println(q.peek()+"");
			q.remove();
		}

	}

}
