package com.hemebiotech.analytics.symptomMapSort;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SymptomMapSort implements ISymptomMapSort {
	
	private Map<String, Integer> map = null;
	private SortType sortType = null;
	
	public SymptomMapSort(Map<String, Integer> map, SortType sortType) {
		setMap(map);
		setSortType(sortType);
	}
	
	@Override
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	@Override
	public void setSortType(SortType sortType) {
		this.sortType = sortType;
	}

	@Override
	public Map<String, Integer> getSortedMap() {
		if(sortType != null) {
			switch (sortType) {
			case KeyAscending:
				return sortKeyAscending();
			case ValueAscending:
				return sortValueAscending();
			default:
				return null;
			}
		}else return null;
	}

	private Map<String, Integer> sortKeyAscending() {
		return map.entrySet().stream()
			   .sorted(Map.Entry.comparingByKey()) 			
			   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
			   (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	}
	private Map<String, Integer> sortValueAscending() {
		return map.entrySet().stream()
				  .sorted(Map.Entry.comparingByValue()) 			
				  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				  (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	}
}
