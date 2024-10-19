package org.SeachEngine.service;

import org.SeachEngine.model.DataSet;

import java.util.HashMap;
import java.util.Map;

public class SearchEngine {
    private Map<String, DataSet> dataSets;

    public static SearchEngine searchEngineInstance = new SearchEngine();;

    public SearchEngine(){
        dataSets = new HashMap<>();
    }

    public DataSet getDataSet(String dataSetId){
        if(dataSets.containsKey(dataSetId)){
            return dataSets.get(dataSetId);
        }
        System.out.println("data set not exist!!");
        return null;
    }

    public void createDataSet(String dataSetId){
        if(dataSets.containsKey(dataSetId)) {
            System.out.println("Data Set already exist!!");
            return;
        }
        dataSets.put(dataSetId, new DataSet(dataSetId));
        System.out.println("data set created!!");
    }
}
