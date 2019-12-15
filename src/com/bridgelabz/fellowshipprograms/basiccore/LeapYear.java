package com.bridgelabz.fellowshipprograms.basiccore;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class LeapYear
{
	public static void main(String args[])
	{
		System.out.println("enter the year");
		
		int year=Utility.IntegerInput();
		int length= String.valueOf(year).length();
		System.out.println("length of the entered year is:"+length);
		
		
		if(length==4)
		{
				if((year%4==0)&&(year%100!=0)&&(year%400==0))
				{
					System.out.println("it is a leap year");
					System.out.println();
				}
				else
				{
					System.out.println("it is a not leap year");
					System.out.println();
				}

		}
		else
		{
			System.out.println("Invalid year entry ...please enter it aggain");
			year=Utility.IntegerInput();
			
		}
		
		
		
	}

}
