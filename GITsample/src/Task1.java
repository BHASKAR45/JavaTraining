package com.cloudgensys.training;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) throws IOException {
		try{
			FileInputStream input;
			input = new FileInputStream("C://Users/CG5/Desktop/Bhaskar.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
	    	String Line;
	    	Line = br.readLine();
	    	StringBuilder fileContent = new StringBuilder();
	    	
			while (Line != null)   {
			
			  fileContent.append(Line);
			  Line = br.readLine();
			  
			}			
			Pattern pattern = Pattern.compile("<username>(.+)</username>");
			Matcher matcher=pattern.matcher(fileContent);
			if(matcher.find()){
				if(matcher.find()){
					System.out.println(matcher.group(1));
				}
				
			}
			
			pattern = Pattern.compile("<userId>(.+)</userId>");
			matcher=pattern.matcher(fileContent);
			if(matcher.find()){
				System.out.println(matcher.group(1));
			}
			pattern = Pattern.compile("<contact>(.+)</contact>");
			matcher=pattern.matcher(fileContent);
			if(matcher.find()){
				System.out.println(matcher.group(1));
			}
			
			else{
				System.out.println(" NOT Match");
			}
		}catch (FileNotFoundException e){
	    	System.out.println("File Not Found");
	    }
		catch (IOException e){
			System.out.println("Cannot read the file");
		}
		
	}
}

    	


		