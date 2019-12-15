package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class BalancedParentesis
{	

	public static void main(String[] args) 
	{
		System.out.println("enter the equation to check if it is balanced or not");
		String s = Utility.StringInput();
		String result = (Utility.checkBalancedParenthesis(s)) ? "Balanced" : "Not Balanced";
		System.out.println(result);
	}

}
