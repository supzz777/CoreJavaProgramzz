package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class LinkedQueue 
{
	public static void main(String[] args) {
		Utility.LinkedQueue<Integer> l = new Utility.LinkedQueue<Integer>();
		l.display();
		System.out.println();
		l.remove();
		l.display();
		System.out.println(l.isEmpty());
	}

}
