package com.bridgelabz.fellowshipprograms.algorithm;

import java.util.Scanner;

public  class MergeSort
{
	
	String blank=" "; 
	int[] array;
	int[] tempMergeArray;
	int length;
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int[] inputarray= new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
			inputarray[i]=sc.nextInt();
		
		}	
		for(int i=0;i<size;i++)
		{
			System.out.print(inputarray[i]+" ,");		
		}	
		System.out.println(" sorted array using merge sort is:");
			MergeSort ms=new MergeSort();
			ms.sort(inputarray);
					
			  for(int i:inputarray)
			  {
				  System.out.print(i+" ,");
			  }
			
	
	}
	
	public void sort(int inputarray[])
	{
		this.array=inputarray;
		this.length=inputarray.length;
		this.tempMergeArray= new int[length];
		divideArray(0,length-1);
	}
	
	public void divideArray(int lowerindex, int higherindex)
	{
		if(lowerindex<higherindex)
		{
			int middleindex = ( lowerindex+higherindex ) / 2;
		
		divideArray(lowerindex,middleindex);
		divideArray(middleindex+1,higherindex);
		
		mergeArray(lowerindex,middleindex,higherindex);
		}
	}
	 
	public void mergeArray(int lowerindex,int middleindex,int higherindex)
	{
				for(int i=lowerindex;i<=higherindex;i++)
				{
					tempMergeArray[i]=array[i];
				}
			
			
			int i=lowerindex;
			int j=middleindex+1;
			int k=lowerindex;
			
			while(i<=middleindex &&j<=higherindex)
			{
				if(tempMergeArray[i]<=tempMergeArray[j])
				{
					array[k]=tempMergeArray[i];
					i++;
				}
				else
				{
		
					array[k]=tempMergeArray[j];
				   j++;
				}
				k++;
	       }
			
			while(i<=middleindex)
			{
				array[k]=tempMergeArray[i];
				
				k++;
				i++;
			}
	
      }	
	

}


