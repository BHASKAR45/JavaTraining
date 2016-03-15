package com.cloudgensys.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionSample {
	public static void main(String[] args) throws Exception{
		
	    try{
		FileInputStream input=new FileInputStream("C://Users/CG5/sampleFF.txt");
		int c;
		while((c=input.read())!=-1)
		{
			System.out.print(Character.toString ((char) c));
		}
	    }
	    catch (FileNotFoundException e){
	    	System.out.println();
	    }

}
}


