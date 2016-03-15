package com.cloudgensys.training;

public class OrderOfN {
	public static void main(String args[]){
		float start = System.nanoTime();
		System.out.println("Current time:" +start);
		for(int j=0; j<100; j++){
			System.out.println("iteration count :" +j);
		}
		float total = System.nanoTime()-start;
		System.out.println("total execution time" +total);
	}
	

}
