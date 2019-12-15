package com.bridgelabz.fellowshipprograms.datastructure;


import com.bridgelabz.fellowshipprograms.utility.Utility;

public class BinarySearchTree 
{
	
	public static void main (String[] args)  
	{ 
		Utility.BinarySearchTree tree = new Utility.BinarySearchTree();
      
		System.out.println("enter the no of key nodes");
	    int n = Utility.IntegerInput(); 
	    System.out.println("enter the elements one by one");
	    for(int i=0;i<n;i++)
	    {
	    	tree.insert(Utility.IntegerInput()); 
	    }
	    tree.inorder(); 
	    
	    System.out.println("Number of structurally " +  
	                           "Unique BST with "+ n + 
	                                  " keys are : " +  
	                                  Utility.BinarySearchTree.numberOfBST(n)); 
	} 
	

}
