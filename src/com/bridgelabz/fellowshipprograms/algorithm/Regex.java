package com.bridgelabz.fellowshipprograms.algorithm;




import java.io.IOException;
import java.util.*;

import com.bridgelabz.fellowshipprograms.utility.Utility;
public class Regex


{
	public static void main(String args[]) throws IOException
	{
		
		RegexUtility utility=new RegexUtility();
		UserDetails userDetails=new UserDetails();

		System.out.println("enter first name");
		userDetails.setfName(utility.inputWord());
		
		
		
		System.out.println("enter last name");
		userDetails.setlName(utility.inputWord());
		

		System.out.println("enter mobile number");
		userDetails.setmobileNo(utility.inputWord());
		
		
		//Setting Currrent date
		userDetails.setdate(utility.getFormatedDate(new Date()));
	

		System.out.println(utility.convertString(userDetails, utility.getFileText("/home/admin28/Desktop/supzz")));
	

		
	}

}



