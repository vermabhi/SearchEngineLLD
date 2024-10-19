package org.SeachEngine.model;

import java.util.*;

public class DataSet {
    private String dataSetID;
    private Map<String, Document> documents;

    public DataSet(String dataSetID){
        this.dataSetID = dataSetID;
        documents = new HashMap<>();
    }
    public void insertDocument(Document document){
        String documentId = document.getDocumentId();
        if(documents.containsKey(documentId)){
            System.out.println("Doc already exists!!");
            return;
        }
        documents.put(documentId, document);
        System.out.println("doc inserted!!");
    }

    public void deleteDocument(String documentId){
        if(!documents.containsKey(documentId)){
            System.out.println("Doc doesn't exists!!");
            return;
        }
        documents.remove(documentId);
        System.out.println("doc deleted!!");
    }

    public void searchKeyWord(String keyWord){
        List<String> searchResult = new ArrayList<>();
        documents.forEach((documentId, document) -> {
            if(document.searchWord(keyWord) > 0){
                searchResult.add(documentId);
            }
        });
        searchResult.forEach((documentId)->{
            System.out.println(documentId);
        });
    }
}
