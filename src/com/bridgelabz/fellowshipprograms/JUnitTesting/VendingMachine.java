package com.bridgelabz.fellowshipprograms.JUnitTesting;

import java.util.Scanner;

public class VendingMachine 
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount you want to take from machine");
		int amount= sc.nextInt();
		
		int[] notes={2000,500,200,100,50,20,10,5,2,1};
		int[] noOfnotes=new int[10];
		for(int i=0;i<10;i++)
		{
			if(amount>=notes[i])
			{
				noOfnotes[i]=amount/notes[i];
			   amount=amount%notes[i];
			}
			else
			{
				noOfnotes[i]=0;
			}
		}
		
		
		System.out.println("the result is:");
		System.out.println("notes:no of notes");
		for(int i=0;i<10;i++)
		{
		System.out.println(notes[i]+":"+noOfnotes[i]);
		}
		
		
	}
}
