package com.bridgelabz.fellowshipprograms.JUnitTesting;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class sqrtofnonnegativenumber 
{
	
	 public static void main(String[] args)
	    {
	        System.out.println("Enter the positive Number");
	        double num=Utility.DoubleInput();
	        
	        
	        sqrt(num);

	        
	    }
		 public static void sqrt(double c)
		 {
			 double epsilon = 1e-15;   
		        double t = c;   
		 
		        if(c<0)
		        {
		        	System.out.println("please enter positive number");
		        	 double num1=Utility.DoubleInput();
		                 sqrt(num1);
		        }
		        else
		        {
		        	 while ((t - c/t) > epsilon*t) 
		 	        {
		 	            t = (c/t + t) / 2.0;
		 	        }
		 	       
		 	        System.out.println(t);
		 	        
		        }
		       
		 }

    
}
