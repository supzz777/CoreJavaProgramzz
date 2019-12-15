package com.bridgelabz.datastructures;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;
import com.bridgelabz.datastructures.utility.Queue;
import com.bridgelabz.datastructures.utility.Stack;

public class PrimeAnnagramStack
{
	public static void main(String[] args)
	{

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listAnagram = new ArrayList<Integer>();

		for (int i = 0; i < 1000; i++) {
			if (DataStructuresUtility.isPrime(i)) {
				list.add(i);
			}
		}
		
		System.out.println("prime numbers are:" + list);
		//System.out.println("Total number of prime numbers are:" + list.size());

		for (int j = 0; j < list.size() - 1; j++) 
		{
			for (int k = j + 1; k < list.size() - 1; k++)
			{
				if (DataStructuresUtility.anagramChecker2(list.get(j), list.get(k))) {
					listAnagram.add(list.get(j));
				}
			}
		}

		System.out.println("\nAnagram numbers are :" + listAnagram);
		//System.out.println("\nTotal number of anagram numbers are :" + listAnagram.size());
		//Queue operations 
		
		
		Stack stack = new Stack(listAnagram.size());
		
		for (int i = 0; i < listAnagram.size() ; i++)
		{
			stack.push(listAnagram.get(i));
			stack.displayi();
			
		}
	
		
		
		

		
		
	}


}
