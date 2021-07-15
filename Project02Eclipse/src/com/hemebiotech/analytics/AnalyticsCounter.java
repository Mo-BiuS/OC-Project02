package com.hemebiotech.analytics;

import java.io.File;

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
	
	private boolean willOverride = false;
	
	@Override
	public boolean setPathIn(String pathIn) {
		if(fileExist(pathIn)){
			this.pathIn = pathIn;
			return true;
			
		}else return false;
		
	}

	@Override
	public boolean setPathOut(String pathOut) {
		this.pathOut = pathOut;
		return (willOverride = fileExist(pathIn));
	}

	@Override
	public boolean print() {
		if(fileExist(pathIn) && pathOut != null) {
			reader = new SymptomReader(pathIn);
			listToMap = new SymptomListToMap(reader.GetSymptoms());
			mapSortKey = new SymptomMapSort(listToMap.getMap(),SortType.KeyAscending);
			mapSortValue = new SymptomMapSort(mapSortKey.getSortedMap(),SortType.ValueAscending);
			mapPrint = new SymptomMapPrint(mapSortValue.getSortedMap(), pathOut);
			
			return mapPrint.print();
		}
		else return false;
	}
	
	public boolean fileExist(String path) {
		if (path != null) return (new File(path)).exists();
		else return false;
	}
}
