package com.lukasz;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @org.junit.jupiter.api.Test
    void equals_sameWord1() {
        Word word1 = new Word("test");
        Word word2 = new Word("test");

        assertTrue( word1.equals(word2) );
    }

    @org.junit.jupiter.api.Test
    void equals_sameWord2() {
        Word word1 = new Word("tset");
        Word word2 = new Word("test");

        assertTrue( word1.equals(word2) );
    }

    @org.junit.jupiter.api.Test
    void equals_sameWord3() {
        Word word1 = new Word("tset");
        Word word2 = new Word("etts");

        assertTrue( word1.equals(word2) );
    }

    @org.junit.jupiter.api.Test
    void equals_differentWord1() {
        Word word1 = new Word("test");
        Word word2 = new Word("tast");

        assertFalse( word1.equals(word2) );
    }

    @org.junit.jupiter.api.Test
    void equals_differentWord2() {
        Word word1 = new Word("test");
        Word word2 = new Word("teste");

        assertFalse( word1.equals(word2) );
    }


}