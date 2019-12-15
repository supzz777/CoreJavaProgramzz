import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author admin28
 *
 */
/**
 * @author admin28  
 * 
 */
public class ReadingTextFromFileAndStoringItIntoArray 
{
	
	public static void main(String args[])
	{ 
		
		String text= readString("/home/admin28/Desktop/FellowshipProgramsJavaSupzz/"
				+ "ChallengeDataStructures/UnorderedListOfStrings.text");
		System.out.println(text);
		
		String[] fileArray=storeArray("/home/admin28/Desktop/FellowshipProgramsJavaSupzz/"
				+ "ChallengeDataStructures/UnorderedListOfStrings.text");
		
		for(int i=0; i<fileArray.length;i++)
		{
			
			System.out.println(fileArray[i]); 
		} 
	}

	
	//this method reads the context from the given file
		public static String readString(String file)
		{ String text=" ";
			try
			{
				Scanner s= new Scanner(new File(file));
				while(s.hasNextLine())
				{
					text+=s.next()+ " ";
				} 
				
			}
			catch (FileNotFoundException e)
			{
				System.out.println("file not found");
			}
			
			return text;
		}
		
		// this method will take string parameters from the given file and 
		// will copy the context into the array of strings
		
		public static String[] storeArray(String file)
		{
			// step 1- counting the number of elements in the file
			// step 2- creating the array with same no of elements and copying
			//         the contents inside the array
			
			int count=0;
			try
			{
				Scanner s1= new Scanner (new File(file)); 
				while(s1.hasNextLine())
				{
					count++;
					s1.next();
				}
				
				String[] fileArray = new String[count];
				
				Scanner s2= new Scanner(new File(file));
				for(int i=0;i<count;i++)
				{
					fileArray[i]=s2.next();
				}
				return fileArray;
				 
			}
			catch (FileNotFoundException e)
			{
				
			}
			
			return null;
		}
		

}
