package com.hemebiotech.analytics.symptomListToMap;

import java.util.List;
import java.util.Map;

/**
 * @author Mo-BiuS
 * Anything that will transform a List of string to a map that count each occurrence of individual string in say list
 */
public interface ISymptomListToMap {
	/**
	 * @param list to be studied
	 */
	void setList(List<String> list);
	
	/**
	 * @return studied map
	 */
	Map<String, Integer> getMap();
}
