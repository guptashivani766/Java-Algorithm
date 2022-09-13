package com.programs;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInBuiltEg {

	public static void main(String[] args) {
		//queue is an interface there will we no name as queue interface the implementation classes are as LinkedList
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		try {
			queue.remove();
		} catch (Exception e) {
			System.out.println("the queue is empty!");
		}
		finally {
			System.out.println(queue.remove());
		}
		
		
		
		
		
	}

}
