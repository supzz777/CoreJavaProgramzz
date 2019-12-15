package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class LinkedStack
{
	public static void main(String[] args) {
		Utility.LinkedStack<Integer> l = new Utility.LinkedStack<Integer>();
		l.add(2);
		l.add(10);
		l.add(5);
		l.display();
		System.out.println("==");
		l.display();
	}

}
