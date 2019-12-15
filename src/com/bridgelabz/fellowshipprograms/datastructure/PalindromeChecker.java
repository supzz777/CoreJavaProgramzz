package com.bridgelabz.fellowshipprograms.datastructure;


import com.bridgelabz.fellowshipprograms.utility.Utility;
import com.bridgelabz.fellowshipprograms.utility.Utility.DeQueueForPallindrome;
public class PalindromeChecker
{
	public static void main(String[] args) 
	{
	
		DeQueueForPallindrome<Character> m =new DeQueueForPallindrome<Character>();
		System.out.println("Enter a String: ");
		String s=Utility.StringInput();

		//adding each character to the rear of the deque
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			m.addRear(c);
		}
		int flag=0;

		while(m.size()>1)
		{
			if(m.removeFront()!=m.removeRear());
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
