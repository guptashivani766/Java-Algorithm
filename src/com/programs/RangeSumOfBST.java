package com.programs;
import java.util.*;

public class RangeSumOfBST {
	static class Node{
		int data;
		Node left,right;
	}
	static Node newNode(int item) {
		Node temp = new Node();
		temp.data = item;
		temp.left =temp.right =null;
		return temp;
	}

	static int sum =0;
	static int rangeSumBST(Node root,int low,int high) {
		if(root==null) {
			return 0;
		}
		Queue<Node> q =new LinkedList<Node>();
		q.add(root);
		while(q.isEmpty()==false) {
			Node curr=q.peek();
			q.remove();
			if(curr.data>=low && curr.data<=high)
			{
				sum+=curr.data;
			}
			if(curr.left!=null && curr.data>low) {
				q.add(curr.left);
			}
			if(curr.right!=null && curr.data<high) {
				q.add(curr.right);
			}
		}
		return sum;
	}
	public static Node insert(Node node,int data) {
		if(node == null) {
			return newNode(data);
		}
		if(data<=node.data) {
			node.left =insert(node.left,data);
		}
		else {
			node.right =insert(node.right,data);
		}
		return node;
	}
	public static void main(String[] args) {
		
		Node root =null;
		root =insert(root,10);
		insert(root,5);
		insert(root,15);
		insert(root,3);
		insert(root,7);
		insert(root,18);
		int L =3,R =5;
		System.out.println(rangeSumBST(root,L,R));
	}

}
