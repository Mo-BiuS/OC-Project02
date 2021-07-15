package com.hemebiotech.analytics.symptomMapPrint;

import java.util.Map;

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
		// TODO Auto-generated method stub
		return false;
	}

}
