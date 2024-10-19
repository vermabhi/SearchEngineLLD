package org.SeachEngine.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Document {
    private String documentId;
    private Map<String, Integer> texts;
    private int wordCounter;

    public Document(String documentId){
        this.documentId = documentId;
        this.texts = new HashMap<>();
        this.wordCounter = 0;
    }

    public void insertWord(Text text){
        int counter = 0;
        if(texts.containsKey(text.getWord())){
            counter = texts.get(text.getWord());
        }
        texts.put(text.getWord(), counter+1);
        wordCounter++;
        System.out.println("Word inserted!!");
    }


    public int searchWord(String keyWord){
        if(texts.containsKey(keyWord)){
            return wordCounter;
        }
        return 0;
    }
}



