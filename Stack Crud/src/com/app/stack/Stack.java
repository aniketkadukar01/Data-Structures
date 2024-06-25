package com.app.stack;

public class Stack {
	private int arr[];
	private int size;
	private int top;
	
	public Stack( int size) {
		super();
		this.arr = new int[size];
		this.size = size;
		this.top = -1;
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int data) {
		arr[++top]=data;
	}
	
	public int pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public void display () {
		
		if(isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		System.out.println("Stack elements:");
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void sortDescending() {
		int temp=0;
		for(int i=0;i<=top;i++) {
			for(int j=i+1;j<=top;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	
	public void sortAscending() {
		int temp=0;
		for(int i=0;i<=top;i++) {
			for(int j=i+1;j<=top;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	
}
