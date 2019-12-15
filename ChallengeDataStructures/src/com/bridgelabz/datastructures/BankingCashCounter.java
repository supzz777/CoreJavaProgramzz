package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;
import com.bridgelabz.datastructures.utility.QueueBanking;

public class BankingCashCounter 
{
	public static void main(String args[])
	{ 
		Scanner sc= new Scanner(System.in);
		
		int accNo;
		float balance;
		String Urname;
		
		System.out.println("how many customers you want to add to your bank database");
		int number= DataStructuresUtility.integerInput();
		
			for(int i=1;i<=number;i++)
			{   
				System.out.println("Enter Account number ");
				accNo=DataStructuresUtility.integerInput();
				if(accNo<0)
				{   System.out.println("Please Enter possitive number");
					System.out.println("Enter account Number");
					accNo=DataStructuresUtility.integerInput();
				}
				
				System.out.println("Enter User Name"); 
				Urname = sc.nextLine();
				
				System.out.println("Enter Balance ");
				balance=DataStructuresUtility.floatInput();
				QueueBanking.addUser(accNo, Urname, balance);	
				
			}
			QueueBanking.display();
			System.out.println();
			System.out.println("any account to be seached?");
				System.out.println("Enter the Account Number");
				int acc=DataStructuresUtility.integerInput();
				QueueBanking.search(acc);
	}
	

}
