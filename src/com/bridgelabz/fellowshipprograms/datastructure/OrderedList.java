package com.bridgelabz.fellowshipprograms.datastructure;

import java.io.IOException;

import com.bridgelabz.fellowshipprograms.utility.Utility;
import com.bridgelabz.fellowshipprograms.utility.Utility.OrderedList.Node;

public class OrderedList<P>
{
	

	
			static Node head;
			
			public static class Node
			{
				int data;
				Node next;
				Node(int d)
				{
					  data = d;
						next = null;
				 
				}
			}

				/*****Code for Inserting a Node*****/

	    public static int insert(int data)
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
	return data;
	
	}

/*****Code for Inserting a Node at the Beginning*****/
	   
	    public static int inserAtBeg(int data)
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

		    public static int insertAtPosition(int data,int position)
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
   
    public static void delete(int key)
    {
       
        Node p = head;
         Node prev = null;
 
       
        if (p != null && p.data == key)
        {
            head = p.next;
            return;
        }
 
       
        while (p != null && p.data != key)
        {
            prev = p;
            p = p.next;
        }    
 
       
        if (p == null) return;
 
       
        prev.next = p.next;
    }
   
    /*****Code for Deleting the Node at given position*****/

	   public static void deleteNode(int position)
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

	   	/*****Code for Seraching an Element*********/


	    public static  int search(int x)
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


		public  static int length()
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
				/*****Code to Sort the LinkedList*****/
	    public void sortList()
	    {  
	       
	        Node p = head;
	        Node index = null;  
	        int temp;  
	         
	        if(head == null)
	        {  
	            return;  
	        }  
	        else
	        {  
	            while(p != null)
	            {  
	               
	                index = p.next;  
	                 
	                while(index != null)
	                {  
	                   
	                    if(p.data > index.data)
	                    {  
	                        temp = p.data;  
	                        p.data = index.data;  
	                        index.data = temp;  
	                    }  
	                    index = index.next;  
	                }  
	                p = p.next;  
	            }      
	        }  
	    }
	    
	    
	    
	
	 public static void main(String args[]) throws IOException
	  {
		 OrderedList list = new OrderedList();
			
		 System.out.println("enter the elements");
			list.insert(Utility.IntegerInput());
			list.insert(Utility.IntegerInput());
			list.insert(Utility.IntegerInput());
			list.insert(Utility.IntegerInput());
			list.display();
			 System.out.println("search the element");
			list.search(Utility.IntegerInput());
			list.display();
			
			 System.out.println("sorted list is");
			list.sortList();
			list.display();

	}
	
}
