package com.app.tester;

import com.app.doubly_circular.DoublyCircular;

public class Tester {

	public static void main(String[] args) {
		DoublyCircular dc = new DoublyCircular();

		dc.insert(10);
		dc.insert(20);
		dc.insert(30);
		dc.insert(40);
		dc.insert(50);
		dc.display();
		
		dc.insert(50,1);
		dc.display();
	}

}
