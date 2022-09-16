package com.programs;

public class LL2 {
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
	}
	}
	
	public static Node getIntersectionNode(Node head1,Node head2) {
		while(head2!=null) {
			Node temp=head1;
			while(temp.next!=null) {
				if(temp==head2) {
					return head2;
				}
				temp=temp.next;
			}
			head2=head2.next;
		}
		return null;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Node head1,head2;
		head1=new Node(4);
		head2=new Node(1);
		
		Node newNode =new Node(2);
		head2.next=newNode;
		
		newNode=new Node(3);
		head2.next.next=newNode;
		
		newNode=new Node(5);
		head1.next=newNode;
		
		newNode=new Node(6);
		head2.next.next.next=newNode;
		head1.next.next=newNode;
		
		newNode=new Node(7);
		head1.next.next.next= newNode;
		
		head1.next.next.next.next=null;
		
		Node intersectionPoint=getIntersectionNode(head1,head2);
		
		if(intersectionPoint==null) {
			System.out.println("No intersection point\n");
		}
		else {
			System.out.println("intersecton point"+intersectionPoint.data);
		}
		
		

	}

}


