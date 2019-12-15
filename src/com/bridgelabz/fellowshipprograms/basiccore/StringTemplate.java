package com.bridgelabz.fellowshipprograms.basiccore;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class StringTemplate 
{
	public static void main(String args[])
	{
			String str1,str2,str3,str4;
			
			System.out.println("enter the string");
			str1= Utility.StringInput();
			

			System.out.println("enter the string you want to change");
			str2= Utility.StringInput();
			

			System.out.println("enter the string you want to replace with");
			str3= Utility.StringInput();
			
			str4= str1.replace(str2, str3);
			System.out.println(str4);
	}
}
