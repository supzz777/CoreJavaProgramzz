package com.bridgelabz.fellowshipprograms.functionalprograms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class WindChill 
{
	public static void main (String args[])
	{
		System.out.println("enter the temperature between 0 to 50 in Farenheits ");
		double temperature=Utility.DoubleInput();
		System.out.println("the temperature is "+temperature+"F");
		
		System.out.println("enter the Windspeed between 3 and 120 in miles/hour");
		double Windspeed=Utility.DoubleInput();
		System.out.println("the Windspeed is "+Windspeed+"miles/hour");
		
		
	System.out.println(Utility.WindChill(temperature,Windspeed));
	}
}
