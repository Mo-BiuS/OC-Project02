package com.hemebiotech.analytics.symptomMapSort;

import java.util.Map;

public class SymptomMapSort implements ISymptomMapSort {
	
	private Map<String, Integer> map = null;
	private SortType sortType = null;
	
	public SymptomMapSort() {}
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
		// TODO Auto-generated method stub
		return map;
	}

}
