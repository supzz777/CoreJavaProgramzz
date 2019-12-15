package com.bridgelabz.datastructures.utility;

public class StackCalender<T> 
{
	Node<T> head;
   	
   	public void add(Integer temp) 
   	{
   		Node<T> node = new Node(temp);
   		if(head==null)
   			head=node;
   		else
   		{
   			node.next=head;
   			head=node;
   		}
   	}  
   	
   	 
   	
   	public void display() 
   	{
   		Node<T> t=head;
   		int i=1;
   		while(t!=null) 
   		{ 
   			Integer value = (Integer) t.data;
   			if(!value.equals(-1))
   			{
   				if(value<10)
   					System.out.print(t.data+"  ");
   				else
   					System.out.print(t.data+" ");
   				
   				if(i%7==0)
   				System.out.println();
   			}
   			else
   			{
   				System.out.print("   ");
   			}
   			
   			t=t.next;
   			i++;
   			
   		}
   	}
   	
   	
   	public void remove()
   	{
   		Node<T> t=head;
   		head = t.next;
   	}
   

}
