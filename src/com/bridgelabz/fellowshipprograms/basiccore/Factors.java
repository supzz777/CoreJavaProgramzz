package com.bridgelabz.fellowshipprograms.basiccore;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Factors
{
	
	public static void main(String args[])
	{
		System.out.println("enter a number you want to find the prime factor of:");
		int number= Utility.IntegerInput();
		for(int i=2;i<=number;i++)
		{
				while(number%i==0)
				{
					System.out.print(i+" ,");
					number=number/i;
				
				}

		}
		
	}
		
}
