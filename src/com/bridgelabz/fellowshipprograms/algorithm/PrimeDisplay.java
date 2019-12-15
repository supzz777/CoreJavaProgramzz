package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class PrimeDisplay 
{
	public static void main(String args[])
	{
		System.out.println("enter the limit:");
		int limit=Utility.IntegerInput();
	
		System.out.println(Utility.PrimeDisplay(limit));
	}


}
