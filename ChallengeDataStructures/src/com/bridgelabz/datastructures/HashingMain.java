
package com.bridgelabz.datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;
import com.bridgelabz.datastructures.utility.OrderedLinkedList;

public class HashingMain
		{
		
		
		
		private static int[] readNumbersConvertIntoArray(String file) 
		{
			
			try
			{
				File f= new File(file); 
				Scanner s= new Scanner(new File(file));
				int count=0;
				//counting the numbers present inside the file
				while(s.hasNextInt())
				{
					
					count++;
					s.nextInt();
				}
				//creating the array of same number
				int[] arrayOfNumbers =new int[count];
				Scanner s1= new Scanner(new File(file));
				for(int i=0;i<arrayOfNumbers.length;i++)
				{
					arrayOfNumbers[i]=s1.nextInt();
				}
				return arrayOfNumbers;
			}
			catch (FileNotFoundException e)
			{
				System.out.println("file not found");
			}
		return null;
	    }
		
			public static void main(String[] args)
			{   
				int arr[]= readNumbersConvertIntoArray("/home/admin28/Desktop/FellowshipProgramsJavaSupzz/"
						+ "ChallengeDataStructures/OrderedListOfNumbers"); //give function of read file to it.
				
				
	
				
				//he Object class is beneficial if you want to refer any object whose type you don't know
				Object obj[]=new Object[11];
				for(int i=0;i<11;i++)
				{ 
					obj[i]=new OrderedLinkedList();// array of linked list created
				}
            		int remainder=0;
		                		
        		//inserting array elements in the array of linked list
				for(int i=0;i<arr.length;i++)
				{
					remainder = arr[i]%11;
					OrderedLinkedList  list = (OrderedLinkedList )obj[remainder];
					list.add(arr[i]);
				}
				//displaying the array of linked list
				for(int i=0;i<obj.length;i++)
				{
					OrderedLinkedList  list = (OrderedLinkedList ) obj[i];
					System.out.print(i+": -->");
					list.displayz();
					System.out.println();
				}
				boolean p= true;
				while(p)
				{
					System.out.println("1:search number");
					System.out.println("2.exit");
					
					System.out.println("Enter 1 or 2");
					int number= DataStructuresUtility.integerInput();
					
				switch (number)
				{
				case 1:	System.out.println("Enter number you want search");
						int number1=DataStructuresUtility.integerInput();		
						OrderedLinkedList  list = (OrderedLinkedList ) obj[number1%11];
						if(list.search(number1))
						{
							System.out.println("Found at slot no : "+number1%11);
							list.deletez(number1);
							
								list.displayz();
							
							System.out.println(); 
						}
						else 
						{
							System.out.println("not found");
							OrderedLinkedList  list1= (OrderedLinkedList )obj[number1%11];
							 list1.add(number1);
			 					System.out.print(number1%11+": --->");
							 list1.displayz();
							 System.out.println();
						}
						
						break;
						
				case 2: p=false;
						System.out.println("out");
						for(int i=0;i<obj.length;i++)
						{
							OrderedLinkedList  list3 = (OrderedLinkedList ) obj[i];
							System.out.print(i+": -->");
							list3.displayz();
							System.out.println();
						}
						break;
						
						
				default: System.out.println("Invalid choice");
				}
				
				}
				
				
				
			}

		

	


}
