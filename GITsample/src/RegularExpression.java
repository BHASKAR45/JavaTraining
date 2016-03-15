package com.cloudgensys.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String t = "it was the best of times";
		Pattern pattern = Pattern.compile("(.t?)");
		Matcher matcher=pattern.matcher(t);
		if(matcher.find()){
			System.out.println("FOUND MATCH");
		}
		else{
			System.out.println("Not Found Match");
		}
		
	}

}
