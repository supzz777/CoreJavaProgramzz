import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class ReadingNumbersFromFileAndStoringItIntoArray
{
	public static void main(String args[])
	{
		int[] num= readNumbersConvertIntoArray("/home/admin28/Desktop/FellowshipProgramsJavaSupzz/"
				+ "ChallengeDataStructures/OrderedListOfNumbers");
		//method 1- for displaying the array
		System.out.println(Arrays.toString(num)); 
		
		//method 2- for displaying the array
		System.out.println("elements inside the array are");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		} 
		  
	}
	 
	//this method reads the numbers from the given file and 
	// convert them into the array
		public static int[] readNumbersConvertIntoArray(String file)
		{
		
			try
			{
				File f= new File(file);
				Scanner s= new Scanner(new File(file));
				int count=0;
				//counting the numbers present inside the file
				while(s.hasNextInt())
				{
					
					count++;
					s.nextInt();
				}
				//creating the array of same number
				int[] arrayOfNumbers =new int[count];
				Scanner s1= new Scanner(new File(file));
				for(int i=0;i<arrayOfNumbers.length;i++)
				{
					arrayOfNumbers[i]=s1.nextInt();
				}
				return arrayOfNumbers;
			}
			catch (FileNotFoundException e)
			{
				System.out.println("file not found");
			}
			
			return null;
		} 
		 
			
		
}
