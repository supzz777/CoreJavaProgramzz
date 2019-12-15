package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class SwapNibblesOfBinary
{

	public int swapNibbles(int x)
	{
		/*logic behind under written statment is :
		 * ( (x & 0X0F)<<4 | (x & 0XF0)>>4) )
		 * (x & 0X0F) = x is given number by user and 0x is nothing it is just a suffix and 0F= 0000 1111
		 * <<4= left shit
		 * 
		 *  (x & 0XF0)=  x is given number by user and 0x is suffix and F0= 1111 0000
		 *  >>4 = right shift
		 *  
		 *  
		 *  Example--> x= 33  decimal no of 33= 0010 0001
		 *  
		 *     			(x & 0X0F)= 0010 0001 && 0000 1111 = 0000 0001
		 *    			 (x & 0X0F)<<4 = 0001 0000 (the number is shifted to left side by 4 places)
		 *    
		 *    				 (x & 0XF0) = 0010 0001 && 1111 0000 = 0010 0000
		 *     				(x & 0XF0)>>4) = 0000 0010
		 *     
		 *  ( ( (x & 0X0F)<<4)| (x & 0XF0)>>4) ) = 0001 0000 || 0000 0010 = 0001 0010 (answer)=18
		 *  hence 33= 0010 0001  and 18 =  0001 0010   (their binary numbers are excatly reverse of each other )
		 *     
		 * */
		
		return((x & 0X0F)<<4 | (x & 0XF0)>>4);
	}
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		int b=Utility.IntegerInput();

		System.out.println(b);
		SwapNibblesOfBinary sn=new SwapNibblesOfBinary();
		int c=sn.swapNibbles(b);
		System.out.println(c);
		int cnt=0;
		for(int i=0;i<=10;i++)
		{
			if(c==Math.pow(2, i))
			{
				cnt++;

			}


		}
		if(cnt==1)
		{
			System.out.println(c+" is power of 2");
		}
		else
		{
			System.out.println(c+" is not the power of 2");
		}

	}
	
	
	
}
