package com.hemebiotech.analytics.symptomReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class SymptomReader implements ISymptomReader {

	private String path;

	public SymptomReader(){}
	public SymptomReader(String path){
		setPath(path);
	}
	
	@Override
	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (path != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(path));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
}
