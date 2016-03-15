package com.cloudgensys.training;

public class StringBuild {

	
	public static void main(String a[])
	{
		long start=System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("hello");
		for(int i=0;i<=10000;i++)
		{
			sb.append(1);
		}
		System.out.println(sb);
		long total=System.currentTimeMillis()-start;
		System.out.println("\ntotal program run time  :"+total);
	}
	
	}
