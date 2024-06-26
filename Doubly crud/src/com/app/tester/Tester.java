package com.app.tester;

import java.util.Scanner;

import com.app.doubly.Doubly;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
			boolean exit=false;
			Doubly d = new Doubly();
			while (!exit) {
				System.out.println("0.for exit\n"
						+ "1.display\n"
						+ "2.insert\n"
						+ "3.delete\n"
						+ "4.find the mid element\n"
						+ "5.delete at position\n"
						+ "6.soting\n"
						+ "7.max\n"
						+ "8.min\n"
						+ "9.count\n"
						+ "10.duplicate delete\n");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit=true;
						break;

					case 1:
						d.display();
						break;
						
					case 2:
						System.out.println("Enter the data");
						d.insert(sc.nextInt());
						break;
						
					case 3:
						System.out.println("ennter the value to delete");
						d.delete(sc.nextInt());
						break;
						
					case 4:
						d.findMid();
						break;
						
					case 5:
						System.out.println("Enter the position");
						d.deleteByPostion(sc.nextInt());
						break;
						
					case 6:
						d.sort();
						break;
						
					case 7:
						System.out.println(d.max());
						break;
						
					case 8:
						System.out.println(d.min());
						break;
						
					case 9:
						System.out.println(d.count(d.getHead()));
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
