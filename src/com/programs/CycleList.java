package com.programs;

public class CycleList {
	private Node tail;
	private Node head;
	private class Node {
		
		public int val;
		public Node next;
		
		public Node(int val) {
		this.val=val;
		}
		public Node(int val,Node next) {
			this.val=val;
			this.next=next;
		}
		
	}
	public boolean cycleList() {
		Node fast=head;
		Node slow=head;
		while(fast!=null && slow!=null) {
			if(fast==slow) {
				return true;
			}
		}
		return false;
	}
	public int cycleLength() {
		Node fast=head;
		Node slow=head;
		while(fast!=null && slow!=null) {
			if(fast==slow) {
				Node temp=slow;
				int length=0;
				do{
					temp=temp.next;
					length++;
					
				}while(temp!=slow);
				return length;
			}
		}
		return 0;
	}
	
}

