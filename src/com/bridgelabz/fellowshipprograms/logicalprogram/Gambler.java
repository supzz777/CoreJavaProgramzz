package com.bridgelabz.fellowshipprograms.logicalprogram;
import java.lang.Math;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Gambler
{
	

		
		
		public static void main(String[] args)
		{

		System.out.println("Enter stake Price");
		int stake=Utility.IntegerInput();

		System.out.println("Enter stack Goal");
		int goal=Utility.IntegerInput();

		System.out.println("Enter trails");
		int trials=Utility.IntegerInput();
		
			
			int bets=0;
			int win=0;
			for(int i=0;i<trials;i++)
			{
				int cash=stake;
				while(cash>0 && cash<goal)
				{
					bets++;
					if(Math.random() > 0.5)
						cash++;
					else
				 cash--;
		
				}
			    if(cash==goal)
				win++;
		
		   }
			System.out.println( +win+ " wins of " +trials);
			System.out.println("Percentage of game won " +100 * win/trials);
			System.out.println("Average bets " +1.0 * bets/trials);

	       }

}




