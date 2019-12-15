package com.bridgelabz.datastructures.utility;

public  class Stack<T>  
{
	static int capacity=10;
	static char stack[]= new char[capacity];
	static int stack1[]= new int[capacity];
	private static int top=0;
	protected int  size;
	
	//constructor of the stack
	public  Stack(T n)
	{
		size= (int) n;
	}




	//method for inserting the data inside the stack
	public static<T> void push(char data)
	{
		if(top==capacity)
		{
			System.out.println("stack if full");
		}
		else
		{
			stack[top]= (char) data;
			top= top+1;
		}
		
	}
	
	//method for inserting the data inside the stack
		public static<T> void push(Integer integer)
		{
			if(top==capacity)
			{
				System.out.println("stack if full");
			}
			else
			{
				stack1[top]= (Integer) integer;
				top= top+1;
			}
			
		}
	
	
	//method for taking away the uppermost data from the satck
	public static char pop()
	{
		
		if(isEmpty())
		{
			System.out.println("Cannot pop out anything as stack is full");
		}
		else
		{
			char data = (char) stack[--top];
			//stack[top] = (Character) data;
			return data;
		}
		return (Character) null;
		
	}

	

	//returns the last value of the stack
	public static<T> char  peek() 
	{
		return stack[top];
	}
	
	// method returns the length of the stack
	public int size() 
	{
		return top;
	}

	//method checks if the stack is empty or not

	public static boolean isEmpty()  
	{
		if(top==0)
			return true;
		return false;
	}
	
	//method to display the  char stack
		public static void displayc()
		{
			if(top>0)
			{
				for(int i=top;i>=0;i--)
				
				System.out.println(stack[i]);
			}
			else
			System.out.println("**No ELements to Display**");
				
		
		}
	
	
	//method to display the  integer stack
	public static void displayi()
	{
		if(top>0)
		{
			for(int i=top;i>0;i--)
			{
			System.out.println(stack1[i]);
			}
		}
		else
		System.out.println("**No ELements to Display**");
			
	
	}
	
	
	
	
}
