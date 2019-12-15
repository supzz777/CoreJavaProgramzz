package com.bridgelabz.datastructures.utility;

public class Queue<E> 
{
	

				
				static Node head;
				private int Queue[];
				protected int front, rear, size, length;
			
				public static class Node<E>
				{
					E data;
					
					Node next;
					
					public Node(E data)
					{
						this.data=data;
						next = null;
					} 
				}
				
				public Queue(int n) 
				{
					size = n;
					length = 0;
					Queue = new int[size];
					front = -1;
					rear = -1;
					
					}    
				
			
				public Queue()
				{
					
				}


				//method to add a new node inside the queue
				public static <E> void enqueue(E data)
				{
					Node ptr;
					Node node = new Node(data);
					if(head==null)
					{
						head = node;
					}
					else
					{
						ptr = head;
						while(ptr.next!=null)
						{
							ptr=ptr.next;
						}
						ptr.next=node;
					
					}
				}
				
				
				//method to remove the node from the queue
				public <E> E dequeue()
				{
					E data=null;
					if(!isEmpty())
					{
					Node ptr =head;
					data = (E) ptr.data;
					head = ptr.next;
					}else {
						System.out.println("Queue is Empty");
					}
					return data;
				}
				
				//method to check if the queue is empty or not
				public static boolean isEmpty()
				{
					if(head==null)
						return true;
					return false;
				}
				
				
				//method to add  node  from front side only of the queue
				public <E> void enqueueFront(E data)
				{
					Node ptr;
					Node node = new Node(data);
					if(head==null)
					{
						head = node;
					}else {
						ptr = head;
						
						ptr.next = ptr;
						head = ptr;
					}
				}
				
				
				
				//method to add node from the end side only of the queue
				public static <E> void enqueueRear(E data)
				{
					Node ptr;
					Node node = new Node(data);
					if(head==null)
					{
						head = node;
					}else {
						ptr = head;
						
						while(ptr.next!=null)
						{
							ptr=ptr.next;
						}
						ptr.next=node;
					}
				}
			
				
				
				
				//method to display the queue
				public static void printQueue()
				{
					if(!isEmpty())
					{
						Node ptr = head;
						
						while(ptr!=null)
						{
							System.out.print(ptr.data+" ");
							ptr= ptr.next;
						}
					}else {
						System.out.println("Queue is empty");
					}
				}
				
			
			//method to remove the node from front side only of the queue
				public static <E> E dequeueFront()
				{
					E data=null;
					if(!isEmpty())
					{
					Node ptr = head;
					data = (E) ptr.data;
					head = ptr.next;
					}else {
						System.out.println("Queue is empty");
					}
					return data;
				}
				
				
				//method to remove the node from the end side only of the queue
				public static <E> E dequeueRear()
				{
					E data=null;
					if(!isEmpty())
					{
						Node ptr = head;
						Node prevptr = ptr;
						while(ptr.next!=null)
						{
							prevptr = ptr;
							ptr=ptr.next;
						}
						data =(E) ptr.data;
						prevptr.next=null;
					}else {
						System.out.println("Queue is empty");
					}
					return data;
				}
				
				
				
				//method to search the node that has same data which is entered by the user in the queue 
				public <E> boolean search(E x)
				{
					Node temp = head;
					while(temp!=null)
					{
						if(temp.data.equals(x))
						{
							return true;
						}
						temp=temp.next;
					}
					return false;
				}

				
				//method to calculate the size of the queue
				public int size()
				{
					int count=0;
					Node ptr = head;
					
					while(ptr!=null)
					{
						count++;
						ptr= ptr.next;
					}
					return count;
				}
				
				
				
				  //main method
				public static void main(String[] args) 
				{
					
					Queue<Integer> queue = new Queue<Integer>();
					
				}
				
}







