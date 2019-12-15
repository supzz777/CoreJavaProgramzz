package com.bridgelabz.fellowshipprograms.review;


	//for string text inside the file 
	
	public class reverseLinkedList<T>
	{		Node straight;
		   Node head; 
		 int size=0;
		class  Node
		{   
	         T data;  
	         Node next;  
	  
	        public  Node(T data)
	        {  
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
	    
	    //display() will display all the nodes present in the list .In this no arguments are passed   
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
	        System.out.print(current.data+"---->Null");
	        System.out.println();
			return head;    
	    }  
	    
	    //method for printing the list by passing head as a argument to it
	    void printList(Node node) 
	    { 
	        while (node != null) 
	        { 
	            System.out.print(node.data + "----> "); 
	            node = node.next; 
	        } 
	        System.out.print("null");
	    }  
	    
	    
	    //simple reverse function for the linked list
	    public Node reversez(Node head)
	    {
	    	Node prev=null;
	    	Node next= null;
	    	Node current= head;
	    	
	    	while(current!=null)
	    	{
	    		next=current.next;
	    		current.next=prev;
	    		prev=current;
	    		current=next;
	    	}
	    	head=prev;
			return head;
	    	
	    	
	    	
	    }
	    
	    //reversing using the recursion method
	    Node reverse(Node node) // <---- node=head.
	    { 
	    	if(node.next==null)
	    	{
	    		head=node;
	    		return null ;
	    	}
	    	reverse(node.next);
	    	Node q=node.next;
	    	q.next=node;
	    	node.next=null;
	    	
	    	return node;
	    } 
	    
		public  Node findMiddleNode(Node head)
		{
			
			Node slowPointer=head;
			Node fastPointer=head; 
			
	 
			while(fastPointer !=null)
			{ 
				fastPointer = fastPointer.next; 
				if(fastPointer != null && fastPointer.next != null)
				{ 
					slowPointer = slowPointer.next; 
					fastPointer = fastPointer.next; 
				} 
			} 
	 
			return slowPointer; //it is the middle element of the list.
		}
		
		
	    
	    //function to check if the linked list is pallindrome or not
		public  boolean checkPalindrome (Node head)
		{
			// Find middle node using slow and fast pointer
			Node middleNode=findMiddleNode(head);
			// we got head of second part
			Node secondHead=middleNode.next;
			// It is end of first part of linked list
			middleNode.next=null;
			// get reversed linked list for second part
			Node reverseSecondHead=reversez(secondHead); //here link is reversed.
	 
			while(head!=null && reverseSecondHead!=null)
			{
				if(head.data==reverseSecondHead.data)
				{
					head=head.next;
					reverseSecondHead=reverseSecondHead.next;
					continue;
				}
				else
				{
					System.out.println("Not a pallindrome");
					return false;
				}
			}
			System.out.println("Is a pallindrome");
			return true;
	 
	 
		}
	    
	  
	    
    
    		public static void main(String args[])
    		{
	    	 
	    	 reverseLinkedList<Integer> sll = new reverseLinkedList<Integer>();
	    	 sll.add(12);
	    	 sll.add(20);
	    	 sll.add(123);
	    	 sll.add(20);
	    	 sll.add(12);
	    	 System.out.println("the linked list is:");
	    	sll.straight= sll.display();
	    	 
	    	 
	    	
	    	
	    	sll.reverse(sll.head); //list gets reversed
	    	
	    	
	    	System.out.println("the reverse linked list is:");
	    	 sll.printList(sll.head);//prints the list
	    	 System.out.println();
	    	 sll.checkPalindrome(sll.head);
	    	
	    	 
    		}
	
	}

