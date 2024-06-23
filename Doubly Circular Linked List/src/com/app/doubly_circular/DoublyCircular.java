package com.app.doubly_circular;

import com.app.node.Node;

public class DoublyCircular {
	private Node head;
	
	public Node getHead() {
		return head;
	}

	public DoublyCircular() {
		head=null;
	}
	
	public void display() {
		if(head==null) {
			return;
		}
		Node temp=head;
		do {
			System.out.print(temp.getData()+ " ");
			temp=temp.getNext();
		} while (temp!=head);
		System.out.println();
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if(newNode==null) {
			return false;
		}
		
		if(head==null) {
			head=newNode;
			newNode.setNext(head);
			newNode.setPrev(head);
			return true;
		}
		
		Node last = head;
		while (last.getNext()!=head) {
			last=last.getNext();
		}
		
		newNode.setNext(last.getNext());
		newNode.setPrev(last);
		Node prev = last.getNext();
		prev.setPrev(newNode);
		last.setNext(newNode);
		
		return true;	
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data,int position) {
		if(head==null && position>1 || position<=0) {
			return false;
		}
		
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		
		if(position==1) {
			if(head== null) {
				head=newNode;
				newNode.setNext(head);
				newNode.setPrev(head);
				return true;
			}
			
			Node tail = head.getPrev();
			newNode.setNext(head);
			newNode.setPrev(tail);
			tail.setNext(newNode);
			head.setPrev(newNode);
			head=newNode;
			return true;
			
		}
		
		Node prev= head;
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev==head) {
				return false;
			}
		}
		
		Node nextNode = prev.getNext();
		newNode.setNext(nextNode);
		newNode.setPrev(prev);
		prev.setNext(newNode);
		nextNode.setPrev(newNode);
		return true;
	}
	
}
