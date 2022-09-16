package com.programs;

import java.util.*;

public class ImpleDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> deque=new LinkedList<>();
		//add
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addLast(3);
		deque.addLast(4);
		deque.addLast(5);
		System.out.println(deque);
		//peek
		System.out.println("get first element"+deque.getFirst());
		System.out.println("get last element"+deque.getLast());
		System.out.println(deque.getClass());
		//remove
		System.out.println("remove first element"+deque.removeFirst());
		System.out.println("remove last element"+deque.removeLast());
		System.out.println(deque);
		

	}

}
