package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;
import com.bridgelabz.datastructures.utility.Linkedlist;



public class OrderedList
{
	/*	private static Node head;
		static int size=0;
		class Node
		{  
	        int data;  
	        Node next;  
	  
	        public Node(int data) {  
	            this.data = data;  
	            this.next = null;  
	        }  
	    }  
		
	
			 //checking whether the list is empty	     
		    public static boolean isEmpty()
		    {
		    	if(head==null)
		    	
		    		return true;
		    	return false;
		    	
		    	
		    }
		    //method returns the size of the list
		    public static int size()
		    {
		    	return size;
		    }
		    
		    
		    //method to delete the node with secific data
		    public  void delete (int element)
		    {
		    	 // Store head node 
		        Node temp = head, prev = null; 
		  
		        // If head node itself holds the key to be deleted 
		        if (temp != null && temp.data == element) 
		        { 
		            head = temp.next; // Changed head 
		            return; 
		        } 
		  
		        // Search for the key to be deleted, keep track of the 
		        // previous node as we need to change temp.next 
		        while (temp != null && temp.data != element) 
		        { 
		            prev = temp; 
		            temp = temp.next; 
		        }     
		  
		        // If key was not present in linked list 
		        if (temp == null) return; 
		  
		        // Unlink the node from linked list 
		        prev.next = temp.next; 
		    	
		    }
		    
		    //method to  add a new node to the list  
		    public  void addNode(int data)
		    {  
		        //Create a new node  
		        Node newNode = new Node(data);  
		  
		        //Checks if the list is empty  
		        if(head == null) 
		        {  
		            //If list is empty, both head and tail will point to new node  
		            head = newNode;  
		            newNode.next=null;
		        } 
		        
		        else 
		        {  
		          Node temp= head;
		          while(temp.next!=null)
		          {
		        	  temp=temp.next;
		        	 
		          }
		          temp.next=newNode;
		        }  
		    }  
    
		    //display() will display all the nodes present in the list    
		    public void display() {    
		        //Node current will point to head    
		        Node current = head;    
		            
		        if(head == null) {    
		            System.out.println("List is empty");    
		            return;    
		        }    
		        System.out.println("Nodes of singly linked list: ");    
		        while(current != null) {    
		            //Prints each node by incrementing pointer    
		            System.out.print(current.data + "--->");    
		            current = current.next;    
		        }    
		        System.out.println();    
		    }    
		        */
			 
			
	
	
	//method to read the numbers from the file
	
	//this method reads the numbers from the given file and 
		// convert them into the array
			public static int[] readNumbersConvertIntoArray(String file)
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
			
			//Main method

		public static <T> void main(String args[]) throws IOException
		{
				 
				
				Linkedlist<Integer> object= new Linkedlist<Integer>();
			
			
				int[] num= readNumbersConvertIntoArray("/home/admin28/Desktop/FellowshipProgramsJavaSupzz/"
						+ "ChallengeDataStructures/OrderedListOfNumbers");
				//method 1- for displaying the array
				System.out.println(Arrays.toString(num));
				//method 2- for displaying the array
				System.out.println("elements inside the array are");
				for(int i=0;i<num.length;i++)
				{
					System.out.println(num[i]);
					object.add(num[i]); //inserting elements into the list
					
				}
				//displaying the whole linked list
				object.display();
				
				//taking the number from the user and deleting it if presemt 
				//and adding it to the list if not present
				System.out.println("enter number you want to search");
				int search=DataStructuresUtility.integerInput();
			 for(int i=0;i<num.length;i++)
			 {
				 if(search==num[i]) 
				 {
					 object.delete(num[i]);
					 
				 }  
				 else
				 {
					 object.add(search);
					
				 }
			
			 }
			
			 object.display();
			 
			 
		}

}
