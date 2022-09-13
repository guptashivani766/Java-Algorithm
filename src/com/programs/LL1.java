package com.programs;

public class LL1 {
	
	public static void main(String[] args) {
		LL list=new LL();
		list.insertAtBeg(5);
		list.insertAtBeg(4);
		list.insertAtBeg(3);
		list.insertAtBeg(2);
		list.insertAtBeg(1);
		list.display();
		System.out.println();
		list.insertAtEnd(6);
		list.insertAtEnd(7);
		list.insertAtEnd(8);
		list.display();
	}

}
