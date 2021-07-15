package com.hemebiotech;

import com.hemebiotech.analytics.*;

public class Main {

	static IAnalyticsCounter analyticsCounter;
	
	static String in = "Project02Eclipse/symptoms.txt";
	static String out = "Project02Eclipse/result.out";
	
	public static void main(String[] args) {
		analyticsCounter = new AnalyticsCounter();
		
		if(analyticsCounter.setPathIn(in)) {
			System.out.println("PathIn found");
			
			if(analyticsCounter.setPathOut(out)) System.out.println("Print will not override");
			else System.out.println("Print will override");
				
			if(analyticsCounter.print())System.out.println("Print successful");
			else System.out.println("Print failed");
		}
		else System.out.println("PathIn not found");
	}

}
