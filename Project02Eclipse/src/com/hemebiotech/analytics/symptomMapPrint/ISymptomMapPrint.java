package com.hemebiotech.analytics.symptomMapPrint;

import java.util.Map;

/**
 * @author Mo-BiuS
 * Anything that is tasked with printing a map
 * The path should have already been checked by an IAnalyticsCounter instance
 */
public interface ISymptomMapPrint {
	/**
	 * @param map that should be printed
	 */
	void setMap(Map<String, Integer> map);
	
	/**
	 * @param path where the data should be printed
	 */
	void setPath(String path);
	
	/**
	 * Print map at path
	 * @return false if unsuccessful
	 */
	boolean print();
}
