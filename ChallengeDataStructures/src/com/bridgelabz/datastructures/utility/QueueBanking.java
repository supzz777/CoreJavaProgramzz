package com.bridgelabz.datastructures.utility;

// Java program to implement a queue using an array 
public class QueueBanking 
{ 
	  static Node head;
	  static int size;
	  
	  
	  //constructor
	  QueueBanking()
	  {
		  head=null;
		  size=0;
	  }
	  
	  //creating the node class
	  static class Node 
		{
			int acc_no;
		     String urname;
			float bal;
			Node next;

			public Node(int  acc_no,String urname,float bal) 
			{
				this.bal=bal;
				this.urname=urname;
				this.acc_no=acc_no;
				next = null;
			}

		}
	  
	  // to add the user inside the bank detail
	  public static void addUser(int  acc_no,String urname,float bal)
	  {
		  Node node= new Node(acc_no,urname,bal);
		  size++;
		  if(head==null)
		  {
			  head=node;
		  } 
		  else
		  {
			  Node temp=head;
			  while(temp.next!= null)
			  {
			  temp=temp.next;
			  }
			  
			  temp.next=node;
		  }
		  
		  System.out.println("account added successfully of "+node.urname);
	  }
	  
	  
	 // to show the list of customers of the bank
	  
	  public static void display()
	  {
		  Node temp= head;
		  if(size==0)
		  {
			  System.out.println("bank customers details is empty");
		  }
		  
		  while(temp!=null)
		  {
			  System.out.println(temp.urname+" ,"+temp.acc_no+" , "+temp.bal);
			  temp=temp.next;
		  }
		
	  }
	  
	  //to return the size of customers
	  
	  public static int size()
	  {
		  return size;
	  }
	  
	  //method to serach the given account
	  
	  public static void search(int enteredAcc_no)
	  {

	        if(head==null)
	        {
	        	System.out.println("Empty");
	        }
	        else 
	        {
		        	if(enteredAcc_no==head.acc_no)
		        	{
		        		transaction(enteredAcc_no);
		        	}
		        	else
		        	{
			        		Node temp= head;
			        		while(temp != null)
			        		{
			        			if (enteredAcc_no==temp.acc_no)
			    				{ 
			    					transaction(enteredAcc_no);			
			    				}
			        			else
			        			{
			        				  System.out.println("Invalid account no");
			        				  break;
			        			}
			    			
			    				temp = temp.next;
			        		}
			        		
			        		/* if(temp.acc_no==enteredAcc_no)
			    			 {
			    				 transaction(enteredAcc_no);
			    			 }*/
		        	}
		      
			       
	        }
	        
	        
	        
	  }

	public static void transaction(int enteredAcc_no)
	{
		 Node temp = head;
		 int ch;
		 int amount;
		 boolean response= true;
	             while(response)
	             {
	            	 System.out.println("select your choice of operation ");
	            	 System.out.println("1:deposit");
	            	 System.out.println("2:withdraw");
	            	 System.out.println("3:Exit");
            	     ch=DataStructuresUtility.integerInput();
            	     switch(ch)
            	     {
            	     case 1:   
			          		System.out.println("Enter amount");
            		  		amount=DataStructuresUtility.integerInput();
	            		    if(amount>0)
	            		    {
	            		    	temp.bal=temp.bal+amount;
	            		    	System.out.println("your amount is successfully deposited in your account");
	            		    	System.out.println("Your current balance is"+temp.bal);
	            		    }
	            		    else
	            		    	System.out.println("invalid amount");
	            		 break;
			          		 
			          		 
			          		 
            	     case 2:  
	            	    	 if(temp.bal<0)
			         		  	{
			          		  	   System.out.println("insufficient balance");	
			          		  	}
			          		  	else
			          		  	{
			          		  		System.out.println("Enter amount");
			          		  		amount=DataStructuresUtility.integerInput();
			          		  		if(amount>temp.bal || amount<=0)
			          		  		{
			          		  			System.out.println("invalid amount");
			          		  		}
			          		  		else
			          		  		{
			          		  			temp.bal=temp.bal-amount;
			          		  			System.out.println("please collect your money");
			          		  			System.out.println("Your balance is"+temp.bal);
			          		  		}
			          		  	}
			          		 break;
			            		 
            	     
            	     case 3:
					            		 response=false;
					            		 break;
            		 default:
	            			System.out.println("Enter proper choice");
            	     }
	             }
            	     
            System.out.println("Thankyou Bantai");	  
	}      	     
            	     
            	     
         //main class
		public static void main(String args[])
		{
			QueueBanking qb= new QueueBanking();
			qb.addUser(40000, "supzz" , 5000);
			qb.addUser(45000, "kumzz" , 10000);
			qb.addUser(34000, "sdfgjrew", 23990);
			qb.display();
		}
            	     
            	     
            	     
            	     
            	     
            	     
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
