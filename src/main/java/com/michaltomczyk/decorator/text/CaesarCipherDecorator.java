package com.michaltomczyk.decorator.text;

public class CaesarCipherDecorator extends TextSourceDecorator {
    public CaesarCipherDecorator(TextSource textSource) {
        super(textSource);
    }

    @Override
    public String write(String text) {
        String result = applyCaesarCipher(text, 3);
        return super.write(result);
    }

    @Override
    public String read(){
        String text = super.read();
        return applyCaesarCipher(text, -3);
    }

    private String applyCaesarCipher(String text, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
