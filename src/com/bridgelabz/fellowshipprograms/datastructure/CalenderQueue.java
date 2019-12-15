package com.bridgelabz.fellowshipprograms.datastructure;

import com.bridgelabz.fellowshipprograms.utility.Utility;
import com.bridgelabz.fellowshipprograms.utility.Utility.QueueLinkedList;

public class CalenderQueue
{
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter Year");
			int year = Utility.IntegerInput();
			System.out.println("please enter \n 1.Jan \n 2.Feb \n 3.Mar  \n 4.apr \n 5.may"
					+ "\n 6.jun \n 7.jul \n 8.aug \n 9.sept  \n 10.oct  \n 11.nov  \n 12.dec");
			
			System.out.println("Enter Month");
			int month =  Utility.IntegerInput();
			
			//create month array
			String[] months = {""," Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
			
			//create date array
			int[] days= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			if(month==2 && Utility.isLeapYear(year))
			{
				days[month] = 29;
			}
			
			System.out.println(" "+months[month]+ " ");
			System.out.println("S	M	T	W	Th	F	S");
			
			//starting day
			int d = Utility.dayOfWeek(month, 1, year);
			
			//putting calendar in queuelinkedlist
			QueueLinkedList<QueueLinkedList<Integer>> queue = new QueueLinkedList<QueueLinkedList<Integer>>();
			QueueLinkedList<Integer>refqueue = new QueueLinkedList<Integer>();
			
			for(int i=1;i<=days[month];i++)
			{
				refqueue.insert(i);
				if(((i+d)%7==0 ||i==days[month]))
				{
					queue.insert(refqueue);
					refqueue = new QueueLinkedList<Integer>();
					continue;
				}
			}
			
			for(int i=0;i<d;i++)
			{
				System.out.print("	");
			}
			for(int i=0;i<queue.getsize();i++)
			{
				QueueLinkedList<Integer>week=queue.remove();
				{
					for(int j=0;j<week.getsize();j++)
					{
						System.out.print(week.remove()+"\t");
					}
					System.out.println("	");
				}
			}
		
		
		
		}
	

}
