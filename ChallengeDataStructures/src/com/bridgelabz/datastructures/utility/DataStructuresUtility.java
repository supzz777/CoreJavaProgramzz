package com.bridgelabz.datastructures.utility;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author supriya
 *
 */
public class DataStructuresUtility 
{
			static Scanner sc = new Scanner(System.in);
		
			public static int integerInput()
			{
				return sc.nextInt();
				
			}
			
			public static double doubleInput() 
			{
				return sc.nextDouble();
			}
			public static String stringInput()
			{
				return sc.nextLine();
			}
			public static long longInput()
			{
				return sc.nextLong();
			}
			public static short shortInput()
			{
				return sc.nextShort();
			}
			public static float floatInput()
			{
				return sc.nextFloat();
			}
			public static char characterInput()
			{
				return sc.next().charAt(0);
			}
	
	//------------------------------------------------------------------------------------//
			
			//method to return prime numbers in an array.
			   public static int[] PrimeNumberInTo1DArray(int num)
			   {
				   int i =0;
			       int j =0;
			       int k=0;
			      
			       int a[]=new int[num];
			       for (i = 1; i <=num ; i++)         
			       { 		  	  
			    	   int counter=0; 	  
			    	   for(j =i; j>=1; j--)
			    	   {
			    		   if(i%j==0)
			    		   {
			    			   counter = counter + 1;
			    		   }
			    	   }
			    	   if (counter ==2)
			    	   {
			    		  
			    		 a[k]=i;
			    		 
			    		   k++;
			    	   }	
			      }
			       return a;
			   }
		
			   //---------------------------------------------------------------------//
			   
	   //method to store the prime numbers in 2D array got from above method inside 1Darray
			   
	   public static int[][] PrimeNumberInTo2DArray(int primeNumbers[],int row,int col)
		{
			int array[][] = new int[row][col];			
             int k=0;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					array[i][j]=primeNumbers[k++];
				}
			}
			
			return array;
		}
		
	   
	   //-------------------------------------------------------------------------------//
	   
	   public static int[] primeSeries(int num)
	   {
		   int i =0;
	       int j =0;
	       int k=0;
	      
	       int array[]=new int[num];
	       for (i = 1; i <=num ; i++)   //to forward the loop till given number by the user      
	       { 		  	  
	    	   int counter=0; 	  
	    	   for(j =i; j>=1; j--) //checking if any previous number is the factor of number in variable j
	    	   {
	    		   if(i%j==0)
	    		   {
	    			   counter++;
	    		   }
	    	   }
	    	   if (counter ==2)
	    	   {
	    		  
	    		 array[k]=i;
	    		 
	    		   k++;
	    	   }	
	      }
	       return array;
	   }
	   
	   
	   
	   //----------------------------------------------------------------------------//
	   
	   //method to check if number is prime or not
	   public static boolean isPrime(int num) 
	   {
			for (int i = 2; i <= num / 2; i++)
			{
				if (num % i == 0)
				{
					return false;
				}
			}
			return true;
	   }
	   
	   
	   //-----------------------------------------------------------------------------//
	   
	   
	   //method to check if given numbers are anagram or not
	   
	   public static Boolean anagramChecker2(int number1, int number2) {
			String numberToString1 = Integer.toString(number1);
			String numberToString2 = Integer.toString(number2);
			boolean status = true;

			if (numberToString1.length() != numberToString2.length()) {
				status = false;
				// System.out.println("false");
			} else {
				char[] ArrayS1 = numberToString1.toCharArray();
				char[] ArrayS2 = numberToString2.toCharArray();
				Arrays.sort(ArrayS1);
				Arrays.sort(ArrayS2);
				status = Arrays.equals(ArrayS1, ArrayS2);
			}
			if (status) {
				// System.out.println(number1 + " and " + number2 + " are
				// anagrams");
				return true;
			} else {
				// System.out.println(number1 + " and " + number2 + " are not
				// anagrams");
				return false;
			}
		}
	   
	   //-----------------------------------------------------------------------------//
	   
	   //method to check if both the given strings are anagram or not
	   public static boolean isStringAnagram(String str1, String str2) 
		{
	            boolean status;
			if (str1.length() != str2.length())
			{
				return false;
			}
			char[] s1 = str1.toLowerCase().toCharArray();
			char[] s2 = str2.toLowerCase().toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			status=Arrays.equals(s1,s2);
			return status;
			
		}
	   
	   
	   //-----------------------------------------------------------------------------//
	   
	   
	   
	   public static void isAnagram(int a[],int count)
	   {
	 	 String s1,s2;
	 	 boolean status;
	 	  for(int i=0;i<count;i++)
	 	  {	    
		 			  s1= String.valueOf(a[i]); 
		 			  for(int j=i;j<count;j++)
		 			  {   if(i!=j)
		 			  	{
		 				  s2=String.valueOf(a[j]);
		 				  status=DataStructuresUtility.isStringAnagram(s1, s2);
		 				  System.out.println(status);
		 				  if(status==true)
		 					  System.out.println(s1+" "+s2);
		 			  	}
		 			
		 			  }
	         }
	 	  
	   }
	   
	   //--------------------------------------------------------------------------//
	   
	   
	   //method to print the calendar 
	   public static void calender(int month, int year) 
	   {
			int year1, month1, x, day = 1, day1;
			year1 = year - (14 - month) / 12;
			x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
			month1 = month + 12 * ((14 - month) / 12) - 2;
			day1 = (day + x + (31 * month1) / 12) % 7;
			String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
					"October", "November", "December" };
			int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			int monthDay = 0;
			
			//loop for assigning days to the specific month like jan has 31 days feb has 28 days and so on
			for (int i = 0; i < monthDays.length; i++)
			{
				if (i == month - 1) {
					monthDay = monthDays[i];
				}
			}
			
			//declaring the  array totalDays for printing the calendar
			int[][] totalDays = new int[6][7];
			
			//assigning 29 days for the February month in case of leap year
			boolean leap = leapYear(year);
			if (leap && month == 1) 
			{
				monthDay = 29;
			}
			 
			//assigning the values to the 2D array calendar
			int z = 1;
			
			for (int i = 0; i < 6; i++) //then row wise printing takes place
			{ 
				for (int j = 0; j < 7; j++) //first column wise printing will b taking place
				{
						if (i == 0 && j < day1)
						{
							totalDays[i][j] = 0;
						} 
						else if (z <= monthDay) 
						{
							totalDays[i][j] = z;
							z++;
						} 
						/*else 
						{
							totalDays[i][j] = -1;
						}*/
				}
			}
			
			//for printing month name and year bfr displaying the calendar like July 2014
			for (int i = 0; i < 12; i++) {
				if (month == i + 1) {
					System.out.print(monthName[i] + " " + year);
				}
			}
			
			
			System.out.println();
			
			
			String[] dayName = { " S" , " M" , " T" , " W" , " T" , " F" , " S" };
			for (int i = 0; i < 7; i++)
			{
				System.out.print(dayName[i] + "  ");
			}
			System.out.println();
			
			for (int i = 0; i < 6; i++) 
			{
				for (int j = 0; j < 7; j++) 
				{
					if (totalDays[i][j] != -1)
					{
						if (totalDays[i][j] < 10)
							System.out.print(totalDays[i][j]+"   ");
						else
							System.out.print(totalDays[i][j]+"  ");
					} 
					else
						System.out.print("   ");
				}
				System.out.println();
			}
			

	}

	   //-----------------------------------------------------------------------------------//
	   
	   
	   //method to check the year is leap year or not
	   public static boolean leapYear(int year) 
	   {
			if (year % 100 != 0 && year % 4 == 0)
			{
				return true;
			} else if (year % 100 == 0 && year % 400 == 0)
			{
				return true;
			} else 
			{
				return false;
			}
		}
	     
	   
	   //-------------------------------------------------------------------------------------//
	   
	   
	   //calendar queue
	   public static int[][] calenderQueue(int month, int year)
	   {
			int year1, month1, x, day = 1, day1;
			year1 = year - (14 - month) / 12;
			x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
			month1 = month + 12 * ((14 - month) / 12) - 2;
			day1 = (day + x + (31 * month1) / 12) % 7;
			String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
					"October", "November", "December" };
			int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			int monthDay = 0;
			for (int i = 0; i < monthDays.length; i++)
			{
				if (i == month - 1) {
					monthDay = monthDays[i];
				}
			}
			
			
			int[][] totalDays = new int[6][7];
			boolean leap = leapYear(year);
			if (leap && month == 1) {
				monthDay = 29;
			}
			
			
			int z = 1;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (i == 0 && j < day1) {
						totalDays[i][j] = -1;
					} else if (z <= monthDay) {
						totalDays[i][j] = z;
						z++;
					} else {
						totalDays[i][j] = -1;
					}
				}
			}
			
			for (int i = 0; i < 12; i++) {
				if (month == i + 1) {
					System.out.print(monthName[i] + " " + year);
				}
			}
			System.out.println();
			return totalDays;

		}

	   //------------------------------------------------------------------------------------//
	   
	  

	  

	  
}
	
	