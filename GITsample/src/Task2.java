package com.cloudgensys.training;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.*;
import java.io.*;

public class Task2 {
	
	 public static void main(String[] args) {
	       char []c=new char[90];
	      try{            
	    	  FileInputStream input;
	  		input = new FileInputStream("C://Users/CG5/Desktop/Bhaskar.txt");
	  		BufferedReader br = new BufferedReader(new InputStreamReader(input));
	      	StringBuilder sb = new StringBuilder();
	     br.read(c);
	    if(c.length<100){
	          String p="(.*)";
	       Pattern p1=Pattern.compile("(.*)");
	       String k = null;
	       Matcher m = null;
	       m=p1.matcher("B");
	     if(m.find()){
	    System.out.println(m.group());
	    }
	    }
	    br.close();
	      }
	       catch(Exception e)
	       {
	      e.printStackTrace();
	       }
	      }
	}


