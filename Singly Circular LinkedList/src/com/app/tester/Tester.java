package com.app.tester;

import com.app.singly_circular_linkedlist.SinglyCircularLinkedList;

public class Tester {

	public static void main(String[] args) {
		SinglyCircularLinkedList cl = new SinglyCircularLinkedList();
		
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		cl.insert(40);
		cl.insert(50);
		cl.display();
		
		System.out.println();
		
		cl.insert(1000, 1);
		cl.display();
		cl.insert(70, 4);
        cl.display();
        cl.insert(80, 8);
        cl.display();
        cl.insert(90, 12);
        cl.display();
        
        System.out.println();
        
        cl.deleteByVal(60);
        cl.display();
        cl.deleteByVal(70);
        cl.display();
        cl.deleteByVal(80);
        cl.display();
        cl.deleteByVal(80);
        cl.display();
       // while (cl.deleteByVal(80));
        
        System.out.println();
        
        cl.deleteByPosition(1);
        cl.display();
        cl.deleteByPosition(4);
        cl.display();
        cl.deleteByPosition(6);
        cl.display();
        cl.deleteByPosition(6);
        cl.display();

	}

}
