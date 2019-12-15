package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.utility.BinarySearchTree;
import com.bridgelabz.datastructures.utility.DataStructuresUtility;

public class NoOfBinaryTrees 
{
	public static void main(String args[])
	{
		BinarySearchTree bs= new BinarySearchTree();
		System.out.println("enter the no of nodes you want to provide to make your binary tree:");
		int number= DataStructuresUtility.integerInput();
		System.out.println("enter"+number+" elements one after the other");
		for(int i=0;i<number;i++)
		{
			bs.insert(DataStructuresUtility.integerInput());  
			
		}
		bs.inorder();
		System.out.println("the uniquely structured binary "
				+ "trees you can make from "+number+"nodes is:"+bs.noOfBST(number));
	}

}
