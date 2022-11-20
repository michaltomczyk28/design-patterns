package com.michaltomczyk.decorator.text;

public abstract class TextSourceDecorator implements TextSource {
    private final TextSource wrapped;

    public TextSourceDecorator(TextSource wrapped){
        this.wrapped = wrapped;
    }

    @Override
    public String write(String text){
        return this.wrapped.write(text);
    }

    @Override
    public String read(){
        return this.wrapped.read();
    }
}
