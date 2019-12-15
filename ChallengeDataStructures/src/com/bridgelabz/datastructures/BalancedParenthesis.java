package com.bridgelabz.datastructures;


import com.bridgelabz.datastructures.utility.DataStructuresUtility;
import com.bridgelabz.datastructures.utility.Stack;


public class BalancedParenthesis 
{
	public static <T> void main(String args[])
	{
		//Stack<Character> stack = new Stack<Character>();
		Stack stack = new Stack(10);
		System.out.println("enter a equation of your choice");
		String userInput= DataStructuresUtility.stringInput();
		
		char[]  userInputarray = new char[userInput.length()];
		
		
		for(int i=0;i<userInput.length();i++)
		{
			userInputarray[i]= userInput.charAt(i);
			//System.out.println(userInputarray);
		}
		for(int i=0;i<userInputarray.length;i++) 
		{
			if( userInputarray[i]=='('||userInputarray[i]=='{'||userInputarray[i]=='[') 
			{
				stack.push(userInputarray[i]);
			
				 
			}
			
			if( userInputarray[i]==')'||userInputarray[i]=='}'||userInputarray[i]==']') 
			{
				
				
				
						stack.pop(); 
						if(stack.isEmpty())
						{
							System.out.println("Equation is  balanced");
						
						}
						else
						{
							System.out.println("Equation is not balanced");
							
						}
				 
				
			  }
			
			
			
			
		
		}
		
		
	}

}
