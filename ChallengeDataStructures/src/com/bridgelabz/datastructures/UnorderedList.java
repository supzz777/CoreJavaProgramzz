package com.bridgelabz.datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;
import com.bridgelabz.datastructures.utility.Linkedlist;


public class UnorderedList
{
	
	/*private static Node head;
	static String size=null;
	class Node
	{  
        String data;  
        Node next;  
  
        public Node(String data) {  
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
    public static String size()
    {
    	return size;
    } 
    
    
    //method to delete the node with secific data
    public  void delete (String element)
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
    public  void addNode(String data)
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
    
    	//this method reads the context from the given file
  		public static String readString(String file)
  		{ String text=" ";
  			try
  			{
  				Scanner s= new Scanner(new File(file));
  				while(s.hasNextLine())
  				{
  					text+=s.next()+ " ";
  				} 
  				
  			}
  			catch (FileNotFoundException e)
  			{
  				System.out.println("file not found");
  			}
  			
  			return text;
  		}
  		
  		// this method will take string parameters from the given file and 
  		// will copy the context into the array of strings
  		
  		public static String[] storeArray(String file)
  		{
  			// step 1- counting the number of elements in the file
  			// step 2- creating the array with same no of elements and copying
  			//         the contents inside the array
  			
  			int count=0;
  			try
  			{
  				Scanner s1= new Scanner (new File(file)); 
  				while(s1.hasNextLine())
  				{
  					count++;
  					s1.next();
  				}
  				
  				String[] fileArray = new String[count];
  				
  				Scanner s2= new Scanner(new File(file));
  				for(int i=0;i<count;i++)
  				{
  					fileArray[i]=s2.next();
  				}
  				return fileArray;
  				 
  			}
  			catch (FileNotFoundException e)
  			{
  				System.out.println("File not found");
  			}
  			
  			return null;
  		}
  		

    
	public static void main(String args[]) throws IOException
		{
				//making object of linkedlistclass 
			Linkedlist<String> object= new Linkedlist<String>();
		
		
			String text= readString("/home/admin28/Desktop/FellowshipProgramsJavaSupzz/"
					+ "ChallengeDataStructures/UnorderedListOfStrings.text");
			System.out.println(text);
			
			String[] fileArray=storeArray("/home/admin28/Desktop/FellowshipProgramsJavaSupzz/"
					+ "ChallengeDataStructures/UnorderedListOfStrings.text");
			
			for(int i=0; i<fileArray.length;i++)
			{
				
				System.out.println(fileArray[i]);
				object.add(fileArray[i]);
			} 
			
			object.display(); 
			
			
			System.out.println("enter a string of your choice");
			String userInput= DataStructuresUtility.stringInput();
			for(int i=0;i<fileArray.length;i++)
			{
				if(userInput.equals(fileArray[i]))
				{
					object.delete(fileArray[i]);
				break;
				}
				else
			
					object.add(userInput);
					
					
				
				
			}
			
			
			
			object.display();
		}
	  
	
}
