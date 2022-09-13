package com.programs;


public class LL {
  private Node head;
  private Node tail;
  private int size;

public LL() {
	this.size=0;
}

private class Node{
	private int val;
	private Node next;
	
	public Node(int val) {
		this.val=val;
	}
	
}
public void insertAtBeg(int val) {
	Node newNode=new Node(val);
	newNode.next=head;
	head=newNode;
	if(tail==null) {
		tail=head;
	}
	size+=1;
	
}
public void insertAtEnd(int val) {
	
	
	if(tail==null) {
		insertAtBeg(val);
		return;
	}
	Node newNode=new Node(val);
	tail.next=newNode;
    tail=newNode;
    size+=1;
}

public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.val+"->");
		temp=temp.next;
		
	}
	System.out.println("END");
	
}

}
