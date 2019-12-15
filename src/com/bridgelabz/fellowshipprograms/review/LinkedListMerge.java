package com.bridgelabz.fellowshipprograms.review;

import com.bridgelabz.fellowshipprograms.datastructure.Unorderlist.Node;
import com.bridgelabz.fellowshipprograms.utility.Utility;

public class LinkedListMerge 
{
	 static Node head;

		public static class Node
		{
			int data;
			Node next;
			Node(int data)
			{
		
			  this.data = data;
			   next = null;
			}
		}
		
		
		
		public  int size()
		{
			int size=0;
			if(head==null)
			{
				return size;
			}
			Node temp=head;
			while(temp!=null)
			{
				size++;
				temp=temp.next;
			}
			return size;
		}
		
		
		public  void display()
		{
			if(head==null)
			{
				System.out.println("no elements to display");
			}
			Node temp=head;
			while(temp!=null)
			{
				
				System.out.print(temp.data+"---->");
				temp=temp.next;
				
			}
			System.out.print("null");
			System.out.println();
			
			//Node head=
		}
		
		public  int insert()
		{
			
			Node newnode= new Node(Utility.IntegerInput());
			Node temp= head;
			if(head==null)
			{
				head= newnode;
				return newnode.data;
			}
		
				while(temp.next != null) {
					temp= temp.next;
				}
				
			temp.next=newnode;
			
			return newnode.data;
			
		}
		
		public  void limitInsert()
		{
			System.out.println("enter the size of list");
			int size=Utility.IntegerInput();
			System.out.println("enter the data you want to insert");
			while(size>0)
			{
				insert();  //no need of creating object to call the methods of the same class
				size--;
			}
		}
		
		
		public static void main(String[] args)
		{
			LinkedListMerge sll1=new LinkedListMerge();
			sll1.limitInsert();
			System.out.println("inserted elements are:");
			sll1.display();
			
			
			LinkedListMerge sll2=new LinkedListMerge();
			sll2.limitInsert();
			System.out.println("inserted elements are:");
			sll2.display();
			
			
		}
		
		//make the head static to merege the linkedlist from start

}
