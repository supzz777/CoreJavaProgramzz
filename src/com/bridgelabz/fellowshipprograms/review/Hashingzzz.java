package com.bridgelabz.fellowshipprograms.review;
import java.util.ArrayList;
import com.bridgelabz.fellowshipprograms.utility.Utility;
public class Hashingzzz
{
	 
		static ArrayList<OrderLinKList> mList;

		public Hashingzzz()
		{
			mList=new ArrayList<OrderLinKList>();
		}

		public static void main(String args[])
		{
			Hashingzzz hashingFunction=new Hashingzzz();
			hashingFunction.putElementsInTheList();
			OrderLinKList orderLinKList;
			//System.out.println("Size is :"+hashingFunction.mList.size());
			while(true){
				System.out.println("Enter number to search");
				int number= Utility.IntegerInput();
				int reminder=number%11;
				try{
					orderLinKList=Hashingzzz.mList.get(reminder);
					boolean found=orderLinKList.search(new Integer(number));
					System.out.println((found)? "Words is found" : "Words is not found");

					if(found){
						try{
							orderLinKList.remove(new Integer(number));
							System.out.println(number+" is deleted.");
						}
						catch(Exception exception)
						{
							System.out.println("Error in deleting "+number);
						}
						
					}
					else{
						orderLinKList.add(new Integer(number));
						System.out.println("Number is add to the List at hasing reminder is "+reminder);
					}
				}
				catch(Exception exception){
					System.out.println("Exception occurs");
				}
				hashingFunction.printTheHashMap();
				System.out.println();
			}
		}

		public  void putElementsInTheList(){
			for(int i=0;i<11;i++)
				mList.add(new OrderLinKList<Integer>());
		}

		public  void printTheHashMap()
		{
			for(int i=0;i<11;i++)
			{
				System.out.print(i+" --> ");
				mList.get(i).print();
			}
		}
	

		
		public class Node<E>{

			private E data;
			public Node right;
			public Node left;

			public Node(E data){
				this.data=data;
				right=null;
				left=null;
			}

			public Node(E data,Node right,Node left){
				this.data=data;
				this.right=right;
				this.left=left;
			}

			public void setData(E data){
				this.data=data;
			}

			public E getData(){
				return data;
			}

		}
		
		
		public class OrderLinKList<E>{

			private Node head;
		    private Node tail;
		    private int size;


			//add elemnts to the link list.
			public void add(E item){
				Node temp = new Node(item, null, null);
				size++;
				if(head==null){
					head=temp;
					tail=temp;
				}
				else{
					Node trav=head;
					if(item instanceof Integer)
						while(trav!=null){
							if((Integer)trav.getData() > (Integer)item){
								//wants to add integer in between the number
								// 8 -> 10 and add 9
								temp.right=trav;
								temp.left=trav.left;
								if(trav.left!=null)
									(trav.left).right=temp;
								else
									head=temp;

								trav.left=temp;
								return;
							}	
							trav=trav.right;
						}// end of while loop
					if((Integer)item  > (Integer)tail.getData()){
						// Put elements last of the link list.
						temp.left=tail;
						tail.right=temp;
						tail=temp;
					}
					else{
						//Put the elemnts start of the link list.
						temp.left=null;
						temp.right=head;
						head=temp;
					}
				}
			}// end of the add function.

			//search method return true if elements found in the list otherwise return false.
			public boolean search(E item){
				if(head==null){
					return false;
				}
				else{
					Node trav=head;
					while(trav!=null){

						if(((Integer)trav.getData()).compareTo((Integer)item) == 0){
							return true;
						}
						trav=trav.right;
					}
					return false;
				}
			}

			//Remove the elemnts from the link list.
			public void remove(E item)throws Exception{
				if(head==null)
					throw new Exception();
				else{
					Node trav=head;
					while(trav!=null){
						if(((Integer)trav.getData()).compareTo((Integer)item) == 0){
							if(head==trav){
								(trav.right).left=head;
								head=head.right;
								size--;
								return;
							}
							else if(tail==trav){
								(trav.left).right=null;
								tail=tail.left;
								size--;
								return;
							}
							else{
								(trav.left).right=trav.right;
								(trav.right).left=trav.left;
								size--;
								return;
							}	
						}		
						trav=trav.right;
					}
					throw new Exception();
				}
			}

			//Return string of the link list.
			public String getLinkListString(){
				Node trav=head;
				String temp=new String();
				while(trav!=null){
					temp+=trav.getData()+" ";
					trav=trav.right;
				}
				return temp;
			}

			//return the size of tthe link list
			public int size(){
				return size;
			}

			//Print the link list
			public void print(){
				Node trav=head;
				while(trav!=null){
					System.out.print(trav.getData()+" ");
					trav=trav.right;
				}
				System.out.println();
			}
		}
	
	

}
