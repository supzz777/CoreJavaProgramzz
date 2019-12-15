package com.bridgelabz.datastructures.utility;

public class Node<E>
{
	public E data;
	public Node next;
	public Node previous;
	
	
	 
		
			
			
			
		//constructor of the Node class
		public Node()
		{
			this.next=null;
			this.previous=null;
		}
		//getter setter of above constructor
		public void setData(E data)
		{
		this.data=data;
		next=null;
		}
		
		
		
		//constructor
		public Node(E data)
		{
			this.data= data;
			this.next=null;
			this.previous=null;
		}
		
		//constructor
		public Node(Node previousNode, E data, Node nextNode)
		{
			this.data = data;
			next = nextNode;
			previous = previousNode;
		}
		//getter setter of above 2 constructors

		public E getData()
		{
			return data;
		}
		
		public Node getNextNode()
		{
			return next;
		}
		public Node getPreviousNode()
		{
			return previous;
		}
		public void setNextNode(Node node)
		{
			next = node;
		}
		public void setPreviousNode(Node node)
		 {
			 previous = node;
		 }


}




	
	
	
	
	
	
