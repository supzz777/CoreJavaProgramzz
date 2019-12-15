package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class BinarySearch
{
   public static void main(String args[])
   {
	   System.out.println("enter the size of array");
		int size=Utility.IntegerInput();
		
		int[] array= new int[size];
		System.out.println("enter the elements of the ARRAY");
		for(int i=0;i<size;i++)
		{
			array[i]=Utility.IntegerInput();
		}
		
		System.out.println("enter the number you want to search from the array:");
		int number=Utility.IntegerInput();
		
		
		System.out.println(Utility.BinarySearch(size,array,number));
		
		
	   
   }

}
