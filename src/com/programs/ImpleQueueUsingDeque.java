package com.programs;
import java.util.*;

public class ImpleQueueUsingDeque {
	static class Queue{
		
		static Deque<Integer> deque=new LinkedList<>();
		//add
		public static void add(int data) {
			deque.addLast(data);
		}
		//remove
		public static int remove() {
			return deque.removeFirst();
		}
		//peek
		public static int peek() {
			return deque.getFirst();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q= new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println("peek"+q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
	}

}
