package com.lukasz;

import java.util.Arrays;

public class Word {
    int[] charsNumber;

    public Word(String word) {
        charsNumber = new int[128];
        fillTableOfChars(word);
    }

    private void fillTableOfChars(String word) {
        for(int i = 0; i < word.length(); i++) {
            addCharToTable(word.charAt(i));
        }
    }

    private void addCharToTable(char ch) {
        charsNumber[ch]++;
    }

    public int[] getCharsNumber() {
        return charsNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return Arrays.equals(this.charsNumber, ((Word) obj).getCharsNumber());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(charsNumber);
    }
}
