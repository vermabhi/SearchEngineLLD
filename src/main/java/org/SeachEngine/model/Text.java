package org.SeachEngine.model;

import lombok.Getter;

@Getter
public class Text {
    private String word;
    private int index;

    public Text(String word, int index){
        this.index = index;
        this.word = word;
    }

}

