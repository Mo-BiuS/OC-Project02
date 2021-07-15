package com.hemebiotech.analytics.symptomMapSort;

import java.util.Map;

/**
 * @author Mo-BiuS 
 * Anything tasked to sort a map by a set of rule defined by SortType
 */
public interface ISymptomMapSort {
	/**
	 * @param map that need to be sorted
	 */
	void setMap(Map<String, Integer> map);
	
	/**
	 * @param sortType the kind of sort needed
	 */
	void setSortType(SortType sortType);
	
	/**
	 * @return a sorted map according to the sortType
	 */
	Map<String, Integer> getSortedMap();
}
