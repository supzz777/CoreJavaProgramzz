package com.bridgelabz.fellowshipprograms.functionalprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;
public class QuadraticRootCalculation 
{
	public static void main(String args[])
	{
		
		System.out.println("enter the constants of the equation");
		int a=Utility.IntegerInput();
		int b=Utility.IntegerInput();
		int c=Utility.IntegerInput();
		System.out.println("the equation is "+a+"X^2 +"+b+"X +"+c); 
		
		System.out.println(Utility.QuadraticRootCalculation(a,b,c));
	}
}