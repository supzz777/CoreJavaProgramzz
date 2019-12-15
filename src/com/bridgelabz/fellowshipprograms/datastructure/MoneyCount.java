package com.bridgelabz.fellowshipprograms.datastructure;


import com.bridgelabz.fellowshipprograms.utility.Utility;
import com.bridgelabz.fellowshipprograms.utility.Utility.QueueDequeue;


public class MoneyCount
{
	public static void main(String args[])
	{ 
		
		Utility.QueueDequeue q= new Utility.QueueDequeue();
		
		int ch = 0;
		do
		{ 
			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3.Number of people in the Queue ");
		   	System.out.println("4.Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice: ");
		   	int choice=Utility.IntegerInput();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the amount you want to Deposit");
			   		int amountIn=Utility.IntegerInput();
				
				    q.insert(amountIn); 
			   		
			   		q.display();
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
					int amountOut=Utility.IntegerInput();
					
					
	
			   		System.out.println(" Your Available Balance is: "); 
			   		int topvalue= q.peek();
			   		int available = topvalue-amountOut;
			   		System.out.println(available);
			   		q.remove();
			   		
			   		break;
			case 3:
					int j=q.getSize();
					System.out.println("The Number of People in Queue is: "+j);	
					break;
		   	case 4:
			   		System.exit(0);
		   	default: 
			   		System.out.println("You entered wrong choice");
			   		break;
		   	}
		   	
	   	}while(ch<=5);
		
		
	}		

}
