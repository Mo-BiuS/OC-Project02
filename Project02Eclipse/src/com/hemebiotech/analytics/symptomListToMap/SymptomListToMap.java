package com.hemebiotech.analytics.symptomListToMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymptomListToMap implements ISymptomListToMap {

	List<String> list = null;
	
	public SymptomListToMap(List<String> list){
		setList(list);
	}
	
	@Override
	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public Map<String, Integer> getMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String str : list) {
			if(map.containsKey(str))map.replace(str, map.get(str), map.get(str)+1);
			else map.put(str, 1);
		}
		
		return map;
	}

}
