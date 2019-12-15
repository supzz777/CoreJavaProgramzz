package com.bridgelabz.fellowshipprograms.algorithm;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Anagram 

{
	public static void main(String args[])
	{
		System.out.println("enter first string:");
		String first=Utility.StringInput();
		int length1=first.length();
		first=first.replace("\\s", "");
		
		System.out.println("enter second string:");
		String second=Utility.StringInput();
		int length2=second.length();
		second=second.replace("\\s", "");
		
		
		System.out.println(Utility.Anagram(first,length1,second,length2));
	}


}
