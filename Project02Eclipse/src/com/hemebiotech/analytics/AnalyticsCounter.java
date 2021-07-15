package com.hemebiotech.analytics;

import com.hemebiotech.analytics.symptomListToMap.*;
import com.hemebiotech.analytics.symptomMapPrint.*;
import com.hemebiotech.analytics.symptomMapSort.*;
import com.hemebiotech.analytics.symptomReader.*;

public class AnalyticsCounter implements IAnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomListToMap listToMap;
	private ISymptomMapSort mapSortKey;
	private ISymptomMapSort mapSortValue;
	private ISymptomMapPrint mapPrint;
	
	private String pathIn = null;
	private String pathOut = null;
	
	public AnalyticsCounter(){
		reader = new SymptomReader(pathIn);
		listToMap = new SymptomListToMap(reader.GetSymptoms());
		mapSortKey = new SymptomMapSort(listToMap.getMap(),SortType.KeyAscending);
		mapSortValue = new SymptomMapSort(mapSortKey.getSortedMap(),SortType.ValueAscending);
		mapPrint = new SymptomMapPrint(mapSortKey.getSortedMap(), pathOut);
	}
	
	@Override
	public boolean setPathIn(String pathIn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setPathOut(String pathOut) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean print() {
		// TODO Auto-generated method stub
		return false;
	}

}
