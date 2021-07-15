package com.hemebiotech;

import java.io.IOException;
import java.util.Scanner;

import com.hemebiotech.analytics.*;

public class Main {

	static IAnalyticsCounter analyticsCounter;
	
	static String in = "Project02Eclipse/symptoms.txt";
	static String out = "Project02Eclipse/result.out";
	
	public static void main(String[] args) {
		analyticsCounter = new AnalyticsCounter();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Type 0 to enter input into AnalyticsCounter");
		System.out.println("Type 1 for the demo of AnalyticsCounter");
		short i = sc.nextShort();
		
		if(i == 0) {
			System.out.println("Select path In : ");
			in = sc.next();
			
			if(analyticsCounter.setPathIn(in)) {
				System.out.println("PathIn found");
				System.out.println("Select pathOut : ");
				out = sc.next();
				
				if(!analyticsCounter.setPathOut(out)) {
					System.out.println(out + " already exist, should we ovveride it? y/n");
					char c = sc.next().charAt(0);
					analyticsCounter.setCanOverride(c=='y');
				}
				
				if(analyticsCounter.print())System.out.println("Print successful");
				else System.out.println("Print failed");
			}
			else System.out.println("PathIn not found");
		}
		else {
			analyticsCounter.setPathIn(in);
			System.out.println("path In : "+in);
			
			analyticsCounter.setPathOut(out);
			System.out.println("path Out : "+out);
			
			analyticsCounter.setCanOverride(true);
			System.out.println("overriting...");
			
			analyticsCounter.print();
			System.out.println("Printed");
			
			
			try {
				ProcessBuilder pb = new ProcessBuilder("Notepad.exe", out);
				pb.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
