package com.bridgelabz.fellowshipprograms.basiccore;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Powerof2 
{
	public static void main(String args[])
	{
		System.out.println("enter a number more than 0 and less than 31");
		int number=Utility.IntegerInput();
		
	
			if(number<=31&&number>0)
			{
				
				
				for(int i=0;i<=number;i++)
				{
					System.out.println("power of 2 of the"+i+" is: "+Math.pow(2, i));
					LeapYear((int) +Math.pow(2, i));
					
				}
				
			}
			else
			{
				System.out.println("Invalid entry of number enter the no again");
				number=Utility.IntegerInput();
			}
			
		
	}

			private static void LeapYear(int year)
			{
				
				int length= String.valueOf(year).length();
				//System.out.println("length of the entered year is:"+length);
				
				
				if(length==4)
				{
						if((year%4==0)&&(year%100!=0)||(year%400==0))
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
				/*else
				{
					System.out.println("Invalid year entry ...please enter it aggain");
					year=Utility.IntegerInput();
					
				}*/
				
			
			}

}
