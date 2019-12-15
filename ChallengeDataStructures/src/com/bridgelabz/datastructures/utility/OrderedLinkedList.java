package com.bridgelabz.datastructures.utility;

import java.util.Arrays;





public class OrderedLinkedList 
{
	Node head;
	
	//method to get data from file
	public void getDataFromFile()
	{
		int[] array = new int[100];
		Arrays.sort(array);
		int size=array.length;
		
		for(int i=0;i<size;i++)
		{
			add(array[i]);
		}
		
	}
	// method to insert or add item and Node to the list
	public void add(int data) 
	{
		Node temp = head;
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			while(temp.next!=null)
			{
				temp= temp.next;
			}
			temp.next=node;
		}
		
	}
	
	//method to check if the list is empty or not
	public void isEmpty()
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
	}
	
	//method to display the list 
	public void display() 
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"---->");
			temp= temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
	}
	
	public void displayz() 
	{
		Node temp=head;

		if(temp==null) 
		{
		   
	       System.out.println("Empty");
	
		}
		while(temp!=null)
		{
			System.out.print(temp.data+"---->");
			temp= temp.next;
		}
		//System.out.print(temp.data);
		System.out.println();
	}
	
	//method to calculate the size of the list
	 public int size()
	 {
		 int count=0;
		 Node temp= head;
		 while(temp.next!=null)
		 {
			 count++;
			 temp= temp.next;
		 }
		 System.out.println("the length/ size of the list is "+count);
		 return count;
	 }
	
	 //method to delete data and respective node fromt he list
	
	public void delete(int position)
	{
		Node<Integer> temp= head;
		if(position==1)
		{
			head= head.next;
			System.out.println("After deleting the first node the list is:");
			display();
		}
		  
			for(int i=0;i<position;i++)
			{
				temp=temp.next;
			}
		
		temp.next=temp.next.next;
		System.out.println("After deleting the node at position "+position+" the list is:");
		display();
	}
	
	//method to delete the data from the list
	public<T>  void deletez(T number)
	   {
		Node ptr = head;
			Node prev = head;
			if(ptr.data==number) 
			{
				head = ptr.next;
		       
		
			}
			while(ptr!=null)
			{			
				if(ptr.data==number)
				{
					prev.next = ptr.next;
					
					
				}
				
			prev=ptr;
			ptr=ptr.next;
				
			
			}
			/*if(ptr.data==number)
			{
				if(ptr.next==null)
				{
					prev.next=null;	
					
			
				} 
			}*/
	   }
	
	
	//method to serach the node with respective data from the list
	
	public boolean search()
	{
		Node<Integer> temp=head;
		int count=0;
		System.out.println("enter the no you want to search");
		int number= DataStructuresUtility.integerInput();
		int flag=0;
		while(temp!=null)
		{
			
			if(temp.data==number)
			{
				 System.out.println(" number is found At "+count);
	                flag++;
	                break;
			}
			count++;
			temp=temp.next;
		} 
		 if(flag == 1)
	        {
	            delete(count);
	            System.out.println("After deleting data from the  List ");
	            display();
	            return true;
	        }
	        else
	        {
	            add(number);
	            System.out.println("After Adding a List ");
	            display();
	            return false;
	        }
				
	} 
	
	
	//search method with argument passed
	public boolean search(int number)
	{
		Node<Integer> temp=head;
		int count=0;
		
		int flag=0; 
		while(temp!=null)
		{
			
			if(temp.data==number)
			{
				 System.out.println(" number is found At "+count);
	                flag++;
	                break;
			}
			count++;
			temp=temp.next;
		} 
		 if(flag == 1)
	        {
			 	deletez(number);
	            System.out.println("After deleting data from the  List ");
	            displayz();
	            return true;
	        }
	        else
	        {
	        	  add(number);
		            System.out.println("After Adding a List ");
		            displayz();
		            return false;
	        }
				
	} 
	
	//main method
	 public static void main(String[] args)
	    {
	        OrderedLinkedList object = new OrderedLinkedList();
	        object.add(78);
	        object.add(76);
	        object.add(88);
	        object.add(98);
	        object.add(90);
	        object.add(34);
	        
	        //object.getDataFromFile();
	        object.display(); 
	     //  object.size();
	       
	       //object.delete(3);
	    //   object.add(54);
	       //object.display();
	     
	        object.search();
	    }
	
	
	
	
}
