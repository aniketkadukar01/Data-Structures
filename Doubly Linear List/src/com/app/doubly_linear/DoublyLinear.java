package com.app.doubly_linear;

import com.app.node.Node;

public class DoublyLinear {
	private Node head;
	private Node nextNode;
	
	public Node getHead() {
		return head;
	}

	public DoublyLinear() {
		head=null;
		nextNode=null;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if(newNode==null) {
			return false;
		}
		
		if(head==null) {
			head=newNode;
			return true;
		}
		
		Node last = head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;
		
	}
	
	public void display() {
		if(head==null) {
			return;
		}
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data , int position) {
		if(head==null && position>1 || position<=0) {
			return false;
		}
		
		Node newNode = new Node(data);
		if(newNode==null) {
			return false;
		}
		
		if(position == 1) {
			if(head!=null) {
				newNode.setNext(head);
				head.setPrev(newNode);
			}
			head=newNode;
			return true;	
		}
		
		Node prev = head;
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
		}
		
		Node nextNode = prev.getNext();
		newNode.setPrev(prev);
		if(nextNode!=null) {
			newNode.setNext(nextNode);
			nextNode.setPrev(newNode);
		}
		prev.setNext(newNode);
		return true;
	}
	
	public boolean deleteByValue(int data) {
		if(head== null) {
			return false;
		}
		
		Node prev= head;
		Node del = head;
		
		while(del.getData()!=data) {
			prev=del;
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		
		//handling of first node 
		if(del==prev) {
			nextNode=del.getNext();
			head=nextNode;
			nextNode.setPrev(null);
			return true;
		}
		
		nextNode = del.getNext();
		if(nextNode==null) {
			prev.setNext(null);
			return true;
		}
		prev.setNext(nextNode);
		nextNode.setPrev(prev);
		return true;
	}
	
	public boolean deleteByposition(int position) {
		if(head==null && position>1 || position<=0) {
			return false;
		}
	
		if(position==1) {
			if(head.getNext()==null) {
				head=null;
				return true;
			}
			head=head.getNext();
			head.setPrev(null);
			return true;
		}
		
		Node prev = head;
		Node del = head;
		for(int i =1 ; i<position;i++) {
			prev=del;
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		
		nextNode=del.getNext();
		if(nextNode==null) {
			prev.setNext(null);
			return true;
		}
		prev.setNext(nextNode);
		nextNode.setPrev(prev);
		return true;
		
	}
	
}
