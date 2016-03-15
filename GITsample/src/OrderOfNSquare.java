package com.cloudgensys.training;

public class OrderOfNSquare {
	public static void main(String args[]){
		float start = System.nanoTime();
		for(int i=1; i<=100; i++){
			for(int j=1;j<=100;j++){
			System.out.println("Iteration count:" +j);
		}
	}
	float total = System.nanoTime()-start;
	System.out.println("total execution time :" +total);
		}
}