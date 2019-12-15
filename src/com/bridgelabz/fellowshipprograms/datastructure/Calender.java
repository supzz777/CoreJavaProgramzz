package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Calender 
{

	public static void main(String[] args)
	{
		
		System.out.println("enter month");
		int m = Utility.IntegerInput();
		System.out.println("enter yaer");
		int y =Utility.IntegerInput();
		Utility.dispCalender(m, y);
	}
}

