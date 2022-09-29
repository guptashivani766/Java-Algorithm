package com.programs;

public class PostOrderBinaryTree {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	public static void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data+"");
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left =new Node(4);
		root.left.right =new Node(5);
		root.right.left =new Node(6);
		root.right.right =new Node(7);
		postOrder(root);
		
		

	}

}
