package com.bridgelabz.fellowshipprograms.functionalprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Array2Dmultiply
{
			
	public static void main(String args[])
	{
		
		System.out.println("enter the size of rows");
		int row = Utility.IntegerInput();
		System.out.println("enter  the size of coloumns");
		int coloumn=Utility.IntegerInput();
		
		int array2D1[][]= new int[row][coloumn];
		 int[][] array2D2= new int[row][coloumn];
		 int[][] resultarray2D3= new int[row][coloumn];
		

  System.out.println(Utility.array2Dmultiply(row,coloumn,array2D1,array2D2,resultarray2D3));

		
		
	}
}