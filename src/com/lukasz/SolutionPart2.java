package com.lukasz;

import java.util.*;

public class SolutionPart2 {
    private List<String> passphrases;
    private int numberOfValidPassphrases;

    public SolutionPart2(List<String> passphrases) {
        this.passphrases = passphrases;
        this.numberOfValidPassphrases = checkPassphrases();
    }

    private int checkPassphrases() {
        int sum = 0;

        ListIterator<String> i = passphrases.listIterator();
        while (i.hasNext()) {
            String currentPassphrase = i.next();

            if(passphraseValid(currentPassphrase))
                sum++;
        }

        return sum;
    }

    private static boolean passphraseValid(String line) {
        Set<Word> set = new HashSet<>();
        Scanner passphraseScanner = new Scanner(line);
        while (passphraseScanner.hasNext()) {
            String currentWord = passphraseScanner.next();
            Word word = new Word(currentWord);
            if(!set.add(word)) {
                return false;
            }
        }

        return true;
    }


    public int getNumberOfValidPassphrases() {
        return numberOfValidPassphrases;
    }
}
