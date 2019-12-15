package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;
import com.bridgelabz.datastructures.utility.LinkedQueue;

public class CalenderUsingQueue 
{
	public static void main(String[] args) 
{
		
		System.out.println("Enter the month number");
		int month = DataStructuresUtility.integerInput();
		
		System.out.println("Enter the year");
		int year = DataStructuresUtility.integerInput();
		int[][] calender = DataStructuresUtility.calenderQueue(month,year);
		String[] days = {"S||M||T||W||T||F||S"};
		for(int i=0;i<days.length;i++)
			System.out.print(days[i]+"  ");
		System.out.println();
		LinkedQueue list[] = new LinkedQueue[6];
		for(int i=0;i<6;i++) {
			list[i]=new LinkedQueue();
		}
		for(int i=0;i<6;i++)
		{
			
			for(int j=0;j<7;j++)
			{
				
				list[i].insert(calender[i][j]);
				//list[i].display();
			}
		}
		for(int i=0;i<6;i++)
			list[i].display();
		
		
	}

}
