package com.programs;

public class ImpleCircularQueueUsingArr {
	static class Queue{
		static int arr[];
		static int size;
		static int rear;
		static int front;
		Queue(int n){
			arr=new int[n];
			size=n;
			rear=front=-1;
		}
		public static boolean isEmpty() {
			return rear==-1 && front==-1;
		}
		public static boolean isFull() {
			return (rear+1)%size==front;
		}
		public static void add(int data) {
			if(isFull()) {
				System.out.println("queue is full");
				return;
			}
			if(rear==front) {
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=data;
			
		}
		public static int remove() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			int result=arr[front];
			if(rear==front) {
			    front=rear=-1;
			}else {
			front=(front+1)%size;
			}
			return result;
		}
		public static int peek() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			return arr[front];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		while(!q.isEmpty()) {
			System.out.println(q.remove());
			
		}
		
	}

}
