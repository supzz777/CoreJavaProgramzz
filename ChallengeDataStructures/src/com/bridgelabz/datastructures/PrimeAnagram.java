package com.bridgelabz.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class PrimeAnagram 
{
	//method to check if the given number is prime or not
	public static boolean isPrime(int num)
	{
		for (int i = 2; i <= num / 2; i++) 
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static Boolean anagramCheck(int number1, int number2) 
	{
		//converting number to strings
		String numberToString1 = Integer.toString(number1);
		String numberToString2 = Integer.toString(number2);
		boolean status = true;
		
		//checking if the length of the strings are equal or not
		if (numberToString1.length() != numberToString2.length()) 
		{
			status = false;
			// System.out.println("false");
		}
		else 
		{
			//first sorting and then comapring them with each other
			char[] ArrayS1 = numberToString1.toCharArray();
			char[] ArrayS2 = numberToString2.toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2); //array.equals function returns answer in boolean type
		}
		if (status) 
		{
			// System.out.println(number1 + " and " + number2 + " are
			// anagrams");
			return true;
		} else 
		{
			// System.out.println(number1 + " and " + number2 + " are not
			// anagrams");
			return false;
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		 //it creates the mutable list of array
		//mutable means you can change the content inside the without changling their identity.
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listanagram = new ArrayList<Integer>();
		
		//loop to check prime between 0-1000
		for (int i = 0; i < 1000; i++) 
		{
			if (isPrime(i))
			{
				list.add(i);
			}
		}
		System.out.println("prime numbers are:" + list);
		System.out.println("Total number of prime numbers are:" + list.size());
		
		
		System.out.println();
		
		
		//another loop to store prime numbers which are anagram in nature
		
	
		for (int j = 0; j < list.size() - 1; j++)//this stores only prime nos
		{
			for (int k = j + 1; k < list.size() - 1; k++) //another loop to store prime and compare
			{
				if (anagramCheck(list.get(j), list.get(k))) //checks if the prime numbers are anagram or not
				{
					listanagram.add(list.get(j));
				}
			}
		}
		System.out.println("\nPrime and Anagram numbers are :" + listanagram);
		//System.out.println("Total number of anagram numbers are :" + listanagram.size());
	}



}
