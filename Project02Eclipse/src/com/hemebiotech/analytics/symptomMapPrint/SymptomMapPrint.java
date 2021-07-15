package com.hemebiotech.analytics.symptomMapPrint;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class SymptomMapPrint implements ISymptomMapPrint {

	private Map<String, Integer> map = null;
	private String path = null;
	
	public SymptomMapPrint(){}
	public SymptomMapPrint(Map<String, Integer> map, String path){
		setMap(map);
		setPath(path);
	}
	
	@Override
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	@Override
	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public boolean print() {
		FileWriter writer;
		try {
			writer = new FileWriter (path);
			for(Entry<String, Integer> data : map.entrySet()) {
				writer.write(data.getKey() +" : "+data.getValue()+"\n");
			}
			writer.close();
			return true;
			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}
