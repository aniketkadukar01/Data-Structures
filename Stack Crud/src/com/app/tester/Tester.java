package com.app.tester;

import java.util.Scanner;

import com.app.stack.Stack;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit=false;
			Stack s = new Stack(4);
			while (!exit) {
				System.out.println("0.for exit\n"
						+ "1.display\n"
						+ "2.for add the element\n"
						+ "3.delete the element\n"
						+ "4.Retrieve the top element\n"
						+ "5.sort array Ascending\n"
						+ "6.sort array descending");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit=true;
						break;

					case 1:
						s.display();
						break;
						
					case 2:
						if(s.isFull()) {
							System.out.println("Stack is full");
							break;
						}
						System.out.println("Enter the number");
						s.push(sc.nextInt());
						break;
						
					case 3:
						if(s.isEmpty()) {
							System.out.println("Stack is Empty");
							break;
						}
						System.out.println(s.pop());
						break;
						
					case 4:
						if(s.isEmpty()) {
							System.out.println("Stack is Empty");
							break;
						}
						System.out.println(s.peek());
						break;
						
					case 5:
						s.sortAscending();
						break;
						
					case 6:
						s.sortDescending();
						break;
					}
					
				}catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}	
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
