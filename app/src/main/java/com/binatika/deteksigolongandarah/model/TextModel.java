package com.binatika.deteksigolongandarah.model;

import java.io.Serializable;

/**
 * Created by deny on bandung.
 */

public class TextModel implements Serializable {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
