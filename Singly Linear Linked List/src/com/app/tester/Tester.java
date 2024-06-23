package com.app.tester;

import com.app.list.SinglyLinearList;

public class Tester {

	public static void main(String[] args) {
		SinglyLinearList sl = new SinglyLinearList();
		
		sl.insert(10);
		sl.insert(20);
		sl.insert(30);
		sl.insert(40);
		sl.insert(50);
		
		sl.display();
//		System.out.println();
//		sl.searching(50);
		
		System.out.println();
		sl.inserAtPosition(100, 1);
		sl.display();
		
//		System.out.println();
//		sl.inserAtPosition(500, 7);
//		sl.display();
		
		System.out.println();
		sl.deleteByPosition(1);
		sl.display();
		
		System.out.println();
		sl.deleteByPosition(3);
		sl.display();
		
		System.out.println();
		sl.deleteByPosition(4);
		sl.display();
		
		System.out.println();
		sl.deleteByPosition(4);
		sl.display();
		
		System.out.println();
		sl.displayReverse();
	}

}
