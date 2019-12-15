package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Calender2D 
{
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub	
			System.out.println("please enter year");
			int year = Utility.IntegerInput();
			System.out.println("please enter\n 1. Jan \n 2.Feb \n 3.Mar  \n 4.apr \n 5.may"
					+ "\n 6.jun \n 7.jul \n 8.aug \n 9.sept  \n 10.oct  \n 11.nov  \n 12.dec");
			int month = Utility.IntegerInput();

			//months array
			String[] months= {"", "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};

			//create day array
			int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

			//check for leap year
			if(month==2 && Utility.isLeapYear(year))
			{
				days[month]=29;
			}

			//print headings
			System.out.println("  "+ months[month]+year+ " ");
			System.out.println("S	M	T	W	Th	F	S");

			//starting day
			int d= Utility.dayOfWeek(month, 1, year);

			//printing calendar
			for(int i=0;i<d;i++)
			{
				System.out.print("	");
			}
			for(int i=1;i<=days[month];i++)
			{
				System.out.printf("%2d	",i);
				if(((i+d)%7==0)||(i==days[month]))
				{
					System.out.println();
				}
			}		
		}

	

}
