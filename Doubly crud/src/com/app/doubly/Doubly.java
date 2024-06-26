package com.app.doubly;

import com.app.node.Node;

public class Doubly {
	private Node head;

	public Node getHead() {
		return head;
	}
	
	public Doubly() {
		head=null;
	}
	
	public boolean display() {
		if(head==null) {
			return false;
		}
		Node trav=head;
		while (trav!=null) {
			System.out.print(trav.getData()+" ");
			trav=trav.getNext();
		}
		System.out.println();
		return true;
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if(newNode== null) {
			return false;
		}
		
		if(head==null) {
			head=newNode;
			return false;
		}
		
		Node last=head;
		while (last.getNext()!=null) {
			last=last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;	
	}
	
	public boolean delete(int data) {
		if(head==null) {
			return false;
		}
		if(head.getData()==data) {
			head=head.getNext();
			return true;
		}
		Node del = head;
		Node prev = head;
		while(del.getData()!=data) {
			prev=del;
			del=del.getNext();
		}
		
		prev.setNext(del.getNext());
		if(del.getNext()==null) {
			return true;
		}
		del.getNext().setPrev(prev);
		return true;
	}

	
	public void findMid() {
		if(head==null) {
			return;
		}
		
		int count =0;
		Node trav = head;
		while(trav!=null) {
			trav=trav.getNext();
			count ++;
			
		}
		
		trav =head;
		for(int i = 1;i<count/2;i++) {
			trav=trav.getNext();
		}
		System.out.println(trav.getData());
	}
	
	public boolean deleteByPostion(int position) {
		if(head==null && position>1 || position<=0) {
			return false;
		}
		if(position==1) {
			head=head.getNext();
			return true;
		}
		
		Node prev = head;
		Node del=head;
		for(int i=1;i<position;i++) {
			prev=del;
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}
	
	public void sort() {
		if(head==null) {
			return;
		}
		int temp=0;
		Node pos=head;
		Node trav=head;
		while (pos!=null) {
			while (trav!=null) {
				if(pos.getData()>trav.getData()) {
					temp=pos.getData();
					pos.setData(trav.getData());
					trav.setData(temp);
				}
				trav=trav.getNext();
			}
			pos=pos.getNext();
			trav=pos;
		}
	}
	
	public int max() {
		Node trav=head;
		int max = trav.getData();
		while (trav!=	null) {
			if(trav.getData()>max) {
				max=trav.getData();
			}
			trav=trav.getNext();
		}
		return max;
	}
	
	public int min() {
		Node trav=head;
		int min = trav.getData();
		while (trav!=	null) {
			if(trav.getData()<min) {
				min=trav.getData();
			}
			trav=trav.getNext();
		}
		return min;
	}
	
	public int count(Node root) {
		if(root==null) {
			return 0;
		}
		return 1+count(root.getNext());
	}
	
	public void deleteDuplicate(Node root) {
		if(root==null) {
			return;
		}
		
		Node  trav = root;
		while(trav.getNext()!=null) {
			if(trav.getNext().getData()==root.getData()) {
				trav.setNext(trav.getNext().getNext());
			}else {
				trav=trav.getNext();
			}
		}
		deleteDuplicate(root.getNext());
	}
	
}
