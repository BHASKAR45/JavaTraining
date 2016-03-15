package com.cloudgensys.training;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class FileReadingLine {
	
	
public static void main(String[] args) throws Exception{
		
	    try{
	    	FileInputStream fstream = new FileInputStream("C://Users/CG5/Desktop/sampleFF.txt");
	    	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

	    	String strLine;
	    	
	    	while ((strLine = br.readLine()) != null)   {
	    	
	    	  System.out.println (strLine);
	    	}

	    	br.close();	    	
	    }
	    catch (FileNotFoundException e){
	    	System.out.println("File Not Found");
	    }

}

	
	
	}


