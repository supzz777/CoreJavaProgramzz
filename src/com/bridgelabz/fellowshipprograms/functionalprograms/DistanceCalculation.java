package com.bridgelabz.fellowshipprograms.functionalprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;
public class DistanceCalculation
{
	
		public static void main(String args[])
		{
			
			System.out.println("enter the first coordinates ");
			int x1=Utility.IntegerInput();
			int y1=Utility.IntegerInput();
			
			System.out.println("enter the second coordinates ");
			int x2=Utility.IntegerInput();
			int y2=Utility.IntegerInput();
			
			double distance = Utility.DistanceCalculation(x1,y1,x2,y2);
			System.out.println("the distance between the first coordinates("+x1+","+y1+")and the second coordinates("+x2+","+y2+")is "+distance);
		}
}