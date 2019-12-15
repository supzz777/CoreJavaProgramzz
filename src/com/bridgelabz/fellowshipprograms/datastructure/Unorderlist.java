package com.bridgelabz.fellowshipprograms.datastructure;


import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;
import com.bridgelabz.fellowshipprograms.utility.Utility.Unorderlist.Node;

public class Unorderlist
{
	
		
		/******Data Structure Programs******/
		  /*****Unorderd list using Generics*****/


		static Node head;

		public static class Node
		{
		String data;
		Node next;
		Node(String data2)
		{

		   data = data2;
		next = null;
		}
		}

		/*****Code for Inserting a Node*****/

		   public static String insert(String data)
		{
		Node new_node=new Node(data);
		new_node.next=null;
		if(head==null)
		{
		head=new_node;
		}
		else
		{
		Node p=head;
		while(p.next!=null)
		{
		p=p.next;
		}
		p.next=new_node;


		}
		return null;
		}
		   
		   /*****Code for Inserting a Node at the Beginning*****/
		   
		   public static String inserAtBeg(String data)
		{
		Node new_node=new Node(data);
		if(head==null)
		{
		return data;
		}
		else
		{
		head=new_node;
		new_node.next=null;
		}
		return data;
		}
		   
		   /*****Code for Inserting a Node at the given Position*****/
		   
		   public static String insertAtPosition(String data,int position)
		{
		//int size=p.length();
		Node new_node=new Node(data);
		Node p=head;
		if(position==1)
		{
		head=new_node;
		new_node.next=null;
		return data;
		}
		for(int i=0;i<position-1 && p!=null;i++)
		{
		p=p.next;
		}
		new_node.next=p.next;
		p.next=new_node;

		return data;
		}

		       /*****Code for Removing the Duplicate Element*****/
		   
		   public static void removeDuplicate()
		   {  
		       
		       Node p= head;
		       Node index = null;
		       Node temp = null;  
		 
		       if(head == null)
		       {  
		           return;  
		       }  
		       
		       else
		       {  
		         
		       while(p!= null)
		          {  
		              temp = p;  
		              index = p.next;  
		 
		       while(index != null)
		       {  
		                   
		       if(p.data == index.data)
		         {  
		     
		      temp.next = index.next;  
		     
		        }
		     
		         else
		         {  
		            temp = index;  
		                   }  
		                   index = index.next;  
		               }  
		               p = p.next;  
		           }  
		       }  
		   }  
		   
		   /*****Code for deleting an Element directly*****/
		   
		   public static void delete(String key)
		   {
		       // Store head node
		       Node p = head;
		        Node prev = null;
		 
		       // If head node itself holds the key to be deleted
		       if (p != null && p.data == key)
		       {
		           head = p.next; // Changed head
		           return;
		       }
		 
		       // Search for the key to be deleted, keep track of the
		       // previous node as we need to change temp.next
		       while (p != null && p.data != key)
		       {
		           prev = p;
		           p = p.next;
		       }    
		 
		       // If key was not present in linked list
		       if (p == null) return;
		 
		       // Unlink the node from linked list
		       prev.next = p.next;
		   }
		   
		   /*****Code for Deleting the Node at given position*****/
		   
		  public void deleteNode(int position)
		   {
		       if (head == null)
		           return;
		 
		     
		       Node p = head;
		 
		       
		       if (position == 0)
		       {
		           head = p.next;  
		           return;
		       }
		 
		       
		       for (int i=0; p!=null && i<position-1; i++)
		           p = p.next;
		 
		       // If position is more than number of ndoes
		       if (p == null || p.next == null)
		           return;
		 
		      Node next = p.next.next;
		 
		       p.next = next;  
		   }
		   
		   /*****Code for Seraching an Element
		    * @return *****/
		   
		   public static  String search(String x)
		   {
		boolean flag=false;
		       Node p = head;    
		       if(head==null)
		       {
		        System.out.println("List is Empty");
		       }
		       while (p != null)
		       {
		           if (p.data == x)
		              flag=true;  
		     
		           p = p.next;
		       }
		      if(flag)
		       {
		        System.out.println("Data is Present");
		        delete(x);
		       
		       }
		       else
		       {
		        System.out.println("Not Present");
		        insert(x);
		       }
		return x;
		       

		   }

		/*****Code to Find the Length of the LinkedList*****/
		   
		   
		public static int length()
		{
		int count=0;
		if(head==null)
		{
		return 0;
		}
		else
		{

		Node p=head;
		while(p!=null)
		{
		p=p.next;
		count++;
		}
		}
		return count;
		}

		      /*****Code to Display the linkedlist*****/

		public static void  display()
		{
		Node p=head;
		while(p!=null)
		{
		System.out.println(p.data+ "\t");
		p=p.next;
		}
		System.out.println();
		}


	  		



	     public static void main(String args[]) throws IOException
		 {
	    	 Utility.Unorderlist  list = new  Utility.Unorderlist();
	    	 
	    	 System.out.println("enter the elements in the list");
				list.insert(Utility.StringInput());
				list.insert(Utility.StringInput());
				list.insert(Utility.StringInput());
				list.insert(Utility.StringInput());
			 System.out.println(" elements in the list are");
				list.display();
			
			System.out.println("search the  element you want");
				
				list.search(Utility.StringInput());
				
				list.display();
	
		}
}

