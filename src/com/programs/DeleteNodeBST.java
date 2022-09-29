package com.programs;

import com.programs.SearchInBST.Node;

public class DeleteNodeBST {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	 public static Node insert(Node root,int val) {
		 if(root == null) {
			 root =new Node(val);
			 return root;
		 }
		 if(root.data >val) {
			 root.left = insert(root.left,val);
		 }
		 else {
			 root.right =insert(root.right,val);
		 }
		 return root;
	 }
	 public static void inOrder(Node root) {
		 if(root == null) {
			 return;
		 }
		 inOrder(root.left);
		 System.out.print(root.data+"");
		 inOrder(root.right);
	 }
	 public static Node delete(Node root,int val) {
		 if(root.data<val) {
			 root.right=delete(root.right,val);
		 }
		 else if(root.data>val) {
			 root.left =delete(root.left,val);
		 }
		 else {
			 //leaf node
			 if(root.left==null && root.right ==null) {
				 return null;
			 }
			 //single child node
			 if(root.left==null) {
				 return root.right;
			 }
			 else if(root.right ==null){
				 return root.left;
			 }
			//two child node
			 Node inorderSuccessor =fIS(root.right);
			 root.data =inorderSuccessor.data;
			 root.right =delete(root.right,inorderSuccessor.data);
			 
			 
		 }
		 
		 return root;
	 }
	 public static Node fIS(Node root) {
		 while(root.left!=null) {
			 root = root.left;
		 }
		 return root;
	 }
	 

	public static void main(String[] args) {
		int val[]= {8,5,3,1,4,6,10,11,14};
		Node root =null;
		for(int i=0;i<val.length;i++) {
			root =insert(root,val[i]);
		}
		inOrder(root);
		System.out.println();
		delete(root,1);
		inOrder(root);

	}

}
