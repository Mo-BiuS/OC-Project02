package com.hemebiotech;

import com.hemebiotech.analytics.*;

public class Main {

	static IAnalyticsCounter analyticsCounter;
	
	public static void main(String[] args) {
		analyticsCounter = new AnalyticsCounter();
		
		if(analyticsCounter.setPathIn(null)) {
			System.out.println("PathIn found");
			
			if(analyticsCounter.setPathOut(null)) System.out.println("Print will not override");
			else System.out.println("Print will override");
				
			if(analyticsCounter.print())System.out.println("Print successful");
			else System.out.println("Print failed");
		}
		else System.out.println("PathIn not found");
	}

}
