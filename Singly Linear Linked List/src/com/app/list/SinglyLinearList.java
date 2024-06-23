package com.app.list;

import java.util.Stack;

import com.app.node.Node;

public class SinglyLinearList {
	private Node head;

	public Node getHead() {
		return head;
	}
	
	public SinglyLinearList() {
		head = null;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if(newNode==null) {
			return false;
		}
		
		if(head == null) {
			head = newNode;
			return false;
		}
		
		Node temp = head;
		if(head.getData() == data) {
			return false;
		}
		
		while(temp.getNext() != null) {
			temp = temp.getNext();
			if(temp.getData() == data) {
				return false;
			}
		}
		
		temp.setNext(newNode);
		return true;
		
	}
	
	@SuppressWarnings("unused")
	public boolean inserAtPosition(int data, int position) {
		if(head == null && position>1 || position<=0) {
			return false;
		}
		
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		
		if(position == 1) {
			if(head==null) {
				head=newNode;
				return true;
			}
			else {
				newNode.setNext(head);
				head=newNode;
				return true;
			}
		}
		Node prev = head;
		for(int i = 1 ; i<position-1;i++) {
			prev=prev.getNext();
		}
		
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
		
	}

	public void display() {
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	
	
	public boolean deleteByPosition(int position) {
		if(head==null && position>1 || position<=0) {
			return false;
		}
		
		if(position == 1) {
			head=head.getNext();
			return true;
		}
		
		Node prev = head ;
		Node del = head;
		
		for(int i = 1;i<position; i++) {
			prev=del;
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
		
	}
	
	public void searching(int key) {
		Node temp = head;
		while (temp!=null) {
			if(temp.getData()==key) {
				System.out.println(temp.getData());
				return;
			}
			temp = temp.getNext();
		}
		return ;
	}
	
	public boolean deletebyValue(int data) {
		Node newNode = head;
		if(newNode==null) {
			return false;
		}
		while(newNode.getNext()!=null) {
			if(newNode.getData()==data) {
				
			}
		}
		return false;
	}
	
	public void displayReverse() {
		Stack<Node> stack = new Stack<Node>();
		Node temp = head;
		while (temp!=null) {
			stack.push(temp);
			temp=temp.getNext();
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().getData()+" ");
		}
		
	}

	
}
