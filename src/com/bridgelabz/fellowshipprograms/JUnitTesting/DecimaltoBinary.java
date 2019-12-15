package com.bridgelabz.fellowshipprograms.JUnitTesting;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class DecimaltoBinary 
{
	public static void main(String args[])
			{
		
					System.out.println("enter the decimal no you want to convert into binary:");
					int decimalnumber= Utility.IntegerInput();
					
					System.out.println(Utility.DecimaltoBinary(decimalnumber));
			}
}
