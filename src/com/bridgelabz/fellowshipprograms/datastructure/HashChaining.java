package com.bridgelabz.fellowshipprograms.datastructure;

import java.io.File;
import java.io.PrintStream;

import com.bridgelabz.fellowshipprograms.utility.Utility.HashChaining.Node;

public class HashChaining<T>
{
		
			
				public class Node<T>
				{
						public Node<T> next;
						public T data;
						public Integer key;
						public Node(T data) 
						{
							this.data=data;
						}
						public Node(Integer key, T data)
						{
							this.key=key;
							this.data=data;
						}
				}
		
				public Node[] table;
				public int size;
				Node head;
			
			
			public void HashChaining(int Size)
			{
				table = new Node[Size];
				size=0;
			}
			
			public boolean isEmpty() {
				return size==0;
			}
			
				public  void insert(int val)
				{
					size++;
					int pos=myhash(val);
					Node n = new Node(val);
					if(table[pos]==null)
						table[pos]=n;
					else
					{
						n.next=table[pos];
						table[pos]=n;
					}
				}

				public void remove(int val)
				{
						int pos = myhash(val);
						Node temp = table[pos];
						Node previous = null;
						Integer t = (Integer) temp.data;
						if(temp.data.equals(temp)) 
						{
							head = temp.next;
							return;
						}
						while(temp!=null)
						{
							t = (Integer) temp.data;
							if(t.equals(val))
								break;
							else
								previous = temp;
							temp=temp.next;
						}
						previous.next = temp.next;
				}
				
				public int myhash(int value) 
				{
					int hashVal=value;
					hashVal = hashVal % table.length;
					return hashVal;
				}
			
				public void display() {
					for(int i=0;i<table.length;i++) {
							System.out.print(i+" : ");
						Node t = table[i];
						while(t!=null) {
							System.out.print(t.data+" ");
							t=t.next;
						}
							System.out.println();
					}
				}
			
				public void write() throws Exception
				{
					try { PrintStream o = new PrintStream(new File("/home/admin28/Desktop/FellowshipProgramsJavaSupzz/"
							+ "ChallengeDataStructures/OrderedListOfNumbers"));
					System.setOut(o);
					for(int i=0;i<table.length;i++) {
						System.out.print(i+" : ");
						Node t =table[i];
					while(t!=null) {
						System.out.print(t.data+" ");
						t=t.next;
					}
					System.out.println();
					}
					}catch(Exception e) {
						System.out.println("file not found");
					}
				}
			
			public  boolean search(int value)
			{
					int pos = myhash(value);
					Integer data = value;
					int c=0;
					Node t = table[pos];
					while(t!=null) 
					{
						if(t.data.equals(data))
						{
							c++;
							break;
						}
						t=t.next;
					}
					if(c>0)
					{
						System.out.println("File found at table position "+pos+"\nfile removed");
						remove(value);
						return true;
					}
					else 
					{
						System.out.println("File not found\nfile added");
						insert(value);
						return false;
					}
					
					
			}
			
			
			
	    }

 
