package com.bridgelabz.fellowshipprograms.algorithm;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtility 
{
	
	

		private final String REGEX_NAME = "<<name>>";
		private final String REGEX_FULLNAME = "<<full name>> ";
		private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
		private final String REGEX_DATE = "01/01/2016";

		BufferedReader bufferedReader,br;
		public RegexUtility(){
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String inputWord(){
			try{
				return bufferedReader.readLine();
			}
			catch(IOException exception){
				System.out.println(exception.getMessage());
			}
			return "";
		}
		
		public String getFileText(String fileName) throws IOException{


				br=new BufferedReader(new FileReader(fileName));
				StringBuilder sb=new StringBuilder();
				String line=br.readLine();
				while(line!=null){
					sb.append(line);
					sb.append(System.lineSeparator());
					line=br.readLine();
				}
				return sb.toString();
			 }
			
			
			

		
		//format date object in this format 01/12/2016 
		public String getFormatedDate(Date date){
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			return sdf.format(date);
		}

		public String convertString(UserDetails userDetails,String message){
			Pattern p = Pattern.compile(REGEX_NAME);
	       		Matcher m = p.matcher(message); 
	       		message = m.replaceAll(userDetails.getfName());

			p = Pattern.compile(REGEX_FULLNAME);
			m = p.matcher(message); 
			message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

			p = Pattern.compile(REGEX_MOBILE_NO);
			m = p.matcher(message); 
			message = m.replaceAll(userDetails.mobileNo());

			p = Pattern.compile(REGEX_DATE);
			m = p.matcher(message); 
			message = m.replaceAll(userDetails.date());

			return message;
		}

	
	
}
