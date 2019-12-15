package com.bridgelabz.fellowshipprograms.algorithm;

import java.util.Scanner;

public class PrimeTriangle 
{
	static Scanner sc=new Scanner(System.in);
	
	public static int Prime(int i)
	{
		int factorcount=0;
		for(int k=0;k<Math.pow(i,2);k++)
		{
			for(int l=k;l>0;l--)
			{
				if(k%i==0) 
				{
					factorcount++;
				}
				if(factorcount<=2)
				{
					System.out.println(k);
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String args[])
	{
		System.out.println("enter the no of rows:");
		int n= sc.nextInt();
		int temp =0;
		for(int i=0;i<n;i++)
		{
			temp= n-i;
			String space=" ";
	while(temp>=0)
		{
			System.out.print(space);
			temp--;
		}
		
			for(int j=0;j<(2*i)+1;j++) {
				
				System.out.print("*");
			}
			System.out.println();
	}
	

}}
