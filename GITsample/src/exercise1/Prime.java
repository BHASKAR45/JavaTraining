package com.cloudgensys.training.exercise1;

import java.util.Scanner;

public class Prime {
	 public static boolean isPrime(int a){
		 int count=0;
		 for(int i=2;i<a/2;i++){
			 if(a % i == 0){
				 	
	                return false;
	            }
	
		 }
		
   return true;

  }
	public static void main(String args[]){
		System.out.println("enter input number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long start=System.currentTimeMillis();
		System.out.println("List of prime numbers :");
		for(int i=2;i<n;i++){
			boolean prime=isPrime(i);
			if(prime){
				System.out.print(i +" ");
			}
		}
		long total=System.currentTimeMillis()-start;
		
		System.out.println("\ntotal program run time  :"+total);
	}

}

