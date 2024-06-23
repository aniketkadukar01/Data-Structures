package com.app.tester;

import com.app.doubly_linear.DoublyLinear;

public class Tester {

	public static void main(String[] args) {
		DoublyLinear dll = new DoublyLinear();
		
		dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.display();
        
        dll.insert(50, 4);
        dll.display();
        
        
        dll.deleteByValue(30);
        dll.display();
        
        dll.deleteByposition(4);
        dll.display();

	}

}
