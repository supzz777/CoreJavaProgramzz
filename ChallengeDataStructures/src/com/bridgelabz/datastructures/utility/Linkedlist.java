package com.bridgelabz.datastructures.utility;


	//for string text inside the file 
	
	public class Linkedlist<T>
	{
		private  Node head; 
		 int size=0;
		class Node
		{   
	        T data;  
	        Node next;  
	  
	        public Node(T data) {  
	            this.data = data;  
	            this.next = null;  
	        }  
	    }  
		
		
		 //checking whether the list is empty	     
	    public  boolean isEmpty()
	    {
	    	if(head==null)
	    	
	    		return true;
	    	return false;
	    	
	    	
	    }
	    //method returns the size of the list
	    public  int size()
	    {
	    	return size;
	    }
	    
	    
	    //method to delete the node with secific data
	    public  void delete (T element)
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
	    public  Node add(T data)
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
			return newNode;  
	    }  
	    
	    //display() will display all the nodes present in the list    
	    public Node display()
	    {    
	        //Node current will point to head    
	        Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	              
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current.next != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + "--->");    
	            current = current.next;    
	        } 
	        System.out.print(current.data);
	        System.out.println();
			return head;    
	    }   
	    
	    
	    //main method
	    public static void main(String[] args) 
	    {
			
		}
	        
	}


