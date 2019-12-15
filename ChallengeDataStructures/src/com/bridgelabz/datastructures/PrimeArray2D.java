package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.utility.DataStructuresUtility;

public class PrimeArray2D
{
	
	
	public static void main(String args[])
	{
	 int row=10;        //1000/10
	 int coloumn=30;
	
		int ar[] = DataStructuresUtility.PrimeNumberInTo1DArray(1000);
		int primeArray[][] = DataStructuresUtility.PrimeNumberInTo2DArray(ar, row, coloumn);
		 int nextLine= 97; //last prime no of first row
		
		
		for (int i = 0; i < row; i++)  
		{
			for (int j = 0; j < coloumn; j++) 
			{
				if (primeArray[i][j] != 0)
					System.out.print( + primeArray[i][j]+" , "  );
				if (nextLine < primeArray[i][j])
				{
					nextLine = nextLine + 100;
					System.out.println();
				}
		
			}
  
		}

	}

}
