package com.bridgelabz.datastructures;
import java.util.*;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;


public class PrintCalendarOfMonth 
{

/*	// method to match the given month and return its maximum days
	int findMaxDay(String monthName, int y) {
		String months[] = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int D[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
			D[2] = 29;
		}
		int max = 0;
		for (int i = 1; i <= 12; i++) {
			if (monthName.equalsIgnoreCase(months[i])) //IgnoreCase --> ignoring  upper case
			{
				max = D[i]; // Saving maximum day of given month(Ex-> 31 for jan,  28/29 for feb and so on)
			}
		}
		return max;
	}

	// method to match the given weekday name and return its weekday no.
	int findDayNo(String weekName) {
		String days[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int dayNo = 0;
		for (int i = 0; i < 7; i++) {
			if (weekName.equalsIgnoreCase(days[i])) 
			{
				dayNo = i; // Saving week day no. given day (Ex-> '0' for Sun, 1 for mon)
			}
		}
		return dayNo;
	}

	// method for creating the calendar
	void fillCalendar(int max, int dayNo, String monthName, int year) 
	{
		int array[][] = new int[6][7]; // as we want 6 rows and 7 col for week days
		int x = 1, z = dayNo;

		for (int i = 0; i < 6; i++) 
		{
			for (int j = dayNo ; j < 7; j++)
			{
				if (x <= max)
				{
					array[i][j] = x;
					x++;
				}
			}
			dayNo = 0;
		}

		for (int j = 0; j < z; j++) // Adjustment to bring last (6th) row
									// elements to first row
		{
			array[0][j] = array[5][j];
		}

		printCalendar(array, monthName, year); // Calling function to print the
										// calendar
	}

	// method  for printing the calendar
	void printCalendar(int A[][], String monthName, int y) {
		System.out.println("\n->-->-->-->--->--->-->--->-->-->-->---->-->->--->-->--");
		System.out.println("     " + monthName + " " + y);
		System.out.println("----------------------------------------------------");
		System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		System.out.println("--->-->--->--->-->--->--->--->--->---->--->--->-->--");

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				if (A[i][j] != 0)
					System.out.print("\t " + A[i][j]);
				else
					System.out.print("\t ");
			}
			System.out.println("\n----------------------------------------------------");
		}
	}*/

	public static void main(String args[]) 
	{
		
		
		//DataStructuresUtility utility = new DataStructuresUtility();
			System.out.println("Enter month number ");
			int month = DataStructuresUtility.integerInput();
			
			System.out.println("Enter the year");
			int year = DataStructuresUtility.integerInput();
			DataStructuresUtility.calender(month,year);
		
		/*PrintCalendarOfMonth ob = new PrintCalendarOfMonth();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int y = sc.nextInt();
		System.out.print("Enter the month name (e.g. January) : ");
		String monthName = sc.next();
		System.out.print("Enter the week day name (e.g. Sunday) of 1st day of " + monthName + " : ");
		String weekName = sc.next();

		int maxDays = ob.findMaxDay(monthName, y);
		int dayNo = ob.findDayNo(weekName);
		ob.fillCalendar(maxDays, dayNo, monthName, y);*/
	}
}		