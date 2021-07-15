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
		
	}
	
	@Override
	public boolean setPathIn(String pathIn) {
		this.pathIn = pathIn;
		return true;
	}

	@Override
	public boolean setPathOut(String pathOut) {
		this.pathOut = pathOut;
		return true;
	}

	@Override
	public boolean print() {
		reader = new SymptomReader(pathIn);
		listToMap = new SymptomListToMap(reader.GetSymptoms());
		mapSortKey = new SymptomMapSort(listToMap.getMap(),SortType.KeyAscending);
		mapSortValue = new SymptomMapSort(mapSortKey.getSortedMap(),SortType.ValueAscending);
		mapPrint = new SymptomMapPrint(mapSortValue.getSortedMap(), pathOut);
		
		return mapPrint.print();
	}

}
