package com.bridgelabz.fellowshipprograms.basiccore;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class FlipCoin 
{
		public static void main(String args[])
		{
			int headcount=0;
			int tailcount=0;
			int flipcount=0;
			int choice;
			
			do 
			{
				System.out.println("enter the choice 1 for fliping and 0 to exit");
				choice= Utility.IntegerInput();
					if(choice==1) 
					{	
						double result = Math.random();
						if(result >0.5)
						{
							System.out.println("tail");
							tailcount++;
							flipcount++;
							System.out.println("tail count is:"+tailcount);
							System.out.println("flip count is:"+flipcount);
						}
						else
						{
							System.out.println("head");
							headcount++;
							flipcount++;
							System.out.println("head count is:"+headcount);
							System.out.println("flip count is:"+flipcount);
						}
						
					}
					else if(choice>1)
					{
						System.out.println("invalid choice please enter 0 or 1");
						 choice= Utility.IntegerInput();
					}
					
			}while(choice!=0);
			
			
			System.out.println("percentage of tail flipped is :");
			
			double tailpercentage= tailcount/flipcount *100;
			
		
			
			
			System.out.println(tailpercentage);
			
			
			System.out.println("percentage of head flipped is :");
			
			double headpercentage= (headcount/flipcount) *100;
			
			System.out.println(headpercentage);
		
		}
}
