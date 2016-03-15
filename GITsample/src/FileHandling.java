package com.cloudgensys.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		
		
		
		FileInputStream input;
		try {
			input = new FileInputStream("C://Users/CG5/Desktop/sampleFF.txt");
			int c;
			try {
				while((c=input.read())!=-1)
				{
					System.out.print(Character.toString ((char) c));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
			
}

}
