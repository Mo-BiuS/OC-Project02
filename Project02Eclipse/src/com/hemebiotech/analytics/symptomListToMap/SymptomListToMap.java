package com.hemebiotech.analytics.symptomListToMap;

import java.util.List;
import java.util.Map;

public class SymptomListToMap implements ISymptomListToMap {

	List<String> list = null;
	
	public SymptomListToMap(){}
	public SymptomListToMap(List<String> list){
		setList(list);
	}
	
	@Override
	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public Map<String, Integer> getMap() {
		// TODO Auto-generated method stub
		return null;
	}

}
