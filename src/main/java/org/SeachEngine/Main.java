package org.SeachEngine;

import org.SeachEngine.model.DataSet;
import org.SeachEngine.model.Document;
import org.SeachEngine.model.Text;
import org.SeachEngine.service.SearchEngine;

//Doc1: apple is a fruit
//Doc2: apple, apple come on!
//Doc3: oranges are sour
//Doc4: apple-pie is sweet

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SearchEngine.searchEngineInstance.createDataSet("dataSet1");

        Document doc1 = new Document("doc1");
        Text text1 = new Text("apple", 0);
        Text text2 = new Text("is", 1);
        Text text3 = new Text("a", 2);
        Text text4 = new Text("fruit", 3);
        Text text5 = new Text("mango", 4);
        doc1.insertWord(text1);
        doc1.insertWord(text2);
        doc1.insertWord(text3);
        doc1.insertWord(text4);
        doc1.insertWord(text5);

        Document doc2 = new Document("doc2");
        doc2.insertWord(new Text("apple", 0));
        doc2.insertWord(new Text("fruit", 1));

        Document doc3 = new Document("doc3");
        doc3.insertWord(new Text("mango", 0));
        doc3.insertWord(new Text("fruit", 1));


        DataSet dataSet1 = SearchEngine.searchEngineInstance.getDataSet("dataSet1");
        dataSet1.insertDocument(doc1);
        dataSet1.insertDocument(doc2);
        dataSet1.insertDocument(doc3);
        dataSet1.searchKeyWord("is");

    }
}