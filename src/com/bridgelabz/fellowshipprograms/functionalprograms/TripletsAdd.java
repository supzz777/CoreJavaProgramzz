package com.bridgelabz.fellowshipprograms.functionalprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;
public class TripletsAdd
{
	public static void main (String args[])
	{
		System.out.println("enter your target");
		int target=Utility.IntegerInput();
		System.out.println("eneter the size of array");
		int size=Utility.IntegerInput();
		
	
		
		System.out.println(Utility.tripletsAdd(target,size));
	}
}
