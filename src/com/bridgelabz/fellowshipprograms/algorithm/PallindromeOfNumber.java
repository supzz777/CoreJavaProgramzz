package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class PallindromeOfNumber 
{
	public static void main(String args[])
	{
		System.out.println("enter a limit to check the pallindromes:");
		int limit=Utility.IntegerInput();
		
		System.out.println(Utility.PallindromeOfNumber(limit));
	}


}
