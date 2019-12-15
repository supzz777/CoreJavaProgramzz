
package com.bridgelabz.fellowshipprograms.review;


import com.bridgelabz.fellowshipprograms.utility.Utility;

public  class Individual2LinkedLists 
{
	
		public  Node head;

			  class Node
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
			
			
			public  Node display()
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
				
				return head;
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
				Individual2LinkedLists sll1=new Individual2LinkedLists();
				sll1.limitInsert();
				System.out.println("inserted elements are:");
				sll1.display();
				
				
				LinkedListMerge sll2=new LinkedListMerge();
				sll2.limitInsert();
				System.out.println("inserted elements are:");
				sll2.display();
				
				
			}
			
			//dont make the head static if you want 2 seperate linked list

	}


