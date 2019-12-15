package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;
import com.bridgelabz.datastructures.utility.Dequeuepallindrome;

public class PallindromeChecker
{
	public static void main(String[] args) 
	{
		
		Dequeuepallindrome<Character> utility=new Dequeuepallindrome<Character>();
		System.out.println("Enter a String: ");
		String s=DataStructuresUtility.stringInput();

		//adding each character to the rear of the queque
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			utility.addRear(c);
		}
		int flag=0;   

		while(utility.size()>1)   
		{
			if(utility.removeFront()!=utility.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
