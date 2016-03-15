package com.cloudgensys.training.exercise3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;


public class FileHandling {
	
	public static void main(String[] args) throws Exception{
		
	
		
			FileInputStream input=new FileInputStream("C://User/CG7/workspace/JavaTraining/src/com/cloudgensys/training/exercise3/file.txt");
			int c;
			while((c=input.read())!=-1)
			{
				System.out.print(Character.toString ((char) c));
			}
		
				
	}

}
