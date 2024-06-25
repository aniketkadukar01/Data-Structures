package com.app.singly;

import com.app.node.Node;

public class Singly {
	private Node head;

	public Node getHead() {
		return head;
	}

	public Singly() {
		super();
		this.head = null;
	}

	//Display
	public void display() {
		if (head == null) {
			return;
		}
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.getData() + " ");
			trav = trav.getNext();
		}
		System.out.println();
	}
	
	//insert By value
	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}

		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}

		last.setNext(newNode);
		return true;
	}

	//insert by position
	@SuppressWarnings("unused")
	public boolean insertByPosition(int data, int position) {
		if (head == null && position > 1 || position <= 0) {
			return false;
		}

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (position == 1) {
			if (head == null) {
				head = newNode;
				return true;
			}

			newNode.setNext(head);
			head = newNode;
			return true;
		}

		Node trav = head;
		for (int i = 1; i < position - 1; i++) {
			trav = trav.getNext();
			if (trav == null) {
				return false;
			}
		}

		newNode.setNext(trav.getNext());
		trav.setNext(newNode);
		return true;
	}

	
	//delete by value
	public boolean deleteByValue(int data) {
		if (head == null) {
			return false;
		}

		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}

		Node del = head;
		Node prev = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}

		prev.setNext(del.getNext());
		return true;
	}

	
	//delete by position
	public boolean deleteByPosition(int position) {
		if (head == null && position >= 1 || position <= 0) {
			return true;
		}

		if (position == 1) {
			head = head.getNext();
			return true;
		}

		Node prev = head;
		Node del = head;
		for (int i = 1; i < position; i++) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return true;
			}
		}

		prev.setNext(del.getNext());
		return true;
	}
	

	//delete duplicate
	public void deleteDuplicate(Node root) {
		if(root == null) {
			return;
		}
		
		Node trav=root;
		while(trav.getNext()!=null) {
			if(trav.getNext().getData()==root.getData()) {
				trav.setNext(trav.getNext().getNext());
			}else {
				trav=trav.getNext();
			}
		}
		deleteDuplicate(root.getNext());
	}

	
	//count the node
	public int count(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + count(root.getNext());
	}

	public int searchByValue(int data) {
		if (head == null) {
			return -1;
		}

		Node trav = head;
		while (trav.getData() != data) {
			trav = trav.getNext();
			if (trav == null) {
				return -1;
			}
		}

		return trav.getData();

	}

	//Maximum in the list
	public int maximumNo() {
		int max = Integer.MIN_VALUE;
		Node temp = head;

		while (temp != null) {
			if (temp.getData() > max) {
				max = temp.getData();
			}
			temp = temp.getNext();
		}
		return max;
	}
	
	
	//Minimum in the list
	public int mininumNo() {
		int min=Integer.MAX_VALUE;
		Node temp=head;
		
		while (temp!=null) {
			if(temp.getData()<min) {
				min=temp.getData();
			}
			temp=temp.getNext();
		}
		return min;
	}
	
	
	//Sort the the Ascending 
	public void sortAscending() {
		if(head==null) {
			System.out.println("List is empty");
			return ;
		}
		int num=0;
		Node temp=head;
		Node trav=head;
		while (temp!=null) {
			while (trav!=null) {
				if(trav.getData()<temp.getData()) {
					num=trav.getData();
					trav.setData(temp.getData());
					temp.setData(num);
				}
				trav=trav.getNext();
			}
			temp=temp.getNext();
			trav=temp;
		}
		System.out.println("List is sort sucessfully");
	}
	
	
	//Sort the list in Descending
	public void sortDesending() {
		if(head==null) {
			System.out.println("List is empty");
			return ;
		}
		int num=0;
		Node temp=head;
		Node trav=head;
		while (temp!=null) {
			while (trav!=null) {
				if(trav.getData()>temp.getData()) {
					num=trav.getData();
					trav.setData(temp.getData());
					temp.setData(num);
				}
				trav=trav.getNext();
			}
			temp=temp.getNext();
			trav=temp;
		}
		System.out.println("List is sort sucessfully");
	}
	

}
