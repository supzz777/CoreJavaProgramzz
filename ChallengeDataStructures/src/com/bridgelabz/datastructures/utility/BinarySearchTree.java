package com.bridgelabz.datastructures.utility;

public class BinarySearchTree
{
	Node root;
	//creating class which contains the root element the left child and the right child
		public class Node
		{
			int data;
			Node right;
			Node left;
			
			
			//Node constructor    
			public Node(int data)
			{ 
				this.data= data;
				Node right= null;
				Node left= null;
				
			}
		}
		
		//method to calls insertrepeat data
		public void insert(int data)
		{
			root= insertRepeat(root,data);
		}
		
		
		//method to insert data inside the tree
		public Node insertRepeat(Node root, int data) 
		{
			if(root==null)
			{
				root= new Node(data);
				return root;
			}
			//if data is less than root insert it in left
			if(data<root.data)
			{
				root.left= insertRepeat(root.left,data);
			}
			//or else insert the data in the right 
			else if(data>root.data)
			{
				root.right= insertRepeat(root.right,data);
			}
			
			return root;
		}
	
		//method for inorder traversal of the binary tree
		 public    void inorder() 
 	    { 
 	       inorderRepeat(root); 
 	    }


		public void inorderRepeat(Node root) 
		{
			if(root!=null)
			{

	            inorderRepeat(root.left); 
	            System.out.println(root.data); 
	            inorderRepeat(root.right); 
	            
			}
			
		} 
		
		//method to find unique no of binary trees that can be created using given nodes
		
		public int noOfBST(int n)
		{
			int noofBST[]= new int[n+1];
			
			
			noofBST[0]=1; 
			noofBST[1]=1;
			  for (int i = 2; i <= n; i++)  //no of elements or nodes in the BST
	    	    { 
	    	        for (int j = 1; j <= i; j++)  //making each element  as root node of the BST
	    	        { 
	    	  
	    	            // n-i in right * i-1 in left 
	    	        	noofBST[i]  +=  (noofBST[i-j ] *  noofBST[j - 1]); 
	    	        			
	    	        } 
	    	    } 
	    	  
	  			return noofBST[n ]; 
	    }
		
		//main method
		public static void main(String args[])
		{
			BinarySearchTree bst= new BinarySearchTree();
			System.out.println("enter no of nodes");
			int number= DataStructuresUtility.integerInput();
			
			System.out.println("unique BSTz of provided "+number+" nodes are");
			System.out.println(bst.noOfBST(number));
			
		}

}
