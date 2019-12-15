package com.bridgelabz.fellowshipprograms.review;


import com.bridgelabz.fellowshipprograms.utility.Utility;
import com.bridgelabz.fellowshipprograms.utility.Utility.OrderedList;
public class HashingLinked 
{
				private  Node head;
			Node third;
			 private static class Node 
			 {
			        private int data;
			        Node next;
			 
			        public Node(int data)
			        {
			            this.data = data;
			            next = null;
			        }
			    }
			 
			 public static class HashingFunction
				{
				  	OrderedList[] list=new OrderedList[11];
				  	

				  	public  HashingFunction()
				  	{
				  		System.out.println("enter the size of array");
				  		
				  		int size=Utility.IntegerInput();
				  		
						int[] Array = new int[size];
						
						System.out.println("enter the elements in the array");
						
						for(int i=0;i<size;i++)
						{
							Array[i]=Utility.IntegerInput();
						}
						
						System.out.println("enter the elements of array are");
				  		
						
						for(int i=0;i<size;i++)
						{
							System.out.print(Array[i]+ " ,");
						}


						for(int i=0; i<Array.length; i++)
						{
							int rem = Array[i]%11;
							if(list[rem]== list[i])
							{
								list[rem] = new OrderedList();
								list[rem].insert(Array[i]);
							}
							
						}
						for(int i=0;i<11;i++)
						{
							System.out.print(i);
							if(list[i] !=null)
							{
								list[i].display();
							}
						}
					}
				} 
			 
			 
	

			    public static void main(String[] args)
			    {
			      	HashingFunction hs=new HashingFunction();
			    }
			
			    
			    

}
