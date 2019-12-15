package com.bridgelabz.datastructures;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;

public class PrimeAnangramzzz
{
	

	
		public static void main(String[] args)
		{ 
			//Initialize a arraylist
			List<Integer> list = new ArrayList<Integer>();
			//ArrayList<ArrayList<Integer> > primeAnagram  = new ArrayList<ArrayList<Integer> >(); 
           
			//List<Array> listanagram = new ArrayList<Array>();
			
			//loop to check prime between 0-1000
			for (int i = 0; i < 1000; i++) 
			{
				if (DataStructuresUtility.isPrime(i))
				{
					list.add(i);
				}
			}
			
			System.out.print("prime numbers are:" + list+" , ");
			//System.out.println("Total number of prime numbers are:" + list.size());
			
			//creating 2D array to store prime and Anangram nos
			int[][] primeAnagram= new int[list.size()][list.size()];
			//another loop to store primes
			for (int j = 0; j < list.size() - 1; j++)
			{
				//another loop to store prime and compare
				for (int k = j + 1; k < list.size() - 1; k++) 
				{
					
					if (DataStructuresUtility.anagramChecker2(list.get(j), list.get(k)))
					{
						primeAnagram[j][k]=list.get(j);
					}
				}
			}
			
			
			//printing the 2darray
			for (int j = 0; j < list.size() - 1; j++)
			{
			
				for (int k = j + 1; k < list.size() - 1; k++) 
				{
						System.out.print( primeAnagram);
			
				}
				System.out.println();
			
			}
			
		}
				
	



}
