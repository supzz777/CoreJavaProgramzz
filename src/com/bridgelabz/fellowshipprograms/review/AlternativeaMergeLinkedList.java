package com.bridgelabz.fellowshipprograms.review;


import com.bridgelabz.fellowshipprograms.utility.Utility;

public class AlternativeaMergeLinkedList
{
		 Node head;
		
		 private static class Node 
		 {
		       private  int data;
		     private   Node next;
		 
		        public Node(int data)
		        {
		            this.data = data;
		           next = null;
		        }
		    }
		 
	 

	    public  void add(Node head, int n)
	    {
	    	Node node= new Node(n);
	    	
	        while (head.next != null)
	        {	
	            head = head.next;
	        }
	        head.next = node;
	    }
	   

	    public  void display(Node head)
	    {
	       if(head==null)
	       {
	    	   return;
	       }
	       System.out.print(head.data+"---->");
	       display(head.next);
	    }
	 
	    static Node first;
		static Node second;
	    
	    public   void merging(Node node1, Node node2) 
	    {
	       
	    	 Node a,b;
	    	 first=node1;
	    	 second=node2;
	    	 
	    	 while(node1!=null && node2!=null)
	    	 {
	    		 a=node1.next;
	    		 node1.next=node2;
	    		 node1=a;
	    		 
	    		 b=node2.next;
	    		 node2.next=a;
	    		 node2=b;
	    	 }
	         
	        /* if (first == null)
	             return second;
	         else if (second == null)
	             return first;
	         else if (first.data %2==0) 
	         {
	             head = first;
	             head.next = merging(first.next, second);
	         } else
	         {
	             head = second;
	             head.next = merging(first, second.next);
	         }
	         return head;*/
	    	 second= node2;
	    }
	 
	    public static void main(String[] args)
	    {
   
    	AlternativeaMergeLinkedList sll = new AlternativeaMergeLinkedList();
 
    	System.out.println("enter the size  of array");
    	int size = Utility.IntegerInput();
    	System.out.println("enter array elements");
    	//creating array of user size
    	int[] data = new int[size];

    	for(int i=0;i<size;i++)
    	{
    		data[i]=Utility.IntegerInput();
    	}
    	
    	//inserting array into the linked list
        Node head = new Node(data[0]);
        for (int i = 1; i < data.length; i++)
        {
            sll.add(head, data[i]);
        }
        
        System.out.println("First List is : ");
        sll.display(head);
        
        System.out.println();
        
        
        System.out.println("enter the size  of 2nd array");
    	int size2 = Utility.IntegerInput();
    	System.out.println("enter 2nd array elements");

    	
    	int[] data2 = new int[size2];

    	for(int i=0;i<size2;i++)
    	{
    		data2[i]=Utility.IntegerInput();
    	}

    	
    	
        Node head2 = new Node(data2[0]);
        for (int i = 1; i < data2.length; i++)
        {
            sll.add(head2, data2[i]);
        }
        
        System.out.println("Second List is : ");
        sll.display(head2);
 
        System.out.println();
       
        System.out.println("Merged List is : ");
         sll.merging(head, head2);
        sll.display(first);
        sll.display(second);
         
	    }
    	
    	
	   /* public static void main(String[] args)
	    {
	    	AlternativeaMergeLinkedList sll=new AlternativeaMergeLinkedList();
	    	
    	int[] data1 = {1,3,5,9};
		Node head1 = new Node(data1[0]);
		for(int count = 1; count < data1.length; count++)
			sll.add(head1,data1[count]);
		
		System.out.printf("Linked list 1 is : ");
		sll.display(head1);
		
		int[] data2 = {2,4,5,6,10};
		Node head2 = new Node(data2[0]);
		for(int count = 1; count < data2.length; count++)
			sll.add(head2,data2[count]);
		
		System.out.printf("Linked list 2 is : ");
		sll.display(head2);
		
		Node mergedList = sll.merging(head1, head2);
		System.out.printf("Merged Linked list is : ");
		sll.display(mergedList);
       }*/
	    
    }
	 
	  
	 
	 
	 


