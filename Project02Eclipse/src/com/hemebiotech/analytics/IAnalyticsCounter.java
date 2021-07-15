package com.hemebiotech.analytics;

/**
 * @author Mo-BiuS
 * Anything that will read symptom data from a source
 * Transform say data to a list containing :
 * String as key
 * Integer witch symbolize the number of say string from the source as value
 * Then print all of this data into a new file
 */
public interface IAnalyticsCounter {
	
	/**
	 * @param pathIn the path to the file containing that need to be studies
	 * @return false if file not found
	 */
	boolean setPathIn(String pathIn);
	
	/**
	 * @param pathOut the path where the studied data should be stored
	 * @return false if the file will be overridden
	 */
	boolean setPathOut(String pathOut);
	
	/**
	 * Will treat the data in the file at pathIn and print it in a new file at pathOut
	 * @return true if say print was successful
	 */
	boolean print();
}
