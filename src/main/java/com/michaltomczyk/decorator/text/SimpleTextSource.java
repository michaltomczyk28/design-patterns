package com.michaltomczyk.decorator.text;

public class SimpleTextSource implements TextSource{
    protected String text;

    public String write(String text) {
        this.text = text;

        return this.text;
    }

    public String read() {
        return this.text;
    }
}
