package com.app.queues;

public class LinearQueue {
	private int [] arr;
	private int size;
	private int rear;
	private int front;
	public LinearQueue( int size ){
		super();
		this.size = size;
		this.arr = new int[size];
		this.rear = -1;
		this.front = -1;
	}
	
	public boolean isEmpty() {
		return (front==-1 && rear==-1) || (front>rear);
	}
	
	public boolean isFull() {
		return rear==(size-1);
	}
	
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		
		arr[++rear]=data;
		if(front==-1) {
			front=0;
		}
		return true;
		
	}
	
	public int delete() {
		if(isEmpty()) {
			return 0;
		}
		return arr[front++];
	}
	
}
