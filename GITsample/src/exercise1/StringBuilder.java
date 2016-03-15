package com.cloudgensys.training.exercise1;

public class StringBuilder {
	public static void main(String a[])
	{
		long start=System.currentTimeMillis();
		String s = "HI";
		for(int i=0;i<=10000;i++)
		{
			s=s+ " "+i;
		}
		System.out.println(s);
		long total=System.currentTimeMillis()-start;
		System.out.println("\ntotal program run time  :"+total);
	}
	

}
