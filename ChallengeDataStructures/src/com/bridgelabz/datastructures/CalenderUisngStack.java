package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;
import com.bridgelabz.datastructures.utility.LinkedStack;
import com.bridgelabz.datastructures.utility.StackCalender;

public class CalenderUisngStack<T>
{
	
	
		public static void main(String[] args) {
			
			System.out.println("Enter the month number");
			int month = DataStructuresUtility.integerInput() ;
			
			System.out.println("Enter the year");
			int year = DataStructuresUtility.integerInput();
			
			int[][] calender = DataStructuresUtility.calenderQueue(month,year);
			
			String[] days = {"S","M","T","W","T","F","S"};
			for(int i=0;i<days.length;i++)
				System.out.print(days[i]+"  ");
			System.out.println();
			LinkedStack list = new LinkedStack();  
			
			// for pushing elements in the calendar array
			for(int i=0;i<6;i++)
			{
				for(int j=0;j<7;j++) 
				{ 
					
					list.push(calender[i][j]);
				}
			}
			StackCalender<Integer> listCalendar = new StackCalender<>();
			
			for(int i=0;i<6;i++) 
			{
				for(int j=0;j<7;j++) 
				{
					Integer temp = list.pop();
					listCalendar.add(temp);
				}
			}
			listCalendar.display();
		}
	
		
		


}
