package com.app.palindrome;

import java.util.Stack;

public class Palindrome {
	
	public static boolean isPalindrome(String name) {
		char arr1[] = name.toCharArray();
		Stack<Character> s = new Stack<Character>();
		for(int i =0 ; i<arr1.length;i++) {
			s.push(arr1[i]);
		}
		
		char arr2[] = new char[arr1.length];
		
		for(int i = 0;i<arr2.length;i++) {
			arr2[i]=s.pop();
		}

		String res = new String(arr2);
		if(res.equals(name)) {
			return true;
		}
		else {
			return false;
		}
			
 	}
	
	
	public static void main(String[] args) {
		String name="yuyuyuyuy";
		System.out.println(isPalindrome(name));
	}
}
