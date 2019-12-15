package com.bridgelabz.fellowshipprograms.logicalprogram;
import java.util.*;

public class CouponNumbers
{
	public static void main(String[] args) 
	{

		HashSet<String> hs=new HashSet<String>();
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char[] c=s.toCharArray();
		Random random=new Random();
		String s1="";
		for(int i=0;i<10;i++) // for 10 coupon numbers
		{
			for(int j=0;j<7;j++) // for 10 coupon digits
			{
				char chars=c[random.nextInt(c.length)];
				s1=s1+chars;
			}
			hs.add(s1);
			s1="";
		}
		// for printing the coupon numbers
		Iterator itr=hs.iterator();
		int i=1;
		while(itr.hasNext())
		{
			System.out.println("Coupen"+i+" :"+itr.next());
			i++;
		}
	}
}
