package com.app.tester;

import java.util.Scanner;

import com.app.singly.Singly;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			Singly sl = new Singly();
			while (!exit) {
				System.out.println("0.for exit\n"
						+ "1.display list\n"
						+ "2.for insert the value by data\n"
						+ "3.for insert by position\n"
						+ "4.delete by value\n"
						+ "5.delete by position\n"
						+ "6.delete the duplicate in the list\n"
						+ "7.count of element\n"
						+ "8.search the element\n"
						+ "9.maximum in list\n"
						+ "10.minimum in list\n"
						+ "11.sorting the list in ascending\n"
						+ "12.sorting the list in desending");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit=true;
						break;

					case 1:
						sl.display();
						break;
						
					case 2:
						System.out.println("Enter the data :");
						sl.insert(sc.nextInt());
						break;
						
					case 3:
						System.out.println("Enter the data and position");
						sl.insertByPosition(sc.nextInt(), sc.nextInt());
						break;
						
					case 4:
						System.out.println("Enter the data you want to delete");
						sl.deleteByValue(sc.nextInt());
						break;
						
					case 5:
						System.out.println("Enter the position to delete");
						sl.deleteByPosition(sc.nextInt());
						break;
						
					case 6:
						System.out.println("delete the duplicates");
						sl.deleteDuplicate(sl.getHead());
						break;
						
					case 7:
						System.out.println("Count : " + sl.count(sl.getHead()));
						break;
						
					case 8:
						System.out.println("Enter the value to search" );
						System.out.println("Value is found "+sl.searchByValue(sc.nextInt()));
						break;
						
					case 9:
						System.out.println("Maximum :"+sl.maximumNo());
						break;
						
					case 10:
						System.out.println("Minimum : "+ sl.mininumNo());
						break;
						
					case 11:
						sl.sortAscending();
						break;
						
					case 12:
						sl.sortDesending();
						break;
						
					}	
					
				}catch(Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
			}
			
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

}
