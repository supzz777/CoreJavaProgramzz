package com.bridgelabz.fellowshipprograms.algorithm;
import java.util.*;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Permutation 
{
	
	 static int count=0;
	public static String permutationcombination(String s,int i,int n)
	{


	int j;
	
	if(i==n)
	{

	System.out.println(s);
	count++;

	}
	else
	for(j=i;j<n;j++)
	{
	s=swap(s,i,j);
	permutationcombination(s,i+1,n);
	//count++;

	s=swap(s,i,j);

	}

	return s;
	}


	private static String swap(String a, int i, int j)
	{
	
	       char temp;
	       char[] charArray = a.toCharArray();
	       temp = charArray[i] ;
	         charArray[i] = charArray[j];
	       charArray[j] = temp;
	       return String.valueOf(charArray);
	   

	}


	public static void main(String[] args)
	{

	
	System.out.println("enter the string ");
	String s =Utility.StringInput();
	String output3=permutationcombination(s,0,s.length());
	System.out.println(count);
	}
	
}
