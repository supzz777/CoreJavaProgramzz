package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

/**
 * @author admin28
 *
 */
public class PrimePallindrome 
{
	public static void main(String args[])
	{
		System.out.println("enter a limit to check the primepallindromes:");
		int limit=Utility.IntegerInput();
		
		
		System.out.println(Utility.PrimePallindrome(limit));
	}

}
