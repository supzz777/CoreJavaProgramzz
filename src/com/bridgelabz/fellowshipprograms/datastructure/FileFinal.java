package com.bridgelabz.fellowshipprograms.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class FileFinal 
{
	public static void main(String args[])throws Exception
	{
	    File file = new File("/home/admin28/Desktop/supzz");

	BufferedReader filereader = new BufferedReader(new FileReader(file));
	int count=0;
	String fileWords[];
	String lineOffileWords;
	 Utility.Unorderlist dataStructure= new  Utility.Unorderlist();

	while((lineOffileWords =filereader.readLine()) != null )
	{

	lineOffileWords+=filereader.readLine();
	System.out.println(lineOffileWords);

	fileWords=lineOffileWords.split(" ");

	for(int i=0;i<fileWords.length;i++)
	{
	dataStructure.insert(fileWords[i]);
	}

	System.out.println("data in list---->");
	dataStructure.display();
	System.out.println("Enter search word");
	String word = Utility.StringInput();
    dataStructure.search(word);
	System.out.println("list after search word---->");
	dataStructure.display();
	FileWriter fe=new FileWriter(file);
	String x="am";
	fe.write(dataStructure.search(x));
	System.out.println("list after search word---->");
	dataStructure.display();
	 }
	}
	
}
